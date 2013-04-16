package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Attendance extends Activity {

	Intent i = getIntent();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attendance);
		
		
		Button mark = (Button)findViewById(R.id.mrktdy);
		mark.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	
				i = new Intent(getApplicationContext(), Editattend.class);
				startActivity(i);
			}
		});
	

		
		Button summary = (Button)findViewById(R.id.smryattend);
		summary.setOnClickListener(new OnClickListener(){
			
			
			@Override
			public void onClick(View v) {
				Intent i=getIntent();
				i=new Intent(getApplicationContext(),Attend_summary.class);
				startActivity(i);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.attendance, menu);
		return true;
	}

}
