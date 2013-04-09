package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class Event_edit extends Activity {
Intent i=getIntent();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_edit);
	
	
	}

	public void setevent(View v){
		EditText event=(EditText)findViewById(R.id.event_edit_name);
		DatePicker datepick=(DatePicker) findViewById(R.id.event_pick_date);
		String name=event.getText().toString();
		int day, month, year;
		day=datepick.getDayOfMonth();
		month=datepick.getMonth();
		year=datepick.getYear();
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_edit, menu);
		return true;
	}

}
