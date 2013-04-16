package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Editattend extends Activity {

	SQLiteDatabase DB;
	Button save,bt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editattend);
		DB=this.openOrCreateDatabase("DB", MODE_PRIVATE, null);
		DB.execSQL("CREATE TABLE IF NOT EXISTS Attendence (Day VARCHAR,Month VARCHAR,Att VARCHAR,Total VARCHAR);");
	
		save=(Button) findViewById(R.id.saveatt);
		/*bt=(Button) findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
					DB.execSQL("DELETE FROM Attendence;");
				
				
			}
		});*/
		save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				calculate();
				Toast.makeText(getApplicationContext(), "Attendance Updated", Toast.LENGTH_LONG).show();
				Intent i=new Intent(Editattend.this, Attendance.class);
				startActivity(i);
				finish();
			}
		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.editattend, menu);
		return true;
	}

	
		
		
		
	
	
	
	public void disabler(){
		
	}
	
	public void calculate(){
		
		
		int ycount=0,acount=0;
		CheckBox y1= (CheckBox) findViewById(R.id.yes1);
		CheckBox y2= (CheckBox) findViewById(R.id.yes2);
		CheckBox y3= (CheckBox) findViewById(R.id.yes3);
		CheckBox y4= (CheckBox) findViewById(R.id.yes4);
		CheckBox y5= (CheckBox) findViewById(R.id.yes5);
		CheckBox y6= (CheckBox) findViewById(R.id.yes6);
		
		CheckBox a1= (CheckBox) findViewById(R.id.att1);
		CheckBox a2= (CheckBox) findViewById(R.id.att2);
		CheckBox a3= (CheckBox) findViewById(R.id.att3);
		CheckBox a4= (CheckBox) findViewById(R.id.att4);
		CheckBox a5= (CheckBox) findViewById(R.id.att5);
		CheckBox a6= (CheckBox) findViewById(R.id.att6);
		int month,day;
		Time today = new Time();
		
		String dayS,monthS,ycountS,acountS;
		
		
			today.setToNow();
			day=today.monthDay;
			month=today.month;
			
			TextView dateshow=(TextView) findViewById(R.id.attend_edit_showdate);
			//dateshow.setText(""+day+" "+month);
		
		
		
		if (!y1.isChecked()) a1.setChecked(false);
		if (!y2.isChecked()) a2.setChecked(false);
		if (!y3.isChecked()) a3.setChecked(false);
		if (!y4.isChecked()) a4.setChecked(false);
		if (!y5.isChecked()) a5.setChecked(false);
		if (!y6.isChecked()) a6.setChecked(false);
	
	if (y1.isChecked())ycount++;
	if (y2.isChecked())ycount++;
	if (y3.isChecked())ycount++;
	if (y4.isChecked())ycount++;
	if (y5.isChecked())ycount++;
	if (y6.isChecked())ycount++;
	
	if(a1.isChecked())acount++;
	if(a2.isChecked())acount++;
	if(a3.isChecked())acount++;
	if(a4.isChecked())acount++;
	if(a5.isChecked())acount++;
	if(a6.isChecked())acount++;
	
	
	AttendData entry=new AttendData(Editattend.this);
	dayS=Integer.toString(day);
	monthS=Integer.toString(month);
	ycountS=Integer.toString(ycount);
	acountS=Integer.toString(acount);
	DB.execSQL("INSERT INTO Attendence Values('"+dayS+"','"+monthS+"','"+acountS+"','"+ycountS+"');");
	/*try{
	entry.open();
	entry.createEntry(dayS,monthS,acountS,ycountS);
	entry.close();
	}catch(Exception e){
		dbwrite=false;
	}finally{
		if(dbwrite){
			Dialog d=new Dialog(this);
			d.setTitle("DB WRITE");
			TextView tv= new TextView(this);
			tv.setText("Data Stored for "+dayS+" of month "+monthS+" with Attendance "+acountS+"/"+ycountS);
			d.setContentView(tv);
			d.show();
		}
	}*/
	
	}
				
		
	

}
