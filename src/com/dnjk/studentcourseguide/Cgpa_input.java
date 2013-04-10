package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Cgpa_input extends Activity {
Intent i=getIntent();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cgpa_input);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cgpa_input, menu);
		return true;
	}
	public void savecgpa(View v){
		float sum,S12,S3,S4,S5,S6,S7,S8;
		sum=S12=S3=S4=S5=S6=S7=S8=0;
		S12=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_12)).getText().toString());
		S3=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_3)).getText().toString());
		S4=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_4)).getText().toString());
		S5=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_5)).getText().toString());
		S6=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_6)).getText().toString());
		S7=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_7)).getText().toString());
		S8=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_8)).getText().toString());
		sum=S12+S3+S4+S5+S6+S7+S8;
		
		
		
		}
}
