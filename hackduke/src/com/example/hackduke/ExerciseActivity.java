package com.example.hackduke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ExerciseActivity extends Activity {
    private int calorie;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exercise);
	}
	public void toCalorie(View view) {
		Intent intent = new Intent(this, FoodCalorieTrackerActivity.class);
		intent.putExtra("calorie", calorie);
		startActivity(intent);
	}
	
	public void dropdown_exercise() {
	
	Spinner spinner = (Spinner) findViewById(R.id.workout_spinner);
	// Create an ArrayAdapter using the string array and a default spinner layout
	ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
	        R.array.workout_array, android.R.layout.simple_spinner_item);
	// Specify the layout to use when the list of choices appears
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	// Apply the adapter to the spinner
	spinner.setAdapter(adapter);
	
	}
	
	public void dropdown_time() {
	
	Spinner spinner = (Spinner) findViewById(R.id.time_spinner);
	// Create an ArrayAdapter using the string array and a default spinner layout
	ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
	        R.array.time_array, android.R.layout.simple_spinner_item);
	// Specify the layout to use when the list of choices appears
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	// Apply the adapter to the spinner
	spinner.setAdapter(adapter);
	
	}
}
