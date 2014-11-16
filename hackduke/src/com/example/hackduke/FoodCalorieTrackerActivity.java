package com.example.hackduke;

public class FoodCalorieTrackerActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcalorietracker);
    }

    protected int caloriesToEat() {
        return 1200;
    }
}
