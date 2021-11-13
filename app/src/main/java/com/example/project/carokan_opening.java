package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class carokan_opening extends AppCompatActivity {

    ImageButton a1; ImageButton a2; ImageButton a3; ImageButton a4;
    ImageButton a5; ImageButton a6; ImageButton a7; ImageButton a8;

    ImageButton b1; ImageButton b2; ImageButton b3; ImageButton b4;
    ImageButton b5; ImageButton b6; ImageButton b7; ImageButton b8;

    ImageButton c1; ImageButton c2; ImageButton c3; ImageButton c4;
    ImageButton c5; ImageButton c6; ImageButton c7; ImageButton c8;

    ImageButton d1; ImageButton d2; ImageButton d3; ImageButton d4;
    ImageButton d5; ImageButton d6; ImageButton d7; ImageButton d8;

    ImageButton e1; ImageButton e2; ImageButton e3; ImageButton e4;
    ImageButton e5; ImageButton e6; ImageButton e7; ImageButton e8;

    ImageButton f1; ImageButton f2; ImageButton f3; ImageButton f4;
    ImageButton f5; ImageButton f6; ImageButton f7; ImageButton f8;

    ImageButton g1; ImageButton g2; ImageButton g3; ImageButton g4;
    ImageButton g5; ImageButton g6; ImageButton g7; ImageButton g8;

    ImageButton h1; ImageButton h2; ImageButton h3; ImageButton h4;
    ImageButton h5; ImageButton h6; ImageButton h7; ImageButton h8;

    View button_next;
    View button_previous;
    View button_conclusion;

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carokan_opening);

        getSupportActionBar().hide();

        a1 = (ImageButton)findViewById(R.id.a1); a2 = (ImageButton)findViewById(R.id.a2);
        a3 = (ImageButton)findViewById(R.id.a3); a4 = (ImageButton)findViewById(R.id.a4);
        a5 = (ImageButton)findViewById(R.id.a5); a6 = (ImageButton)findViewById(R.id.a6);
        a7 = (ImageButton)findViewById(R.id.a7); a8 = (ImageButton)findViewById(R.id.a8);

        b1 = (ImageButton)findViewById(R.id.b1); b2 = (ImageButton)findViewById(R.id.b2);
        b3 = (ImageButton)findViewById(R.id.b3); b4 = (ImageButton)findViewById(R.id.b4);
        b5 = (ImageButton)findViewById(R.id.b5); b6 = (ImageButton)findViewById(R.id.b6);
        b7 = (ImageButton)findViewById(R.id.b7); b8 = (ImageButton)findViewById(R.id.b8);

        c1 = (ImageButton)findViewById(R.id.c1); c2 = (ImageButton)findViewById(R.id.c2);
        c3 = (ImageButton)findViewById(R.id.c3); c4 = (ImageButton)findViewById(R.id.c4);
        c5 = (ImageButton)findViewById(R.id.c5); c6 = (ImageButton)findViewById(R.id.c6);
        c7 = (ImageButton)findViewById(R.id.c7); c8 = (ImageButton)findViewById(R.id.c8);

        d1 = (ImageButton)findViewById(R.id.d1); d2 = (ImageButton)findViewById(R.id.d2);
        d3 = (ImageButton)findViewById(R.id.d3); d4 = (ImageButton)findViewById(R.id.d4);
        d5 = (ImageButton)findViewById(R.id.d5); d6 = (ImageButton)findViewById(R.id.d6);
        d7 = (ImageButton)findViewById(R.id.d7); d8 = (ImageButton)findViewById(R.id.d8);

        e1 = (ImageButton)findViewById(R.id.e1); e2 = (ImageButton)findViewById(R.id.e2);
        e3 = (ImageButton)findViewById(R.id.e3); e4 = (ImageButton)findViewById(R.id.e4);
        e5 = (ImageButton)findViewById(R.id.e5); e6 = (ImageButton)findViewById(R.id.e6);
        e7 = (ImageButton)findViewById(R.id.e7); e8 = (ImageButton)findViewById(R.id.e8);

        f1 = (ImageButton)findViewById(R.id.f1); f2 = (ImageButton)findViewById(R.id.f2);
        f3 = (ImageButton)findViewById(R.id.f3); f4 = (ImageButton)findViewById(R.id.f4);
        f5 = (ImageButton)findViewById(R.id.f5); f6 = (ImageButton)findViewById(R.id.f6);
        f7 = (ImageButton)findViewById(R.id.f7); f8 = (ImageButton)findViewById(R.id.f8);

        g1 = (ImageButton)findViewById(R.id.g1); g2 = (ImageButton)findViewById(R.id.g2);
        g3 = (ImageButton)findViewById(R.id.g3); g4 = (ImageButton)findViewById(R.id.g4);
        g5 = (ImageButton)findViewById(R.id.g5); g6 = (ImageButton)findViewById(R.id.g6);
        g7 = (ImageButton)findViewById(R.id.g7); g8 = (ImageButton)findViewById(R.id.g8);

        h1 = (ImageButton)findViewById(R.id.h1); h2 = (ImageButton)findViewById(R.id.h2);
        h3 = (ImageButton)findViewById(R.id.h3); h4 = (ImageButton)findViewById(R.id.h4);
        h5 = (ImageButton)findViewById(R.id.h5); h6 = (ImageButton)findViewById(R.id.h6);
        h7 = (ImageButton)findViewById(R.id.h7); h8 = (ImageButton)findViewById(R.id.h8);

        button_next = findViewById(R.id.next_button_c);
        button_previous = findViewById(R.id.previous_button_c);
        button_conclusion = findViewById(R.id.conclusion_button_c);

        button_previous.setVisibility(View.GONE);
        button_next.setVisibility(View.VISIBLE);
        button_conclusion.setVisibility(View.GONE);

        ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
        ((TextView) findViewById(R.id.text_conclusion_c)).setText(
                "Caro-Kann Defence is completed. You can test your knowledge in 'Practice' Section. \n " +
                        "If not, there are other openings that can be interesting for you!");
        ((TextView) findViewById(R.id.text_conclusion_c)).setVisibility(View.GONE);
        ((TextView) findViewById(R.id.count_check_c)).setVisibility(View.VISIBLE);

        alertDialog_1();
    }

    protected void onDestroy(){
        super.onDestroy();
        Intent openings_intent_back1 = new Intent(this, MainActivity.class);
        startActivity(openings_intent_back1);
    }

    public void onClick_car_next(View view) {
        switch (count) {
            case 1:
                e2.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                button_previous.setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.32");
                break;

            case 2:
                c7.setForeground(null);
                c6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.81");
                break;

            case 3:
                d2.setForeground(null);
                d4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.49");
                break;

            case 4:
                d7.setForeground(null);
                d5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.69");
                break;

            case 5:
                b1.setForeground(null);
                c3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.48");
                break;

            case 6:
                d5.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.67");
                break;

            case 7:
                c3.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.53");
                break;

            case 8:
                c8.setForeground(null);
                f5.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.56");
                break;

            case 9:
                e4.setForeground(null);
                g3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.54");
                break;

            case 10:
                f5.setForeground(null);
                g6.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.62");
                break;

            case 11:
                h2.setForeground(null);
                h4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.28");
                break;

            case 12:
                h7.setForeground(null);
                h6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.37");
                break;

            case 13:
                g1.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.21");
                break;

            case 14:
                e7.setForeground(null);
                e6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.34");
                break;

            case 15:
                f3.setForeground(null);
                e5.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.53");
                break;

            case 16:
                g6.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.56");
                break;

            case 17:
                f1.setForeground(null);
                d3.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.44");
                break;

            case 18:
                h7.setForeground(null);
                d3.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.41");
                break;

            case 19:
                d1.setForeground(null);
                d3.setForeground(getDrawable(R.drawable.piece_10));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.53");
                break;

            case 20:
                b8.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.34");
                break;

            case 21:
                f2.setForeground(null);
                f4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.12");
                break;

            case 22:
                f8.setForeground(null);
                b4.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.28");
                break;

            case 23:
                c2.setForeground(null);
                c3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.17");
                break;

            case 24:
                b4.setForeground(null);
                e7.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.31");
                break;

            case 25:
                c1.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.42");
                break;

            case 26:
                g8.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.30");
                break;

            case 27:
                e1.setForeground(null);
                c1.setForeground(getDrawable(R.drawable.piece_11));
                a1.setForeground(null);
                d1.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.36");
                break;

            case 28:
                e8.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_12));
                h8.setForeground(null);
                f8.setForeground(getDrawable(R.drawable.piece_3));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.47");
                break;

            case 29:
                g3.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 30:
                f6.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.17");
                break;

            case 31:
                d3.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_10));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.15");
                break;

            case 32:
                d7.setForeground(null);
                e5.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.61");
                break;

            case 33:
                f4.setForeground(null);
                e5.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.34");
                break;

            case 34:
                d8.setForeground(null);
                d5.setForeground(getDrawable(R.drawable.piece_9));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.93");
                break;

            case 35:
                e4.setForeground(null);
                d5.setForeground(getDrawable(R.drawable.piece_10));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.33");
                break;

            case 36:
                c6.setForeground(null);
                d5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.51");
                break;

            case 37:
                h4.setForeground(null);
                h5.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.27");
                break;

            case 38:
                b7.setForeground(null);
                b5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.37");
                break;

            case 39:
                h1.setForeground(null);
                h3.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.38");
                break;

            case 40:
                a7.setForeground(null);
                a5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.18");
                break;

            case 41:
                d1.setForeground(null);
                f1.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 42:
                a8.setForeground(null);
                c8.setForeground(getDrawable(R.drawable.piece_3));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.58");
                break;

            case 43:
                h3.setForeground(null);
                g3.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.05");
                break;

            case 44:
                g8.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_12));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 45:
                g3.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 46:
                h7.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_12));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.17");
                break;

            case 47:
                f3.setForeground(null);
                g3.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 48:
                g8.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_12));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 49:
                g3.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 50:
                h7.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_12));
                count++;
                button_next.setVisibility(View.GONE);
                button_conclusion.setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;
        }
    }

    public void onClick_indian_previous(View view) {
        switch (count) {
            case 2:
                e4.setForeground(null);
                e2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                button_previous.setVisibility(View.GONE);
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 3:
                c6.setForeground(null);
                c7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.81");
                break;

            case 4:
                d4.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.49");
                break;

            case 5:
                d5.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.69");
                break;

            case 6:
                c3.setForeground(null);
                b1.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.48");
                break;

            case 7:
                e4.setForeground(null);
                d5.setForeground(getDrawable(R.drawable.piece_1));
                e4.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.67");
                break;

            case 8:
                e4.setForeground(null);
                c3.setForeground(getDrawable(R.drawable.piece_6));
                e4.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.53");
                break;

            case 9:
                f5.setForeground(null);
                c8.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.56");
                break;

            case 10:
                g3.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.54");
                break;

            case 11:
                g6.setForeground(null);
                f5.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.62");
                break;

            case 12:
                h4.setForeground(null);
                h2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.28");
                break;

            case 13:
                h6.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.37");
                break;

            case 14:
                f3.setForeground(null);
                g1.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.21");
                break;

            case 15:
                e6.setForeground(null);
                e7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.34");
                break;

            case 16:
                e5.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.53");
                break;

            case 17:
                h7.setForeground(null);
                g6.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.56");
                break;

            case 18:
                d3.setForeground(null);
                f1.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.44");
                break;

            case 19:
                d3.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_8));
                d3.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.41");
                break;

            case 20:
                d3.setForeground(null);
                d1.setForeground(getDrawable(R.drawable.piece_10));
                d3.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.53");
                break;

            case 21:
                d7.setForeground(null);
                b8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.34");
                break;

            case 22:
                f4.setForeground(null);
                f2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.12");
                break;

            case 23:
                b4.setForeground(null);
                f8.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.28");
                break;

            case 24:
                c3.setForeground(null);
                c2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.17");
                break;

            case 25:
                e7.setForeground(null);
                b4.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.31");
                break;

            case 26:
                d2.setForeground(null);
                c1.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.42");
                break;

            case 27:
                f6.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.30");
                break;

            case 28:
                c1.setForeground(null);
                e1.setForeground(getDrawable(R.drawable.piece_11));
                d1.setForeground(null);
                a1.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.36");
                break;

            case 29:
                g8.setForeground(null);
                e8.setForeground(getDrawable(R.drawable.piece_12));
                f8.setForeground(null);
                h8.setForeground(getDrawable(R.drawable.piece_3));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.47");
                break;

            case 30:
                e4.setForeground(null);
                g3.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 31:
                e4.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                e4.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.17");
                break;

            case 32:
                e4.setForeground(null);
                d3.setForeground(getDrawable(R.drawable.piece_10));
                e4.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.15");
                break;

            case 33:
                e5.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_5));
                e5.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.61");
                break;

            case 34:
                e5.setForeground(null);
                f4.setForeground(getDrawable(R.drawable.piece_2));
                e5.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.34");
                break;

            case 35:
                d5.setForeground(null);
                d8.setForeground(getDrawable(R.drawable.piece_9));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.93");
                break;

            case 36:
                d5.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_10));
                d5.setForeground(getDrawable(R.drawable.piece_9));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.33");
                break;

            case 37:
                d5.setForeground(null);
                c6.setForeground(getDrawable(R.drawable.piece_1));
                d5.setForeground(getDrawable(R.drawable.piece_10));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.51");
                break;

            case 38:
                h5.setForeground(null);
                h4.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.27");
                break;

            case 39:
                b5.setForeground(null);
                b7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.37");
                break;

            case 40:
                h3.setForeground(null);
                h1.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.38");
                break;

            case 41:
                a5.setForeground(null);
                a7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.18");
                break;

            case 42:
                f1.setForeground(null);
                d1.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 43:
                c8.setForeground(null);
                a8.setForeground(getDrawable(R.drawable.piece_3));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.58");
                break;

            case 44:
                g3.setForeground(null);
                h3.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.05");
                break;

            case 45:
                h7.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_12));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 46:
                f3.setForeground(null);
                g3.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 47:
                g8.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_12));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n +0.17");
                break;

            case 48:
                g3.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 49:
                h7.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_12));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 50:
                f3.setForeground(null);
                g3.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;

            case 51:
                g8.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_12));
                count--;
                button_next.setVisibility(View.VISIBLE);
                button_conclusion.setVisibility(View.GONE);
                ((TextView) findViewById(R.id.count_check_c)).setText("Score: \n 0.00");
                break;
        }
    }

    public void onClick_carokan_back(View view) {
        Intent carokan_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(carokan_intent_back);
    }

    public void onClick_conclusion(View view){
        alertDialog_2();
    }

    private void alertDialog_1() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Cara-Kann Defence is a very complicated opening. Everything depends on your knowledge of the plan\n\n" +
                "Here one of the games of current World Champion, Magnus Carlsen, is presented, where he was using Caro-Kann Defence\n\n" +
                "It will be helpful to understand the opening goals and tricks");
        dialog.setTitle("Cara-Kann defence");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Good luck! We believe in you!",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    private void alertDialog_2() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("This game ended as a draw, cause white and black do not want to open their position,because it can be dangerous for both sides\n\n" +
                "This game is a greate example that if you follow this strategy during this opening, you will have equal game\n\n" +
                "So, the only thing you have to do follow the plan and wait for other player's mistake");
        dialog.setTitle("Conclusion: Caro-Kann Defence");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Well Done!",Toast.LENGTH_LONG).show();
                        button_previous.setVisibility(View.GONE);
                        button_conclusion.setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.count_check_c)).setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.text_conclusion_c)).setVisibility(View.VISIBLE);
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}