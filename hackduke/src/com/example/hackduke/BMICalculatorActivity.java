package com.example.hackduke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BMICalculatorActivity extends Activity{
	
	public int height;
	public int weight;
	public static double bmi;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bmicalculator);
		//get it from bmiinput
		Intent i = getIntent();
		height = i.getExtras().getInt("height");
		weight = i.getExtras().getInt("weight");
		
	}
	
	public void toMainScreen(View view) {
		Intent intent = new Intent(this, ExerciseActivity.class);
        startActivity(intent);
	}
	
	public void bmi() {
		bmi = (weight/Math.pow(height,2))*703;
	}
	

}
