package com.example.hackduke;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class RegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
	}
	
	public void toMainScreen(View view) {
		Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
	}

}
