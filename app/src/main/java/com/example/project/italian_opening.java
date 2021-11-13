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

public class italian_opening extends AppCompatActivity {
    ImageButton a1; ImageButton a2;
    ImageButton a3; ImageButton a4;
    ImageButton a5; ImageButton a6;
    ImageButton a7; ImageButton a8;

    ImageButton b1; ImageButton b2;
    ImageButton b3; ImageButton b4;
    ImageButton b5; ImageButton b6;
    ImageButton b7; ImageButton b8;

    ImageButton c1; ImageButton c2;
    ImageButton c3; ImageButton c4;
    ImageButton c5; ImageButton c6;
    ImageButton c7; ImageButton c8;

    ImageButton d1; ImageButton d2;
    ImageButton d3; ImageButton d4;
    ImageButton d5; ImageButton d6;
    ImageButton d7; ImageButton d8;

    ImageButton e1; ImageButton e2;
    ImageButton e3; ImageButton e4;
    ImageButton e5; ImageButton e6;
    ImageButton e7; ImageButton e8;

    ImageButton f1; ImageButton f2;
    ImageButton f3; ImageButton f4;
    ImageButton f5; ImageButton f6;
    ImageButton f7; ImageButton f8;

    ImageButton g1; ImageButton g2;
    ImageButton g3; ImageButton g4;
    ImageButton g5; ImageButton g6;
    ImageButton g7; ImageButton g8;

    ImageButton h1; ImageButton h2;
    ImageButton h3; ImageButton h4;
    ImageButton h5; ImageButton h6;
    ImageButton h7; ImageButton h8;

