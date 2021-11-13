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

public class sicilian_opening extends AppCompatActivity {
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
    View button_dragon;
    View button_closed;
    View button_previous;
    View button_conclusion;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sicilian_opening);
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

        button_next = findViewById(R.id.next_button_s);
        button_dragon = findViewById(R.id.b_dragon);
        button_closed = findViewById(R.id.b_closed);
        button_previous = findViewById(R.id.previous_button_s);
        button_conclusion = findViewById(R.id.conclusion_button_s);

        button_dragon.setVisibility(View.VISIBLE);
        button_closed.setVisibility(View.VISIBLE);
        button_previous.setVisibility(View.GONE);
        button_next.setVisibility(View.GONE);
        button_conclusion.setVisibility(View.GONE);

        ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n 0.00");
        ((TextView) findViewById(R.id.text_conclusion_s)).setText(
                "Sicilian Defence is completed. You can test your knowledge in 'Practice' Section. \n " +
                        "If not, there are other openings that can be interesting for you!");
        ((TextView) findViewById(R.id.text_conclusion_s)).setVisibility(View.GONE);
        ((TextView) findViewById(R.id.count_check_s)).setVisibility(View.GONE);

        alertDialog_1();
    }

    public void onClick_sicilian_back(View view) {
        Intent sicilian_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(sicilian_intent_back);
    }

    private void alertDialog_1() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Here two ways to play Sicilian defence are presented. \n\n" +
                "Sicilian Dragon is the most popular way and one of the most strategic \n\n" +
                "Closed Sicilian Defence is a well-developed line that advances white along the kingside but does not attack the center. \n\n" +
                "Choose the one that you want to learn");
        dialog.setTitle("Sicilian Opening");
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
        dialog.setMessage("Closed Sicilian Defence is famous for its closed type of game, it is hard to make big moves. \n\n" +
                "There are two possible moves for white in this position: Bb3 or Bg5 \n\n" +
                "Bg5 is more aggressive and it has idea of 'f6'. Paw becomes dangerous as it is already on 6th line and it is ready to become a queen!\n\n" +
                "Bb3 is more passive but still good move. In this case white have two options: finally decide to Bg5 or playing passive depending on the position");
        dialog.setTitle("Conclusion: Closed Opening");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Well Done!",Toast.LENGTH_LONG).show();
                        button_previous.setVisibility(View.GONE);
                        button_conclusion.setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.count_check_s)).setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.text_conclusion_s)).setVisibility(View.VISIBLE);
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    private void alertDialog_3() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Dragon defence is called this way because the defence that black are trying to make has a look of dragon(with head and big tail.\n\n" +
                            "Game ideas are simple at this point: \n\n" +
                                "     - White: start pushing black king with rooks, bishops and queen\n\n" +
                                    "     - Black: pushing white king with quick knights' moves with help of rook and queen");
        dialog.setTitle("Conclusion: Dragon Opening");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Well Done!",Toast.LENGTH_LONG).show();
                        button_previous.setVisibility(View.GONE);
                        button_conclusion.setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.count_check_s)).setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.text_conclusion_s)).setVisibility(View.VISIBLE);
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    public void onClick_conclusion(View view){
        if (count == 55){alertDialog_3();}
        if (count == 19){alertDialog_2();}
    }

    public void onClick_closed(View view){
        button_dragon.setVisibility(View.GONE);
        button_closed.setVisibility(View.GONE);
        button_previous.setVisibility(View.VISIBLE);
        button_next.setVisibility(View.VISIBLE);
        count = 1;
        ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n 0.00");
        ((TextView) findViewById(R.id.count_check_s)).setVisibility(View.VISIBLE);
    }

    public void onClick_dragon(View view){
        button_dragon.setVisibility(View.GONE);
        button_closed.setVisibility(View.GONE);
        button_previous.setVisibility(View.VISIBLE);
        button_next.setVisibility(View.VISIBLE);
        count = 30;
        ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n 0.00");
        ((TextView) findViewById(R.id.count_check_s)).setVisibility(View.VISIBLE);
    }

    public void onClick_italian_next(View view) {
        switch (count) {
            case 1:
                e2.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.16");
                break;

            case 2:
                c7.setForeground(null);
                c5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.30");
                break;

            case 3:
                b1.setForeground(null);
                c3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.28");
                break;

            case 4:
                b8.setForeground(null);
                c6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.25");
                break;

            case 5:
                f2.setForeground(null);
                f4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.05");
                break;

            case 6:
                g7.setForeground(null);
                g6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n 0.00");
                break;

            case 7:
                g1.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.08");
                break;

            case 8:
                f8.setForeground(null);
                g7.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.02");
                break;

            case 9:
                f1.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.40");
                break;

            case 10:
                e7.setForeground(null);
                e6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.20");
                break;

            case 11:
                e1.setForeground(null);
                g1.setForeground(getDrawable(R.drawable.piece_11));
                h1.setForeground(null);
                f1.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.50");
                break;

            case 12:
                d7.setForeground(null);
                d6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.10");
                break;

            case 13:
                d2.setForeground(null);
                d3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.35");
                break;

            case 14:
                g8.setForeground(null);
                e7.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.35");
                break;

            case 15:
                d1.setForeground(null);
                e1.setForeground(getDrawable(R.drawable.piece_10));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.72");
                break;

            case 16:
                a7.setForeground(null);
                a6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.37");
                break;

            case 17:
                f4.setForeground(null);
                f5.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.42");
                break;

            case 18:
                b7.setForeground(null);
                b5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.50");
                button_next.setVisibility(View.GONE);
                button_conclusion.setVisibility(View.VISIBLE);
                break;

            case 30:
                e2.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.15");
                break;

            case 31:
                c7.setForeground(null);
                c5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.31");
                break;

            case 32:
                g1.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.20");
                break;

            case 33:
                d7.setForeground(null);
                d6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.15");
                break;

            case 34:
                d2.setForeground(null);
                d4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.27");
                break;

            case 35:
                c5.setForeground(null);
                d4.setForeground(null);
                d4.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.18");
                break;

            case 36:
                d4.setForeground(null);
                f3.setForeground(null);
                d4.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.12");
                break;

            case 37:
                g8.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.18");
                break;

            case 38:
                b1.setForeground(null);
                c3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.25");
                break;

            case 39:
                g7.setForeground(null);
                g6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.35");
                break;

            case 40:
                c1.setForeground(null);
                e3.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.51");
                break;

            case 41:
                f8.setForeground(null);
                g7.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.56");
                break;

            case 42:
                f2.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.36");
                break;

            case 43:
                e8.setForeground(null);
                h8.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_12));
                f8.setForeground(getDrawable(R.drawable.piece_3));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.40");
                break;

            case 44:
                d1.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_10));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.42");
                break;

            case 45:
                b8.setForeground(null);
                c6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.64");
                break;

            case 46:
                f1.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.18");
                break;

            case 47:
                c8.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.33");
                break;

            case 48:
                e1.setForeground(null);
                a1.setForeground(null);
                c1.setForeground(getDrawable(R.drawable.piece_11));
                d1.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.21");
                break;

            case 49:
                c6.setForeground(null);
                e5.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.53");
                break;

            case 50:
                c4.setForeground(null);
                b3.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.28");
                break;

            case 51:
                a8.setForeground(null);
                c8.setForeground(getDrawable(R.drawable.piece_3));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.10");
                break;

            case 52:
                h2.setForeground(null);
                h4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.21");
                break;

            case 53:
                h7.setForeground(null);
                h5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.32");
                break;

            case 54:
                c1.setForeground(null);
                b1.setForeground(getDrawable(R.drawable.piece_11));
                count++;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.12");
                button_next.setVisibility(View.GONE);
                button_conclusion.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void onClick_italian_previous(View view) {
        switch (count) {
            case 1:
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setVisibility(View.GONE);
                button_dragon.setVisibility(View.VISIBLE);
                button_closed.setVisibility(View.VISIBLE);
                button_previous.setVisibility(View.GONE);
                button_next.setVisibility(View.GONE);
                break;

            case 30:
                count = 0;
                ((TextView) findViewById(R.id.count_check_s)).setVisibility(View.GONE);
                button_dragon.setVisibility(View.VISIBLE);
                button_closed.setVisibility(View.VISIBLE);
                button_previous.setVisibility(View.GONE);
                button_next.setVisibility(View.GONE);
                break;

            //----

            case 2:
                e4.setForeground(null);
                e2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n 0.00");
                break;

            case 3:
                c5.setForeground(null);
                c7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.16");
                break;

            case 4:
                c3.setForeground(null);
                b1.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.30");
                break;

            case 5:
                c6.setForeground(null);
                b8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.28");
                break;

            case 6:
                f4.setForeground(null);
                f2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.25");
                break;

            case 7:
                g6.setForeground(null);
                g7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.05");
                break;

            case 8:
                f3.setForeground(null);
                g1.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n 0.00");
                break;

            case 9:
                g7.setForeground(null);
                f8.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.08");
                break;

            case 10:
                c4.setForeground(null);
                f1.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.02");
                break;

            case 11:
                e6.setForeground(null);
                e7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.40");
                break;

            case 12:
                g1.setForeground(null);
                e1.setForeground(getDrawable(R.drawable.piece_11));
                f1.setForeground(null);
                h1.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.20");
                break;

            case 13:
                d6.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.50");
                break;

            case 14:
                d3.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.10");
                break;

            case 15:
                e7.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.35");
                break;

            case 16:
                e1.setForeground(null);
                d1.setForeground(getDrawable(R.drawable.piece_10));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.35");
                break;

            case 17:
                a6.setForeground(null);
                a7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.72");
                break;

            case 18:
                f5.setForeground(null);
                f4.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.37");
                break;

            case 19:
                b5.setForeground(null);
                b7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n -0.42");
                button_next.setVisibility(View.VISIBLE);
                button_conclusion.setVisibility(View.GONE);
                break;

            case 31:
                e4.setForeground(null);
                e2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score:\n 0.00");
                break;

            case 32:
                c5.setForeground(null);
                c7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.15");
                break;

            case 33:
                f3.setForeground(null);
                g1.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.31");
                break;

            case 34:
                d6.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.20");
                break;

            case 35:
                d4.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.15");
                break;

            case 36:
                d4.setForeground(null);
                d4.setForeground(getDrawable(R.drawable.piece_2));
                c5.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.27");
                break;

            case 37:
                d4.setForeground(null);
                d4.setForeground(getDrawable(R.drawable.piece_1));
                f3.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.18");
                break;

            case 38:
                f6.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.12");
                break;

            case 39:
                c3.setForeground(null);
                b1.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.18");
                break;

            case 40:
                g6.setForeground(null);
                g7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.25");
                break;

            case 41:
                e3.setForeground(null);
                c1.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.35");
                break;

            case 42:
                g7.setForeground(null);
                f8.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.51");
                break;

            case 43:
                f3.setForeground(null);
                f2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.56");
                break;

            case 44:
                f8.setForeground(null);
                g8.setForeground(null);
                e8.setForeground(getDrawable(R.drawable.piece_12));
                h8.setForeground(getDrawable(R.drawable.piece_3));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.36");
                break;

            case 45:
                d2.setForeground(null);
                d1.setForeground(getDrawable(R.drawable.piece_10));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.40");
                break;

            case 46:
                c6.setForeground(null);
                b8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.42");
                break;

            case 47:
                c4.setForeground(null);
                f1.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.64");
                break;

            case 48:
                d7.setForeground(null);
                c8.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.18");
                break;

            case 49:
                d1.setForeground(null);
                c1.setForeground(null);
                e1.setForeground(getDrawable(R.drawable.piece_11));
                a1.setForeground(getDrawable(R.drawable.piece_4));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.33");
                break;

            case 50:
                e5.setForeground(null);
                c6.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.21");
                break;

            case 51:
                b3.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.53");
                break;

            case 52:
                c8.setForeground(null);
                a8.setForeground(getDrawable(R.drawable.piece_3));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.28");
                break;

            case 53:
                h4.setForeground(null);
                h2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.10");
                break;

            case 54:
                h5.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.21");
                break;

            case 55:
                b1.setForeground(null);
                c1.setForeground(getDrawable(R.drawable.piece_11));
                count--;
                ((TextView) findViewById(R.id.count_check_s)).setText("Score: \n +0.32");
                button_next.setVisibility(View.VISIBLE);
                button_conclusion.setVisibility(View.GONE);
                break;
        }
    }

}