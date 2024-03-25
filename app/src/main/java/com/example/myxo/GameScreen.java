package com.example.myxo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class GameScreen extends AppCompatActivity {

    int player1 = 1;
    int player2 = 2;
    int Play = 1;
    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;
    int b5 = 0;
    int b6 = 0;
    int b7 = 0;
    int b8 = 0;
    int b9 = 0;
    

    ImageButton box1;
    ImageButton box2;
    ImageButton box3;
    ImageButton box4;
    ImageButton box5;
    ImageButton box6;
    ImageButton box7;
    ImageButton box8;
    ImageButton box9;
    Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        box1 = (ImageButton) findViewById(R.id.image1);
        box2 = (ImageButton) findViewById(R.id.image2);
        box3 = (ImageButton) findViewById(R.id.image3);
        box4 = (ImageButton) findViewById(R.id.image4);
        box5 = (ImageButton) findViewById(R.id.image5);
        box6 = (ImageButton) findViewById(R.id.image6);
        box7 = (ImageButton) findViewById(R.id.image7);
        box8 = (ImageButton) findViewById(R.id.image8);
        box9 = (ImageButton) findViewById(R.id.image9);

        restart = (Button) findViewById(R.id.StartBTN);

        AlertDialog dialog = createDialog();
        dialog.show();

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });


    }
    private void startGame() {
    }
    private void TwoPlayerPlay()
    {
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b1 == 0) {
                        b1 = player1;

                        box1.setImageResource(R.drawable.x);

                        Play = 2;

                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }

                else{
                    if (b1 == 0) {
                        b1 = player2;

                        box1.setImageResource(R.drawable.o);

                        Play = 1;

                        check();

                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b2 == 0) {
                        b2 = player1;

                        box2.setImageResource(R.drawable.x);

                        Play = 2;
                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if (b2 == 0) {
                        b2 = player2;

                        box2.setImageResource(R.drawable.o);

                        Play = 1;
                        check();
                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b3 == 0) {
                        b3 = player1;

                        box3.setImageResource(R.drawable.x);

                        Play = 2;
                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if (b3 == 0) {
                        b3 = player2;

                        box3.setImageResource(R.drawable.o);

                        Play = 1;
                        check();
                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b4 == 0) {
                        b4 = player1;

                        box4.setImageResource(R.drawable.x);

                        Play = 2;
                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if (b4 == 0) {
                        b4 = player2;

                        box4.setImageResource(R.drawable.o);

                        Play = 1;
                        check();
                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b5 == 0) {
                        b5 = player1;

                        box5.setImageResource(R.drawable.x);

                        Play = 2;
                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if (b5 == 0) {
                        b5 = player2;

                        box5.setImageResource(R.drawable.o);

                        Play = 1;
                        check();
                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b6 == 0) {
                        b6 = player1;

                        box6.setImageResource(R.drawable.x);

                        Play = 2;
                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if (b6 == 0) {
                        b6 = player2;

                        box6.setImageResource(R.drawable.o);

                        Play = 1;
                        check();
                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b7 == 0) {
                        b7 = player1;

                        box7.setImageResource(R.drawable.x);

                        Play = 2;
                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if (b7 == 0) {
                        b7 = player2;

                        box7.setImageResource(R.drawable.o);

                        Play = 1;
                        check();
                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b8 == 0) {
                        b8 = player1;

                        box8.setImageResource(R.drawable.x);

                        Play = 2;
                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if (b8 == 0) {
                        b8 = player2;

                        box8.setImageResource(R.drawable.o);

                        Play = 1;
                        check();
                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Play == 1) {
                    if (b9 == 0) {
                        b9 = player1;

                        box9.setImageResource(R.drawable.x);

                        Play = 2;
                        check();
                    }
                    else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if (b9 == 0) {
                        b9 = player2;

                        box9.setImageResource(R.drawable.o);

                        Play = 1;
                        check();
                    } else {
                        Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    private void check() {
        //-----------------------------Combo1-
        if (b1 == player1 && b2 == player1 && b3 == player1)
        {
            Toast.makeText(this, "Player 1 Won", Toast.LENGTH_SHORT).show();

            stopGame();

        } else if (b1 == player2 && b2 == player2 && b3 == player2) {
            Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show();

            stopGame();


        }
        //------------------------------combo2-
        if (b4 == player1 && b5 == player1 && b6 == player1)
        {
            Toast.makeText(this, "Player 1 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        } else if (b4 == player2 && b5 == player2 && b6 == player2) {
            Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        }
        //------------------------------combo3-
        if (b7 == player1 && b8 == player1 && b9 == player1)
        {
            Toast.makeText(this, "Player 1 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        } else if (b7 == player2 && b8 == player2 && b9 == player2) {
            Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        }
        //-----------------------------combo4-
        if (b1 == player1 && b4 == player1 && b7 == player1)
        {
            Toast.makeText(this, "Player 1 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        } else if (b1 == player2 && b4 == player2 && b7 == player2) {
            Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        }
        //------------------------------combo5-
        if (b2 == player1 && b5 == player1 && b8 == player1)
        {
            Toast.makeText(this, "Player 1 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        } else if (b2 == player2 && b5 == player2 && b8 == player2) {
            Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        }
        //------------------------------combo6-
        if (b3 == player1 && b6 == player1 && b9 == player1)
        {
            Toast.makeText(this, "Player 1 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        } else if (b3 == player2 && b6 == player2 && b9 == player2) {
            Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        }
        //-------------------------------combo7-
        if (b1 == player1 && b5 == player1 && b9 == player1)
        {
            Toast.makeText(this, "Player 1 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        } else if (b1 == player2 && b5 == player2 && b9 == player2) {
            Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        }
        //-------------------------------combo8-
        if (b3 == player1 && b5 == player1 && b7 == player1)
        {
            Toast.makeText(this, "Player 1 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        } else if (b3 == player2 && b5 == player2 && b7 == player2) {
            Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show();

            stopGame();
        }
    }
    AlertDialog createDialog()
    {

        Builder builder = new Builder(GameScreen.this);
        builder.setMessage("How many players?");
        builder.setPositiveButton("Two", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(GameScreen.this, "Two Player", Toast.LENGTH_SHORT).show();
                TwoPlayerPlay();

            }
        });
        builder.setNegativeButton("One", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(GameScreen.this, "One Player", Toast.LENGTH_SHORT).show();
                OnePlayerPLay();

            }


        });

        return builder.create();
    }
    private void OnePlayerPLay() {
            box1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Play is to check which player is playing, if play is equal to 1 means player1 has to play
                    // B1 is to check if Box 1 has been played
                    if (Play == 1) {
                        if (b1 == 0) {
                            b1 = player2;

                            box1.setImageResource(R.drawable.o);

                            Play = 2;

                            check();

                            botNextMove();

                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            });

            box2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Play == 1) {
                        if (b2 == 0) {
                            b2 = player2;

                            box2.setImageResource(R.drawable.o);

                            Play = 2;
                            check();
                            botNextMove();
                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
            });

            box3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Play == 1) {
                        if (b3 == 0) {
                            b3 = player2;

                            box3.setImageResource(R.drawable.o);

                            Play = 2;
                            check();
                            botNextMove();
                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            box4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Play == 1) {
                        if (b4 == 0) {
                            b4 = player2;

                            box4.setImageResource(R.drawable.o);

                            Play = 2;
                            check();
                            botNextMove();
                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            box5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Play == 1) {

                        if (b5 == 0) {
                            b5 = player2;

                            box5.setImageResource(R.drawable.o);

                            Play = 2;
                            check();
                            botNextMove();
                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            box6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Play == 1) {
                        if (b6 == 0) {
                            b6 = player2;

                            box6.setImageResource(R.drawable.o);

                            Play = 2;
                            check();
                            botNextMove();
                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            box7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Play == 1) {

                        if (b7 == 0) {
                            b7 = player2;

                            box7.setImageResource(R.drawable.o);

                            Play = 2;
                            check();
                            botNextMove();
                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            box8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Play == 1) {

                        if (b8 == 0) {
                            b8 = player2;

                            box8.setImageResource(R.drawable.o);

                            Play = 2;
                            check();
                            botNextMove();
                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            box9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Play == 1) {
                        if (b9 == 0) {
                            b9 = player2;

                            box9.setImageResource(R.drawable.o);

                            Play = 2;
                            check();
                            botNextMove();
                        } else {
                            Toast.makeText(GameScreen.this, "SORRY Move Already Played", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
    }

    private void botNextMove() {

            if (b1 != player2 && b1 != player1 && Play == 2) {
                box1.setImageResource(R.drawable.x);
                Play = 1;
                b1 = player1;
            }

            else if (b9 != player2 && b9 != player1 && Play == 2) {
                box9.setImageResource(R.drawable.x);
                Play = 1;
                b9 = player1;
            }

            else if (b7 != player2 && b7 != player1 && Play == 2) {
                box7.setImageResource(R.drawable.x);
                Play = 1;
                b7 = player1;
            }

            else if (b5 != player2 && b5 != player1 && Play == 2) {
                box5.setImageResource(R.drawable.x);
                Play = 1;
                b5 = player1;
            }

            else if (b4 != player2 && b4 != player1 && Play == 2) {
                box4.setImageResource(R.drawable.x);
                Play = 1;
                b4 = player1;
            }

             else if (b2 != player2 && b2 != player1 && Play == 2) {
                box2.setImageResource(R.drawable.x);
                Play = 1;
                b2 = player1;
                Toast.makeText(this, "Box 2 Selected", Toast.LENGTH_SHORT).show();
            }


            else if (b3 != player2 && b3 != player1 && Play == 2) {
                box3.setImageResource(R.drawable.x);
                Play = 1;
                b3 = player1;
                Toast.makeText(this, "Box 3 Selected", Toast.LENGTH_SHORT).show();
            }

            else if (b6 != player2 && b6 != player1 && Play == 2) {
                box6.setImageResource(R.drawable.x);
                Play = 1;
                b6 = player1;
            }


            else if (b8 != player2 && b8 != player1 && Play == 2) {
                box8.setImageResource(R.drawable.x);
                Play = 1;
                b8 = player1;
            }

            check();
    }

    private void stopGame() {
        box1.setEnabled(false);
        box2.setEnabled(false);
        box3.setEnabled(false);
        box4.setEnabled(false);
        box5.setEnabled(false);
        box6.setEnabled(false);
        box7.setEnabled(false);
        box8.setEnabled(false);
        box9.setEnabled(false);

    }
}