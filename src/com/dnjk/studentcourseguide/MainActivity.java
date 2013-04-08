package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Intent i = getIntent();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		Button attend = (Button)findViewById(R.id.attmain);
		attend.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				i = new Intent(getApplicationContext(), Attendance.class);
				startActivity(i);
			}
		});
		Button mark = (Button)findViewById(R.id.entmain);
		mark.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	
				i = new Intent(getApplicationContext(), Event_main.class);
				startActivity(i);
			}
		});
	

		Button cgpa = (Button)findViewById(R.id.cgpamain);
		cgpa.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = getIntent();
				i = new Intent(getApplicationContext(), Cgpa_main.class);
				startActivity(i);
			}
		});
	}

	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
