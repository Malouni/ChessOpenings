package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void onClick_openings(View view) {
        Intent openings_intent = new Intent(this, opening_main_activity.class);
        startActivity(openings_intent);
    }

    public void onClick_practice(View view) {
        Intent practice_intent = new Intent(this, Practice_Activity.class);
        startActivity(practice_intent);
    }
    public void onClick_about(View view) {
        Intent about_intent = new Intent(this, About_us.class);
        startActivity(about_intent);
    }
}