package com.example.hackduke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BMIInputActivity extends Activity{
	
	private int weight;
	private double height;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bmiinput);
	}
	
	public void toMainScreen(View view) {
		Intent intent = new Intent(this, BMICalculatorActivity.class);
		intent.putExtra("weight", weight);
		intent.putExtra("height", height);
        startActivity(intent);
	}
	
}
