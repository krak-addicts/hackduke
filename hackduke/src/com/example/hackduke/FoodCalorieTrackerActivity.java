package com.example.hackduke;

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
