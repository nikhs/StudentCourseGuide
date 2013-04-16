package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Attend_summary extends Activity {
	SQLiteDatabase DB;
	int at=0,tot=0;
	TextView tvperc,tvatt,tvtot;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attend_summary);
		tvperc=(TextView) findViewById(R.id.tvperc);
		tvatt=(TextView) findViewById(R.id.tvatt);
		tvtot=(TextView) findViewById(R.id.tvtotal);
		
		DB=this.openOrCreateDatabase("DB", MODE_PRIVATE, null);
		Cursor c= DB.rawQuery("SELECT Att,Total FROM Attendence",null);
    
		if (c != null ) {
		    if  (c.moveToFirst()) {
		          do {
		        	  
		          int a= c.getInt(c.getColumnIndex("Att"));
		          at+=a;
		          a= c.getInt(c.getColumnIndex("Total"));
		          tot+=a;
		          }while (c.moveToNext());
		    } 
		}
		tvperc.setText(""+((float)((float)at/(float)tot)*100)+"%");
		tvatt.setText(""+at);
		tvtot.setText(""+tot);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.attend_summary, menu);
		return true;
	}

}
