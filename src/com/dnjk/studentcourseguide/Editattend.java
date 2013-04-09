package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;

public class Editattend extends Activity {

		
	public void initialise(){
		
		
	}
	int yCount=0,aCount=0;
	
	public void disabler(View v){
		
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
		
		switch(v.getId()){
		case R.id.yes1: 
			if(y1.isChecked()==true){
			if(a1.isChecked()){
				a1.toggle();
				a1.setClickable(false);
			}}
			else if(y1.isChecked()==true){
				if(a1.isChecked()){
					a1.setClickable(true);
				}
				
			}
			
					
		
		case R.id.yes2: 
			if(y2.isChecked()==true){
				if(a2.isChecked()){
					a2.toggle();
					a2.setClickable(false);
				}}
				else if(y2.isChecked()==true){
					if(a2.isChecked()){
						a2.setClickable(true);
					}
					
				}
		case R.id.yes3:
			if(y3.isChecked()==true){
				if(a3.isChecked()){
					a3.toggle();
					a3.setClickable(false);
				}}
				else if(y3.isChecked()==true){
					if(a3.isChecked()){
						a3.setClickable(true);
					}
					
				}
		case R.id.yes4:
			if(y4.isChecked()==true){
				if(a4.isChecked()){
					a4.toggle();
					a4.setClickable(false);
				}}
				else if(y4.isChecked()==true){
					if(a4.isChecked()){
						a4.setClickable(true);
					}
					
				}
		case R.id.yes5:
			if(y5.isChecked()==true){
				if(a5.isChecked()){
					a5.toggle();
					a5.setClickable(false);
				}}
				else if(y5.isChecked()==true){
					if(a5.isChecked()){
						a5.setClickable(true);
					}
					
				}
		case R.id.yes6: 
			if(y6.isChecked()==true){
				if(a6.isChecked()){
					a6.toggle();
					a6.setClickable(false);
				}}
				else if(y6.isChecked()==true){
					if(a6.isChecked()){
						a6.setClickable(true);
					}
					
				}
		
		}
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editattend);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.editattend, menu);
		return true;
	}

}
