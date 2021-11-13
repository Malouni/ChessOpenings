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

public class queens_opening extends AppCompatActivity {

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
    View button_accepted;
    View button_declined;
    View button_previous;
    View button_conclusion;

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queens_opening);

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

        button_next = findViewById(R.id.next_button_q);
        button_accepted = findViewById(R.id.accept);
        button_declined = findViewById(R.id.decline);
        button_previous = findViewById(R.id.previous_button_q);
        button_conclusion = findViewById(R.id.conclusion_button_q);

        button_accepted.setVisibility(View.GONE);
        button_declined.setVisibility(View.GONE);
        button_previous.setVisibility(View.GONE);
        button_next.setVisibility(View.VISIBLE);
        button_conclusion.setVisibility(View.GONE);

        ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n 0.00");
        ((TextView) findViewById(R.id.text_conclusion_q)).setText(
                "Queens gambit is completed. You can test your knowledge in 'Practice' Section. \n " +
                        "If not, there are other openings that can be interesting for you!");
        ((TextView) findViewById(R.id.text_conclusion_q)).setVisibility(View.GONE);

        alertDialog_1();
    }

    public void onClick_queens_back(View view) {
        Intent queens_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(queens_intent_back);
    }

    public void onClick_declined(View view){
        button_accepted.setVisibility(View.GONE);
        button_declined.setVisibility(View.GONE);
        button_previous.setVisibility(View.VISIBLE);
        button_next.setVisibility(View.VISIBLE);
        e7.setForeground(null);
        e6.setForeground(getDrawable(R.drawable.piece_1));
        count = 20;
        ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.50");
        ((TextView) findViewById(R.id.count_check_q)).setVisibility(View.VISIBLE);
    }

    public void onClick_accepted(View view){
        button_accepted.setVisibility(View.GONE);
        button_declined.setVisibility(View.GONE);
        button_previous.setVisibility(View.VISIBLE);
        button_next.setVisibility(View.VISIBLE);
        d5.setForeground(null);
        c4.setForeground(getDrawable(R.drawable.piece_1));
        count++;
        ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.54");
        ((TextView) findViewById(R.id.count_check_q)).setVisibility(View.VISIBLE);
    }

    public void onClick_queens_next(View view) {
        switch (count) {
            case 1:
                d2.setForeground(null);
                d4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                button_previous.setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.20");
                break;

            case 2:
                d7.setForeground(null);
                d5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.48");
                break;

            case 3:
                c2.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                alertDialog_2();
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.40");
                break;

            case 5:
                e2.setForeground(null);
                e3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.47");
                break;

            case 6:
                b7.setForeground(null);
                b5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.94");
                break;

            case 7:
                a2.setForeground(null);
                a4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +1.00");
                break;

            case 8:
                c7.setForeground(null);
                c6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +1.82");
                break;

            case 9:
                a4.setForeground(null);
                b5.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +2.14");
                break;

            case 10:
                c6.setForeground(null);
                b5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +4.49");
                break;

            case 11:
                d1.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_10));
                count++;
                button_next.setVisibility(View.GONE);
                button_conclusion.setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +4.52");
                break;

            case 20:
                b1.setForeground(null);
                c3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.30");
                break;

            case 21:
                g8.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.30");
                break;

            case 22:
                c1.setForeground(null);
                g5.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.26");
                break;

            case 23:
                b8.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.44");
                break;

            case 24:
                e2.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.58");
                break;

            case 25:
                d5.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.75");
                break;

            case 26:
                c3.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.68");
                break;

            case 27:
                h7.setForeground(null);
                h6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.74");
                break;

            case 28:
                e4.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.92");
                break;

            case 29:
                d7.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.30");
                break;

            case 30:
                g5.setForeground(null);
                e3.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.50");
                break;

            case 31:
                f8.setForeground(null);
                b4.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                button_next.setVisibility(View.GONE);
                button_conclusion.setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.20");
                break;
        }
    }

    public void onClick_queens_previous(View view) {
        switch (count) {
            case 2:
                d4.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.20");
                break;

            case 3:
                d5.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.48");
                break;

            case 4:
                c4.setForeground(null);
                c2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.40");
                break;

            case 5:
                c4.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_2));
                d5.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                alertDialog_2();
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.54");
                break;

            case 6:
                e3.setForeground(null);
                e2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.47");
                break;

            case 7:
                b5.setForeground(null);
                b7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.94");
                break;

            case 8:
                a4.setForeground(null);
                a2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +1.00");
                break;

            case 9:
                c6.setForeground(null);
                c7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +1.82");
                break;

            case 10:
                b5.setForeground(null);
                b5.setForeground(getDrawable(R.drawable.piece_1));
                a4.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +2.14");
                break;

            case 11:
                b5.setForeground(null);
                b5.setForeground(getDrawable(R.drawable.piece_2));
                c6.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +4.49");
                break;

            case 12:
                f3.setForeground(null);
                d1.setForeground(getDrawable(R.drawable.piece_10));
                count--;
                button_next.setVisibility(View.VISIBLE);
                button_conclusion.setVisibility(View.GONE);
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +4.52");
                break;

            case 20:
                e6.setForeground(null);
                e7.setForeground(getDrawable(R.drawable.piece_1));
                count = 4;
                alertDialog_2();
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.50");
                break;

            case 21:
                c3.setForeground(null);
                b1.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.36");
                break;

            case 22:
                f6.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.30");
                break;

            case 23:
                g5.setForeground(null);
                c1.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.26");
                break;

            case 24:
                d7.setForeground(null);
                b8.setForeground(getDrawable(R.drawable.piece_5));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n +0.44");
                break;

            case 25:
                e4.setForeground(null);
                e2.setForeground(getDrawable(R.drawable.piece_2));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.58");
                break;

            case 26:
                e4.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_2));
                d5.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.75");
                break;

            case 27:
                e4.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_1));
                c3.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.68");
                break;

            case 28:
                h6.setForeground(null);
                h7.setForeground(getDrawable(R.drawable.piece_1));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.74");
                break;

            case 29:
                f6.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                e4.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.92");
                break;

            case 30:
                f6.setForeground(null);
                d7.setForeground(getDrawable(R.drawable.piece_5));
                f6.setForeground(getDrawable(R.drawable.piece_6));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.30");
                break;

            case 31:
                e3.setForeground(null);
                g5.setForeground(getDrawable(R.drawable.piece_7));
                count--;
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.50");
                break;

            case 32:
                b4.setForeground(null);
                f8.setForeground(getDrawable(R.drawable.piece_8));
                count--;
                button_next.setVisibility(View.VISIBLE);
                button_conclusion.setVisibility(View.GONE);
                ((TextView) findViewById(R.id.count_check_q)).setText("Score: \n -0.20");
                break;
        }
    }

    public void onClick_conclusion(View view){
        if(count == 12){ alertDialog_3();}
        if(count == 32){ alertDialog_4();}
    }

    private void alertDialog_1() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("It is one of the oldest openings and is still commonly played today. \n\n" +
                "It is traditionally described as a gambit because White appears to sacrifice the c-pawn; \n\n" +
                "However, this could be considered a misnomer as Black cannot retain the pawn without incurring a disadvantage." );
        dialog.setTitle("Queens Gambit");
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
        dialog.setMessage("There are two possible ways to play this gambit: accepted gambit and declined gambit. \n\n" +
                "Accepted Queens gambit is not very successful for black, that is why it is not very popular.  \n\n" +
                "Declined Queens gambit is very popular and with knowledge how to play, position in the end will be equal." );
        dialog.setTitle("Decline or Accept?");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        button_previous.setVisibility(View.GONE);
                        button_next.setVisibility(View.GONE);
                        button_accepted.setVisibility(View.VISIBLE);
                        button_declined.setVisibility(View.VISIBLE);
                        ((TextView) findViewById(R.id.count_check_q)).setVisibility(View.GONE);
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    private void alertDialog_3() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("White has free rook and they should win a game soon \n\n" +
                "Accepted way of playing this opening is not very good for black if they do not know what to do, cause it will be very easy for them to lose pawns or even a rook(like in this example)" );
        dialog.setTitle("Conclusion: Accepted Queens Gambit");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Well Done!",Toast.LENGTH_LONG).show();
                        button_previous.setVisibility(View.GONE);
                        button_conclusion.setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.count_check_q)).setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.text_conclusion_q)).setVisibility(View.VISIBLE);
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    private void alertDialog_4() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("White has to start developing their pieces and try to manage castling.\n\n" +
                "Black actually has a simple way of playing: as they almost developed their pieces, they can start hunting for white pawns and trying to find ways to atack white king");
        dialog.setTitle("Conclusion: Declined Queens Gambit");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Well Done!",Toast.LENGTH_LONG).show();
                        button_previous.setVisibility(View.GONE);
                        button_conclusion.setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.count_check_q)).setVisibility(View.GONE);
                        ((TextView) findViewById(R.id.text_conclusion_q)).setVisibility(View.VISIBLE);
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}