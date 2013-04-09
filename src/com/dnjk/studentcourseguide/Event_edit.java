package com.dnjk.studentcourseguide;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

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
		String type;
		int checkedId;
		
		RadioGroup Typeselect=(RadioGroup)findViewById(R.id.event_edit_type);
		checkedId=Typeselect.getCheckedRadioButtonId();
		
		RadioButton rb=(RadioButton)findViewById(checkedId);
		type=rb.getText().toString();
		
		Calendar cal = Calendar.getInstance();              
		Intent intent = new Intent(Intent.ACTION_EDIT);
		intent.setType("vnd.android.cursor.item/event");
		intent.putExtra("beginTime", cal.getTimeInMillis());
		intent.putExtra("allDay", false);
		intent.putExtra("rrule", "FREQ=DAILY");
		intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
		intent.putExtra("title", name);
		startActivity(intent);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_edit, menu);
		return true;
	}

}
