package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class opening_main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_main_activity);
        getSupportActionBar().hide();
    }

    public void onClick_opennings_back1(View view) {
        Intent openings_intent_back1 = new Intent(this, MainActivity.class);
        startActivity(openings_intent_back1);
    }

    public void onClick_italian(View view) {
        Intent italian_intent = new Intent(this, italian_opening.class);
        startActivity(italian_intent);
    }

    public void onClick_sicilian(View view) {
        Intent sicilian_intent = new Intent(this, sicilian_opening.class);
        startActivity(sicilian_intent);
    }

    public void onClick_queens(View view) {
        Intent queens_intent = new Intent(this, queens_opening.class);
        startActivity(queens_intent);
    }

    public void onClick_indian(View view) {
        Intent indian_intent = new Intent(this, indian_opening.class);
        startActivity(indian_intent);
    }

    public void onClick_carokan(View view) {
        Intent carokan_intent = new Intent(this, carokan_opening.class);
        startActivity(carokan_intent);
    }


}