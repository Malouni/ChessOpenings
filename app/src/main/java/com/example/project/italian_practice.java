package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class italian_practice extends AppCompatActivity {
    int pawn_move;
    int bishop_move;
    int rook_move;
    int queen_move;
    int knight_move;
    int king_move;
    int correct_moves[] = new int[64];
    int pawns[] = new int[8];
    int count = 0;

    ImageButton buttons[] = new ImageButton[64];
    ImageView imageView1;
    ImageView imageView2;

    boolean pawn_active = false;
    boolean rook_active = false;
    boolean knight_active = false;
    boolean bishop_active = false;
    boolean queen_active = false;
    boolean king_active = false;
    boolean pawn_moves = false;
    boolean rook_moves = false;
    boolean knight_moves = false;
    boolean bishop_moves = false;
    boolean queen_moves = false;
    boolean king_moves = false;

    int field[] = new int [64];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_practice);
        getSupportActionBar().hide();
        alertDialog_2();
        for(int i = 0; i <= 63; i++){
            field[i] = 7;
        }
        for(int i = 0; i < 8; i++){
            pawns[i] = 0;
        }

        correct_moves[0] = 35;  correct_moves[1] = 42;  correct_moves[2] = 19;
        correct_moves[3] = 18;  correct_moves[4] = 26;  correct_moves[5] = 48;
        correct_moves[6] = 10;  correct_moves[7] = 58;  correct_moves[8] = 12;
        correct_moves[9] = 19;  correct_moves[10] = 19;  correct_moves[11] = 19;
        correct_moves[12] = 19;  correct_moves[13] = 19;  correct_moves[14] = 19;
        correct_moves[26] = 25;  correct_moves[27] = 19;  correct_moves[28] = 19;


        field[0] = 5;   field[1] = 1;   field[8] = 2;   field[9] = 1;
        field[16] = 3;  field[17] = 1;  field[24] = 4;  field[25] = 1;
        field[32] = 6;  field[33] = 1;  field[40] = 3;  field[41] = 1;
        field[48] = 2;  field[49] = 1;  field[56] = 5;  field[57] = 1;
        field[6] = 8;   field[7] = 8;   field[14] = 8;  field[15] = 8;
        field[22] = 8;  field[23] = 8;  field[30] = 8;  field[31] = 8;
        field[38] = 8;  field[39] = 8;  field[46] = 8;  field[47] = 8;
        field[54] = 8;  field[55] = 8;  field[62] = 8;  field[63] = 8;
        buttons[0] = (ImageButton)findViewById(R.id.a1); buttons[1] = (ImageButton)findViewById(R.id.a2);
        buttons[2] = (ImageButton)findViewById(R.id.a3); buttons[3] = (ImageButton)findViewById(R.id.a4);
        buttons[4] = (ImageButton)findViewById(R.id.a5); buttons[5] = (ImageButton)findViewById(R.id.a6);
        buttons[6] = (ImageButton)findViewById(R.id.a7); buttons[7] = (ImageButton)findViewById(R.id.a8);

        buttons[8] = (ImageButton)findViewById(R.id.b1); buttons[9] = (ImageButton)findViewById(R.id.b2);
        buttons[10] = (ImageButton)findViewById(R.id.b3); buttons[11] = (ImageButton)findViewById(R.id.b4);
        buttons[12] = (ImageButton)findViewById(R.id.b5); buttons[13] = (ImageButton)findViewById(R.id.b6);
        buttons[14] = (ImageButton)findViewById(R.id.b7); buttons[15] = (ImageButton)findViewById(R.id.b8);

        buttons[16] = (ImageButton)findViewById(R.id.c1); buttons[17] = (ImageButton)findViewById(R.id.c2);
        buttons[18] = (ImageButton)findViewById(R.id.c3); buttons[19] = (ImageButton)findViewById(R.id.c4);
        buttons[20] = (ImageButton)findViewById(R.id.c5); buttons[21] = (ImageButton)findViewById(R.id.c6);
        buttons[22] = (ImageButton)findViewById(R.id.c7); buttons[23] = (ImageButton)findViewById(R.id.c8);

        buttons[24] = (ImageButton)findViewById(R.id.d1); buttons[25] = (ImageButton)findViewById(R.id.d2);
        buttons[26] = (ImageButton)findViewById(R.id.d3); buttons[27] = (ImageButton)findViewById(R.id.d4);
        buttons[28] = (ImageButton)findViewById(R.id.d5); buttons[29] = (ImageButton)findViewById(R.id.d6);
        buttons[30] = (ImageButton)findViewById(R.id.d7); buttons[31] = (ImageButton)findViewById(R.id.d8);

        buttons[32] = (ImageButton)findViewById(R.id.e1); buttons[33] = (ImageButton)findViewById(R.id.e2);
        buttons[34] = (ImageButton)findViewById(R.id.e3); buttons[35] = (ImageButton)findViewById(R.id.e4);
        buttons[36] = (ImageButton)findViewById(R.id.e5); buttons[37] = (ImageButton)findViewById(R.id.e6);
        buttons[38] = (ImageButton)findViewById(R.id.e7); buttons[39] = (ImageButton)findViewById(R.id.e8);

        buttons[40] = (ImageButton)findViewById(R.id.f1); buttons[41] = (ImageButton)findViewById(R.id.f2);
        buttons[42] = (ImageButton)findViewById(R.id.f3); buttons[43] = (ImageButton)findViewById(R.id.f4);
        buttons[44] = (ImageButton)findViewById(R.id.f5); buttons[45] = (ImageButton)findViewById(R.id.f6);
        buttons[46] = (ImageButton)findViewById(R.id.f7); buttons[47] = (ImageButton)findViewById(R.id.f8);

        buttons[48] = (ImageButton)findViewById(R.id.g1); buttons[49] = (ImageButton)findViewById(R.id.g2);
        buttons[50] = (ImageButton)findViewById(R.id.g3); buttons[51] = (ImageButton)findViewById(R.id.g4);
        buttons[52] = (ImageButton)findViewById(R.id.g5); buttons[53] = (ImageButton)findViewById(R.id.g6);
        buttons[54] = (ImageButton)findViewById(R.id.g7); buttons[55] = (ImageButton)findViewById(R.id.g8);

        buttons[56] = (ImageButton)findViewById(R.id.h1); buttons[57] = (ImageButton)findViewById(R.id.h2);
        buttons[58] = (ImageButton)findViewById(R.id.h3); buttons[59] = (ImageButton)findViewById(R.id.h4);
        buttons[60] = (ImageButton)findViewById(R.id.h5); buttons[61] = (ImageButton)findViewById(R.id.h6);
        buttons[62] = (ImageButton)findViewById(R.id.h7); buttons[63] = (ImageButton)findViewById(R.id.h8);

        imageView1 = (ImageView) findViewById(R.id.think);
        imageView1.setVisibility(View.VISIBLE);
        imageView2 = (ImageView) findViewById(R.id.concl);
        imageView2.setVisibility(View.GONE);
    }
    public void undoforall(int place) {
        if(field[place] == 1) {
            field[pawn_move] = 1;
            field[place] = 7;
            buttons[pawn_move].setForeground(getDrawable(R.drawable.piece_2));
            buttons[place].setForeground(null);
            count --;
        } else if (field[place] == 2) {
            field[knight_move] = 2;
            field[place] = 7;
            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
            buttons[place].setForeground(null);
            count--;
        } else if (field[place] == 3) {
            field[bishop_move] = 3;
            field[place] = 7;
            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
            buttons[place].setForeground(null);
            count--;
        } else if (field[place] == 4) {
            field[queen_move] = 4;
            field[place] = 7;
            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
            buttons[place].setForeground(null);
            count--;
        } else if (field[place] == 5) {
            field[rook_move] = 5;
            field[place] = 7;
            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
            buttons[place].setForeground(null);
            count--;
        } else if (field[place] == 6) {
            field[king_move] = 6;
            field[place] = 7;
            buttons[king_move].setForeground(getDrawable(R.drawable.piece_6));
            buttons[place].setForeground(null);
            count--;
        }
    }

    public void pawnMove(int place){
        pawn_move = place;
        place += 1;
        if (place > 0 || place < 63) {
            if (field[place] == 7) {
                buttons[place].setForeground(getDrawable(R.drawable.greycircle));
                field[place] = 0;
            }
        }
        place += 1;
        if (place > 0 || place < 63) {
            if (field[place] == 7) {
                buttons[place].setForeground(getDrawable(R.drawable.greycircle));
                field[place] = 0;
            }
        }
        pawn_active = true;
    }
    public void getPlace(int tags) {
        int place = tags;
        tags = field[tags];
        if (tags == 1) {
            pawn_moves = true;
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (pawn_active == true) {
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (pawn_moves == true) {
                pawn_move = place;
                if (place == 1) {
                    pawnMove(place);
                } else if (place == 9) {
                    pawnMove(place);
                } else if (place == 17) {
                    pawnMove(place);
                } else if (place == 25) {
                    pawnMove(place);
                } else if (place == 33) {
                    pawnMove(place);
                } else if (place == 41) {
                    pawnMove(place);
                } else if (place == 49) {
                    pawnMove(place);
                } else if (place == 57) {
                    pawnMove(place);
                } else {
                    place += 1;
                    if (place > 0 || place < 63) {
                        if (field[place] == 7) {
                            buttons[place].setForeground(getDrawable(R.drawable.greycircle));
                            field[place] = 0;
                        }
                    }
                    pawn_active = true;
                    if (knight_active == true) {
                        knight_active = false;
                    }
                    if (king_active == true) {
                        king_active = false;
                    }
                    if (bishop_active == true) {
                        bishop_active = false;
                    }
                    if (queen_active == true) {
                        queen_active = false;
                    }
                    if (rook_active == true) {
                        rook_active = false;
                    }
                }
            }
        }
        if (tags == 2) {
            int kn = place;
            knight_move = place;
            knight_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                kn += 10;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn -= 6;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn += 17;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn += 15;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn -= 15;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn -= 17;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn -= 10;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn += 6;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                knight_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
            }

        }
        if (tags == 3) {
            int k = place;
            bishop_move = place;
            bishop_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                k += 9;
                if (k <= 63) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k += 9;
                        if (k > 63) {
                            break;
                        }
                    }
                }
                k = place;
                k -= 7;
                if (k >= 0) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k -= 7;
                        if (k < 0) {
                            break;
                        }
                    }
                }
                k = place;
                k += 7;
                if (k <= 63) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k += 7;
                        if (k > 63) {
                            break;
                        }
                    }
                }
                k = place;
                k -= 9;
                if (k >= 0) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k -= 9;
                        if (k < 0) {
                            break;
                        }
                    }
                }
                bishop_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (knight_active == true) {
                    knight_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
            }

        }
        if (tags == 4) {
            int k = place;
            queen_move = place;
            queen_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }

            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                k += 9;
                if (k <= 63) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k += 9;
                        if (k > 63) {
                            break;
                        }
                    }
                }
                k = place;
                k -= 7;
                if (k >= 0) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k -= 7;
                        if (k < 0) {
                            break;
                        }
                    }
                }
                k = place;
                k += 7;
                if (k <= 63) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k += 7;
                        if (k > 63) {
                            break;
                        }
                    }
                }
                k = place;
                k -= 9;
                if (k >= 0) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k -= 9;
                        if (k < 0) {
                            break;
                        }
                    }
                }
                int r = place;
                r += 1;
                if (r < 63) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r += 1;
                        if (r > 63) {
                            break;
                        }
                    }
                }
                r = place;
                r -= 1;
                if (r > 0) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r -= 1;
                        if (r < 0) {
                            break;
                        }
                    }
                }
                r = place;
                r += 8;
                if (r <= 63) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r += 8;
                        if (r > 63) {
                            break;
                        }
                    }
                }
                r = place;
                r -= 8;
                if (r >= 0) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r -= 8;
                        if (r <= 0) {
                            break;
                        }
                    }
                }
                queen_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (knight_active == true) {
                    knight_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
            }
        }
        if (tags == 5) {
            rook_move = place;
            rook_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                int r = place;
                r += 1;
                if (r < 63) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r += 1;
                        if (r > 63) {
                            break;
                        }
                    }
                }
                r = place;
                r -= 1;
                if (r > 0) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r -= 1;
                        if (r < 0) {
                            break;
                        }
                    }
                }
                r = place;
                r += 8;
                if (r <= 63) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r += 8;
                        if (r > 63) {
                            break;
                        }
                    }
                }
                r = place;
                r -= 8;
                if (r >= 0) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r -= 8;
                        if (r <= 0) {
                            break;
                        }
                    }
                }
                rook_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (knight_active == true) {
                    knight_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
            }
        }
        if (tags == 6) {
            int kng = place;
            king_move = place;
            king_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                kng += 1;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng -= 1;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng += 7;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng -= 7;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng += 8;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                        if (kng + 8 <= 63) {
                            if (field[kng + 8] == 7) {
                                buttons[kng + 8].setForeground(getDrawable(R.drawable.greycircle));
                                field[kng + 8] = 0;
                            }
                        }
                    }
                }
                kng = place;
                kng -= 8;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng += 9;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng -= 9;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                king_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
                if (knight_active == true) {
                    knight_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
            }

        }
        if (tags == 0) {
            if (pawn_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_2));
                field[place] = 1;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[pawn_move].setForeground(null);
                field[pawn_move] = 7;
                pawn_active = false;
                count++;
            }
            if (knight_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_6));
                field[place] = 2;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[knight_move].setForeground(null);
                field[knight_move] = 7;
                knight_active = false;
                count++;
            }
            if (bishop_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_7));
                field[place] = 3;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                int k = bishop_move;
                buttons[bishop_move].setForeground(null);
                field[bishop_move] = 7;
                bishop_active = false;
                count++;
            }
            if (queen_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_10));
                field[place] = 4;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[queen_move].setForeground(null);
                field[queen_move] = 7;
                queen_active = false;
                count++;
            }
            if (rook_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_4));
                field[place] = 5;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[rook_move].setForeground(null);
                field[rook_move] = 7;
                rook_active = false;
                count++;
            }
            if (king_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_11));
                field[place] = 6;
                if (field[place + 8] == 5) {
                    field[place + 8] = 7;
                    buttons[place + 8].setForeground(null);
                    buttons[place - 8].setForeground(getDrawable(R.drawable.piece_4));
                    field[place - 8] = 5;
                }
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[king_move].setForeground(null);
                field[king_move] = 7;
                king_active = false;
                count++;
            }

            switch (count) {
                case 1:
                    if (place == correct_moves[0]) {
                        if (field[place] == 1) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[38].setForeground(null);
                                    buttons[36].setForeground(getDrawable(R.drawable.piece_1));
                                    field[38] = 7;
                                    field[36] = 8;
                                }
                            }.start();
                        } else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 3){
                            field[bishop_move] = 3;
                            field[place] = 7;
                            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;

                case 2:
                    if (place == correct_moves[1]) {
                        if (field[place] == 2) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[15].setForeground(null);
                                    buttons[21].setForeground(getDrawable(R.drawable.piece_5));
                                    field[15] = 7;
                                    field[21] = 8;
                                }
                            }.start();
                        }else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 3){
                            field[bishop_move] = 3;
                            field[place] = 7;
                            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_11));
                            buttons[place].setForeground(null);
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;

                case 3:
                    if (place == correct_moves[2]) {
                        if (field[place] == 3) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[47].setForeground(null);
                                    buttons[20].setForeground(getDrawable(R.drawable.piece_8));
                                    field[47] = 7;
                                    field[19] = 8;
                                }
                            }.start();
                        } else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);

                        }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;

                case 4:
                    if (place == correct_moves[3]) {
                        if (field[place] == 1) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[55].setForeground(null);
                                    buttons[45].setForeground(getDrawable(R.drawable.piece_5));
                                    field[55] = 7;
                                    field[45] = 8;
                                }
                            }.start();
                        }else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 3){
                            field[bishop_move] = 3;
                            field[place] = 7;
                            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_11));
                            buttons[place].setForeground(null);
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;

                case 5:
                    if (place == correct_moves[4]) {
                        if (field[place] == 1) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[30].setForeground(null);
                                    buttons[29].setForeground(getDrawable(R.drawable.piece_1));
                                    field[30] = 7;
                                    field[29] = 8;
                                }
                            }.start();
                        } else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 3){
                            field[bishop_move] = 3;
                            field[place] = 7;
                            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;

                case 6:
                    if (place == correct_moves[5]) {
                        if (field[place] == 6) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[39].setForeground(null);
                                    buttons[55].setForeground(getDrawable(R.drawable.piece_12));
                                    buttons[63].setForeground(null);
                                    buttons[47].setForeground(getDrawable(R.drawable.piece_3));
                                    field[39] = 7;
                                    field[55] = 8;
                                    field[63] = 7;
                                    field[47] = 8;
                                }
                            }.start();
                        }else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 3){
                            field[bishop_move] = 3;
                            field[place] = 7;
                            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_11));
                            buttons[place].setForeground(null);
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;

                case 7:
                    if (place == correct_moves[6] || place == correct_moves[26]) {
                        if (field[place] == 2) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[6].setForeground(null);
                                    buttons[4].setForeground(getDrawable(R.drawable.piece_1));
                                    field[6] = 7;
                                    field[4] = 8;
                                }
                            }.start();
                        } else if (field[place] == 3) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[62].setForeground(null);
                                    buttons[61].setForeground(getDrawable(R.drawable.piece_1));
                                    field[62] = 7;
                                    field[61] = 8;
                                }
                            }.start();
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;

                case 8:
                    if (place == correct_moves[7]) {
                        if (field[place] == 1) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[23].setForeground(null);
                                    buttons[37].setForeground(getDrawable(R.drawable.piece_8));
                                    field[23] = 7;
                                    field[37] = 8;
                                }
                            }.start();

                            CountDownTimer countDownTimer1 = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    alertDialog_3();
                                }
                            }.start();
                        } else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 3){
                            field[bishop_move] = 3;
                            field[place] = 7;
                            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;

                case 9:
                    if (place == correct_moves[8]) {
                        if (field[place] == 3) {
                            CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }
                                public void onFinish() {
                                    buttons[31].setForeground(null);
                                    buttons[23].setForeground(getDrawable(R.drawable.piece_9));
                                    field[31] = 7;
                                    field[23] = 8;
                                }
                            }.start();
                        } else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 3){
                            field[bishop_move] = 3;
                            field[place] = 7;
                            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }
                    } else {
                        undoforall(place);
                        alertDialog_1();
                    }
                    break;
            }
        }
    }

    public void onCLick_Italian_Practice_a1(View view) {
        int i = Integer.parseInt((String) buttons[0].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a2(View view) {
        int i = Integer.parseInt((String) buttons[1].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a3(View view) {
        int i = Integer.parseInt((String) buttons[2].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a4(View view) {
        int i = Integer.parseInt((String) buttons[3].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a5(View view) {
        int i = Integer.parseInt((String) buttons[4].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a6(View view) {
        int i = Integer.parseInt((String) buttons[5].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a7(View view) {
        int i = Integer.parseInt((String) buttons[6].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b1(View view) {
        int i = Integer.parseInt((String) buttons[8].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b2(View view) {
        int i = Integer.parseInt((String) buttons[9].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b3(View view) {
        int i = Integer.parseInt((String) buttons[10].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b4(View view) {
        int i = Integer.parseInt((String) buttons[11].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b5(View view) {
        int i = Integer.parseInt((String) buttons[12].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b6(View view) {
        int i = Integer.parseInt((String) buttons[13].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b7(View view) {
        int i = Integer.parseInt((String) buttons[14].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c1(View view) {
        int i = Integer.parseInt((String) buttons[16].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c2(View view) {
        int i = Integer.parseInt((String) buttons[17].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c3(View view) {
        int i = Integer.parseInt((String) buttons[18].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c4(View view) {
        int i = Integer.parseInt((String) buttons[19].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c5(View view) {
        int i = Integer.parseInt((String) buttons[20].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c6(View view) {
        int i = Integer.parseInt((String) buttons[21].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c7(View view) {
        int i = Integer.parseInt((String) buttons[22].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d1(View view) {
        int i = Integer.parseInt((String) buttons[24].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d2(View view) {
        int i = Integer.parseInt((String) buttons[25].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d3(View view) {
        int i = Integer.parseInt((String) buttons[26].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d4(View view) {
        int i = Integer.parseInt((String) buttons[27].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d5(View view) {
        int i = Integer.parseInt((String) buttons[28].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d6(View view) {
        int i = Integer.parseInt((String) buttons[29].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d7(View view) {
        int i = Integer.parseInt((String) buttons[30].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e1(View view) {
        int i = Integer.parseInt((String) buttons[32].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e2(View view) {
        int i = Integer.parseInt((String) buttons[33].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e3(View view) {
        int i = Integer.parseInt((String) buttons[34].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e4(View view) {
        int i = Integer.parseInt((String) buttons[35].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e5(View view) {
        int i = Integer.parseInt((String) buttons[36].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e6(View view) {
        int i = Integer.parseInt((String) buttons[37].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e7(View view) {
        int i = Integer.parseInt((String) buttons[38].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f1(View view) {
        int i = Integer.parseInt((String) buttons[40].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f2(View view) {
        int i = Integer.parseInt((String) buttons[41].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f3(View view) {
        int i = Integer.parseInt((String) buttons[42].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f4(View view) {
        int i = Integer.parseInt((String) buttons[43].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f5(View view) {
        int i = Integer.parseInt((String) buttons[44].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f6(View view) {
        int i = Integer.parseInt((String) buttons[45].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f7(View view) {
        int i = Integer.parseInt((String) buttons[46].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g1(View view) {
        int i = Integer.parseInt((String) buttons[48].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g2(View view) {
        int i = Integer.parseInt((String) buttons[49].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g3(View view) {
        int i = Integer.parseInt((String) buttons[50].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g4(View view) {
        int i = Integer.parseInt((String) buttons[51].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g5(View view) {
        int i = Integer.parseInt((String) buttons[52].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g6(View view) {
        int i = Integer.parseInt((String) buttons[53].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g7(View view) {
        int i = Integer.parseInt((String) buttons[54].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h1(View view) {
        int i = Integer.parseInt((String) buttons[56].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h2(View view) {
        int i = Integer.parseInt((String) buttons[57].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h3(View view) {
        int i = Integer.parseInt((String) buttons[58].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h4(View view) {
        int i = Integer.parseInt((String) buttons[59].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h5(View view) {
        int i = Integer.parseInt((String) buttons[60].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h6(View view) {
        int i = Integer.parseInt((String) buttons[61].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h7(View view) {
        int i = Integer.parseInt((String) buttons[62].getTag());
        getPlace(i);
    }

    private void alertDialog_1() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("This move is not correct!!!");
        dialog.setTitle("Warning!");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Try again!",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    private void alertDialog_2() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Here you can use interactive board to test your knowledge of opening\n\n" +
                "If your move is not correct, you will have a chance to try again, so don't worry!");
        dialog.setTitle("Practice: Italian Opening");
        dialog.setPositiveButton("PRACTICE",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"LET'S GO!!!",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    private void alertDialog_3() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("You have done a great job!!\n\n" +
                "Italian Opening Practice is completed.\n\n" +
                "Now you can learn and practice more openings!");
        dialog.setTitle("Practice: Italian Opening");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        imageView2.setVisibility(View.VISIBLE);
                        imageView1.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(),"GREAT JOB!!!",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    public void onClick_pr_italian_back(View view) {
        Intent italian_intent_back = new Intent(this, Practice_Activity.class);
        startActivity(italian_intent_back);
    }
}