    View button_next;
    View button_var1;
    View button_var2;
    View button_previous;
    View button_conclusion;

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_opening);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//
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

        button_next = findViewById(R.id.next_button);
        button_var1 = findViewById(R.id.var1);
        button_var2 = findViewById(R.id.var2);
        button_previous = findViewById(R.id.previous_button);
        button_conclusion = findViewById(R.id.conclusion_button);

        button_var1.setVisibility(View.GONE);
        button_var2.setVisibility(View.GONE);
        button_previous.setVisibility(View.GONE);
        button_next.setVisibility(View.VISIBLE);
        button_conclusion.setVisibility(View.GONE);

        ((TextView) findViewById(R.id.count_check)).setText("Score: \n 0.00");
        ((TextView) findViewById(R.id.text_conclusion)).setText(
                "Italian Opening is completed. You can test your knowledge in 'Practice' Section. \n " +
                        "If not, there are other openings that can be interesting for you!");
        ((TextView) findViewById(R.id.text_conclusion)).setVisibility(View.GONE);

        alertDialog_1();
    }

    public void onClick_italian_back(View view) {
        Intent italian_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(italian_intent_back);
    }

    public void onClick_italian_next(View view){
        switch(count){
            case 1:
                e2.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.40");
                ((TextView) findViewById(R.id.moves_text)).setText("1. e2-e4");
                button_previous.setVisibility(View.VISIBLE);

                break;

            case 2:
                e7.setForeground(null);
                e5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.53");
                ((TextView) findViewById(R.id.moves_text)).setText("1. e2-e4  e7-e5");
                break;

            case 3:
                g1.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_6));
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.40");
                count++;
                ((TextView) findViewById(R.id.moves_text2)).setText("2. Ng1-Nf3");
                break;

            case 4:
                b8.setForeground(null);
                c6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.46");
                ((TextView) findViewById(R.id.moves_text2)).setText("2. Ng1-Nf3  Nb8-Nc6");
                break;

            case 5:
                f1.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.60");
                ((TextView) findViewById(R.id.moves_text3)).setText("3. Bf1-Bc4");
                break;

            case 6:
                f8.setForeground(null);
                c5.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.57");
                ((TextView) findViewById(R.id.moves_text3)).setText("3. Bf1-Bc4  Bf8-Bc5");
                break;

            case 7:
                c2.setForeground(null);
                c3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.moves_text4)).setText("4. c2-c3");
                break;

            case 8:
                g8.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.40");
                ((TextView) findViewById(R.id.moves_text4)).setText("4. c2-c3  Ng8-Nf6");
                break;

            case 9:
                d2.setForeground(null);
                d3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.30");
                ((TextView) findViewById(R.id.moves_text5)).setText("5. d2-d3");
                break;

            case 10:
                d7.setForeground(null);
                d6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.43");
                ((TextView) findViewById(R.id.moves_text5)).setText("5. d2-d3  d7-d6");
                break;

            case 11:
                e1.setForeground(null);
                h1.setForeground(null);
                g1.setForeground(getDrawable(R.drawable.piece_11));
                f1.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.48");
                ((TextView) findViewById(R.id.moves_text6)).setText("6. O-O");
                break;

            case 12:
                e8.setForeground(null);
                h8.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_12));
                f8.setForeground(getDrawable(R.drawable.piece_3));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.50");
                button_next.setVisibility(View.GONE);
                button_var1.setVisibility(View.VISIBLE);
                button_var2.setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.moves_text6)).setText("6. O-O  O-O");
                break;

            case 14:
                h7.setForeground(null);
                h6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.30");
                ((TextView) findViewById(R.id.moves_text7)).setText("7. Bc4-Bb3  h7-h6");
                break;

            case 15:
                b1.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.30");
                ((TextView) findViewById(R.id.moves_text8)).setText("8. Nb1-Nd2");
                break;

            case 16:
                a7.setForeground(null);
                a6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.42");
                ((TextView) findViewById(R.id.moves_text8)).setText("8. Nb1-Nd2  a7-a6");
                break;

            case 17:
                h2.setForeground(null);
                h3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.33");
                ((TextView) findViewById(R.id.moves_text9)).setText("9. h2-h3");
                break;

            case 18:
                c5.setForeground(null);
                a7.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.20");
                ((TextView) findViewById(R.id.moves_text9)).setText("9. h2-h3  Bc5-Ba7");
                break;

            case 19:
                f1.setForeground(null);
                e1.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.35");
                ((TextView) findViewById(R.id.moves_text10)).setText("10. Rf1-Re1");
                break;

            case 20:
                f6.setForeground(null);
                h5.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.moves_text10)).setText("10. Rf1-Re1  Nf6-Nh5");
                ((TextView) findViewById(R.id.count_check)).setVisibility(View.GONE);
                button_next.setVisibility(View.GONE);
                button_conclusion.setVisibility(View.VISIBLE);
                break;

            case 30:
                a7.setForeground(null);
                a5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.47");
                ((TextView) findViewById(R.id.moves_text7)).setText("7. Nb1-Nd2  a7-a5");
                break;

            case 31:
                h2.setForeground(null);
                h3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.30");
                ((TextView) findViewById(R.id.moves_text8)).setText("8. h2-h3");
                break;

            case 32:
                c8.setForeground(null);
                e6.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.40");
                ((TextView) findViewById(R.id.moves_text8)).setText("8. h2-h3  Bc8-Be6");
                break;

            case 33:
                c4.setForeground(null);
                b5.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.10");
                ((TextView) findViewById(R.id.moves_text9)).setText("9. Bc4-Bb5");
                break;

            case 34:
                d8.setForeground(null);
                c8.setForeground(getDrawable(R.drawable.piece_9));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.28");
                ((TextView) findViewById(R.id.moves_text9)).setText("9. Bc4-Bb5  Qd8-Qc8");
                break;

            case 35:
                g1.setForeground(null);
                h2.setForeground(getDrawable(R.drawable.piece_11));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n 0.0");
                ((TextView) findViewById(R.id.moves_text10)).setText("10. Kg1-Kh2");
                break;

            case 36:
                h7.setForeground(null);
                h6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setVisibility(View.GONE);
                button_next.setVisibility(View.GONE);
                button_conclusion.setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.moves_text10)).setText("10. Kg1-Kh2  h7-h6");
                break;
        }
    }

    public void onClick_italian_previous(View view){
        switch(count){
            case 2:
                e4.setForeground(null);
                e2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n 0.00");
                button_previous.setVisibility(View.GONE);
                ((TextView) findViewById(R.id.moves_text)).setText("");
                break;

            case 3:
                e5.setForeground(null);
                e7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.40");
                ((TextView) findViewById(R.id.moves_text)).setText("1. e2-e4");
                break;

            case 4:
                f3.setForeground(null);
                g1.setForeground(getDrawable(R.drawable.piece_6));
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.53");
                ((TextView) findViewById(R.id.moves_text)).setText("1. e2-e4  e7-e5");
                ((TextView) findViewById(R.id.moves_text2)).setText("");
                count--;
                break;

            case 5:
                c6.setForeground(null);
                b8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.40");
                ((TextView) findViewById(R.id.moves_text2)).setText("2. Ng1-Nf3");
                break;

            case 6:
                c4.setForeground(null);
                f1.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.46");
                ((TextView) findViewById(R.id.moves_text2)).setText("2. Ng1-Nf3  Nb8-Nc6");
                ((TextView) findViewById(R.id.moves_text3)).setText("");
                break;

            case 7:
                c5.setForeground(null);
                f8.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.60");
                ((TextView) findViewById(R.id.moves_text3)).setText("3. Bf1-Bc4");
                break;

            case 8:
                c3.setForeground(null);
                c2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.57");
                ((TextView) findViewById(R.id.moves_text3)).setText("3. Bf1-Bc4  Bf8-Bc5");
                ((TextView) findViewById(R.id.moves_text4)).setText("");
                break;

            case 9:
                f6.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.35");
                ((TextView) findViewById(R.id.moves_text4)).setText("4. c2-c3");
                break;

            case 10:
                d3.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.40");
                ((TextView) findViewById(R.id.moves_text4)).setText("4. c2-c3  Ng8-Nf6");
                ((TextView) findViewById(R.id.moves_text5)).setText("");
                break;

            case 11:
                d6.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.30");
                ((TextView) findViewById(R.id.moves_text5)).setText("5. d2-d3");
                break;

            case 12:
                g1.setForeground(null);
                f1.setForeground(null);
                e1.setForeground(getDrawable(R.drawable.piece_11));
                h1.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.43");
                ((TextView) findViewById(R.id.moves_text5)).setText("5. d2-d3  d7-d6");
                ((TextView) findViewById(R.id.moves_text6)).setText("");
                break;

            case 13:
                g8.setForeground(null);
                f8.setForeground(null);
                e8.setForeground(getDrawable(R.drawable.piece_12));
                h8.setForeground(getDrawable(R.drawable.piece_3));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.48");
                ((TextView) findViewById(R.id.moves_text6)).setText("6. O-O");
                button_next.setVisibility(View.VISIBLE);
                button_var1.setVisibility(View.GONE);
                button_var2.setVisibility(View.GONE);
                break;

            case 14:
                b3.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.50");
                ((TextView) findViewById(R.id.moves_text6)).setText("6. O-O  O-O");
                ((TextView) findViewById(R.id.moves_text7)).setText("");
                button_next.setVisibility(View.GONE);
                button_var1.setVisibility(View.VISIBLE);
                button_var2.setVisibility(View.VISIBLE);
                break;

            case 15:
                h6.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.12");
                ((TextView) findViewById(R.id.moves_text7)).setText("7. Bc4-Bb3");
                break;

            case 16:
                d2.setForeground(null);
                b1.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.30");
                ((TextView) findViewById(R.id.moves_text7)).setText("7. Bc4-Bb3  h7-h6");
                ((TextView) findViewById(R.id.moves_text8)).setText("");
                break;

            case 17:
                a6.setForeground(null);
                a7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.30");
                ((TextView) findViewById(R.id.moves_text8)).setText("8. Nb1-Nd2");
                break;

            case 18:
                h3.setForeground(null);
                h2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.42");
                ((TextView) findViewById(R.id.moves_text8)).setText("8. Nb1-Nd2  a7-a6");
                ((TextView) findViewById(R.id.moves_text9)).setText("");
                break;

            case 19:
                a7.setForeground(null);
                c5.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.33");
                ((TextView) findViewById(R.id.moves_text9)).setText("9. h2-h3");
                break;

            case 20:
                e1.setForeground(null);
                f1.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.20");
                ((TextView) findViewById(R.id.moves_text9)).setText("9. h2-h3  Bc5-Ba7");
                ((TextView) findViewById(R.id.moves_text10)).setText("");
                break;

            case 21:
                h5.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.35");
                ((TextView) findViewById(R.id.count_check)).setVisibility(View.VISIBLE);
                button_next.setVisibility(View.VISIBLE);
                button_conclusion.setVisibility(View.GONE);
                ((TextView) findViewById(R.id.moves_text10)).setText("10. Rf1-Re1");
                break;

            case 30:
                d2.setForeground(null);
                b1.setForeground(getDrawable(R.drawable.piece_6));
                count = 13;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.50");
                ((TextView) findViewById(R.id.moves_text6)).setText("6. O-O  O-O");
                ((TextView) findViewById(R.id.moves_text7)).setText("");
                button_next.setVisibility(View.GONE);
                button_var1.setVisibility(View.VISIBLE);
                button_var2.setVisibility(View.VISIBLE);
                break;

            case 31:
                a5.setForeground(null);
                a7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.50");
                ((TextView) findViewById(R.id.moves_text7)).setText("7. Nb1-Nd2");
                break;

            case 32:
                h3.setForeground(null);
                h2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.47");
                ((TextView) findViewById(R.id.moves_text7)).setText("7. Nb1-Nd2  a7-a5");
                ((TextView) findViewById(R.id.moves_text8)).setText("");
                break;

            case 33:
                e6.setForeground(null);
                c8.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.30");
                ((TextView) findViewById(R.id.moves_text8)).setText("8. h2-h3");
                break;

            case 34:
                b5.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.40");
                ((TextView) findViewById(R.id.moves_text8)).setText("8. h2-h3  Bc8-Be6");
                ((TextView) findViewById(R.id.moves_text9)).setText("");

                break;

            case 35:
                c8.setForeground(null);
                d8.setForeground(getDrawable(R.drawable.piece_9));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.10");
                ((TextView) findViewById(R.id.moves_text9)).setText("9. Bc4-Bb5");
                break;

            case 36:
                h2.setForeground(null);
                g1.setForeground(getDrawable(R.drawable.piece_11));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.28");
                ((TextView) findViewById(R.id.moves_text9)).setText("9. Bc4-Bb5  Qd8-Qc8");
                ((TextView) findViewById(R.id.moves_text10)).setText("");
                break;

            case 37:
                h6.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check)).setText("Score: \n 0.0");
                ((TextView) findViewById(R.id.moves_text10)).setText("10. Kg1-Kh2");
                ((TextView) findViewById(R.id.count_check)).setVisibility(View.VISIBLE);
                button_next.setVisibility(View.VISIBLE);
                button_conclusion.setVisibility(View.GONE);
                break;
        }
    }

    public void onClick_1st(View view){
        c4.setForeground(null);
        b3.setForeground(getDrawable(R.drawable.piece_7));
        count++;
        ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.12");
        ((TextView) findViewById(R.id.moves_text7)).setText("7. Bc4-Bb3");
        button_var1.setVisibility(View.GONE);
        button_var2.setVisibility(View.GONE);
        button_next.setVisibility(View.VISIBLE);
    }

    public void onClick_2st(View view){
        b1.setForeground(null);
        d2.setForeground(getDrawable(R.drawable.piece_6));
        count = 30;
        ((TextView) findViewById(R.id.count_check)).setText("Score: \n +0.50");
        button_var1.setVisibility(View.GONE);
        button_var2.setVisibility(View.GONE);
        button_next.setVisibility(View.VISIBLE);
        ((TextView) findViewById(R.id.moves_text7)).setText("7. Nb1-Nd2");
    }

    public void onClick_conclusion(View view){
        if(count == 21){ alertDialog_2();}
        if(count == 37){ alertDialog_3();}
        ((TextView) findViewById(R.id.moves_text)).setText("");
        ((TextView) findViewById(R.id.moves_text2)).setText("");
        ((TextView) findViewById(R.id.moves_text3)).setText("");
        ((TextView) findViewById(R.id.moves_text4)).setText("");
        ((TextView) findViewById(R.id.moves_text5)).setText("");
        ((TextView) findViewById(R.id.moves_text6)).setText("");
        ((TextView) findViewById(R.id.moves_text7)).setText("");
        ((TextView) findViewById(R.id.moves_text8)).setText("");
        ((TextView) findViewById(R.id.moves_text9)).setText("");
        ((TextView) findViewById(R.id.moves_text10)).setText("");
    }

    private void alertDialog_1() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("One of the best openings for beginners is the Italian Game. \n\n" +
                "It has a simple idea: everybody is trying to develop their side with very safe moves. \n\n" +
                "If each player is following the plan, the game is equal.");
        dialog.setTitle("Italian Opening");
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
        dialog.setMessage("Here is the position that you have in the end of this opening. \n\n" +
                            "White and Black are trying to get to kings. One of the ideas after this: include your rook in play with moving 'f' pawn. \n\n" +
                                "White have a little bit better position \n\n" +
                                    "Not very agressive position. Each player has time to find out what they want to do next!");
        dialog.setTitle("Conclusion");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Well Done!",Toast.LENGTH_LONG).show();
                        button_next.setVisibility(View.GONE);
                        button_previous.setVisibility(View.GONE);
                        button_conclusion.setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.count_check)).setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.text_conclusion)).setVisibility(View.VISIBLE);
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    private void alertDialog_3() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Here is the position that you have in the end of this opening with choosing Knight to 'd2'. \n\n" +
                            "White have a chance to include knights and the rook in their play. \n\n" +
                                "Black are using bishops, queen and knight to aim on white king. \n\n" +
                                    "Position is equal with no advantages and disadvantages for both sides.");
        dialog.setTitle("Conclusion");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Well Done!",Toast.LENGTH_LONG).show();
                        button_next.setVisibility(View.GONE);
                        button_previous.setVisibility(View.GONE);
                        button_conclusion.setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.count_check)).setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.text_conclusion)).setVisibility(View.VISIBLE);
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}