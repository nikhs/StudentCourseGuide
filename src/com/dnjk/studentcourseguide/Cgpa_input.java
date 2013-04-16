package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cgpa_input extends Activity {
Intent i=getIntent();
public final static String EXTRA_MESSAGE = "com.dnkj.studentcousreguide.MESSAGE";
Button csave;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cgpa_input);
		csave=(Button)findViewById(R.id.cgpasave);
	
		csave.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				float sum;
				sum=savecgpa();
				Toast.makeText(getApplicationContext(), "CGPA is"+sum, Toast.LENGTH_LONG).show();
				i=new Intent(getApplicationContext(),Cgpa_sum.class);
				i.putExtra(EXTRA_MESSAGE,sum);
				finish();
				
			}
			
		});
		
	}
		@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cgpa_input, menu);
		return true;
	
	
	}
	public float savecgpa(){
		float sum,S12,S3,S4,S5,S6,S7,S8;
		sum=S12=S3=S4=S5=S6=S7=S8=0;
		S12=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_12)).getText().toString());
		S3=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_3)).getText().toString());
		S4=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_4)).getText().toString());
		S5=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_5)).getText().toString());
		S6=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_6)).getText().toString());
		S7=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_7)).getText().toString());
		S8=Float.valueOf(((EditText)findViewById(R.id.cgpa_input_8)).getText().toString());
		sum=(((S12*38)+(S3*28)+(S4*28)+(S5*28)+(S6*28)+(S7*28)+(S8*28))/206);
		return sum;
		
		
		}
}
