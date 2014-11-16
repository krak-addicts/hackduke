package com.example.hackduke;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FoodCalorieTrackerActivity extends Activity {
    private int caloriesToBurn;
    private int height = BMICalculatorActivity.height;
    private int weight = BMICalculatorActivity.weight;
    private double bmr = 447.593 + (9.247*weight) + (3.098*height) - (4.330*20);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcalorietracker);
    }

    public int caloriesGain() {
        TextView lose = (TextView)findViewById(R.id.lose);
        lose.setText(((Integer)caloriesLose()).toString());
        TextView gain = (TextView)findViewById(R.id.gain);
        gain.setText(((Integer)caloriesGain()).toString());
        TextView maintain = (TextView)findViewById(R.id.maintain);
        maintain.setText(((Integer)caloriesMaintain()).toString());

        if(bmr<1200) {
            return 1200 + caloriesToBurn;
        } else {
            return (int) bmr + caloriesToBurn;
        }
    }
    public int caloriesLose() {
        if(bmr - caloriesToBurn < 1200) {
            return 1200;
        } else {
            return (int) bmr - caloriesToBurn;
        }
        
    }
    public int caloriesMaintain() {
        if(bmr<1200) {
            return 1200;
        } else {
            return (int) bmr;
        }
    }

}
