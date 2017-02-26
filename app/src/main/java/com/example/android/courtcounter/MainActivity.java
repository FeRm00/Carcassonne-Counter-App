package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    int castlesNumber1 = 0;
    int castlesNumber2 = 0;
    int shieldsNumber1 = 0;
    int shieldsNumber2 = 0;
    int cloistersNumber1 = 0;
    int cloistersNumber2 = 0;
    int roadsNumber1 = 0;
    int roadsNumber2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays Score for Player 1 and 2.
     */

    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Castles
     */

    //Player 1

    public void displayCastles1(int number) {
        TextView numberView = (TextView) findViewById(R.id.numberOfCastles1);
        numberView.setText(String.valueOf(number));
    }

    public void decrementCastle1 (View v) {
        castlesNumber1 = castlesNumber1 - 1;
        displayCastles1(castlesNumber1);
    }

    public void incrementCastle1 (View v) {
        castlesNumber1 = castlesNumber1 + 1;
        displayCastles1(castlesNumber1);
    }

    //Player 2

    public void displayCastles2(int number) {
        TextView numberView = (TextView) findViewById(R.id.numberOfCastles2);
        numberView.setText(String.valueOf(number));
    }


    public void decrementCastle2 (View v) {
        castlesNumber2 = castlesNumber2 - 1;
        displayCastles2(castlesNumber2);
    }

    public void incrementCastle2 (View v) {
        castlesNumber2 = castlesNumber2 + 1;
        displayCastles2(castlesNumber2);
    }

    /**
     * Shields
     */

    //Player 1

    public void displayShields1(int number) {
        TextView numberView = (TextView) findViewById(R.id.numberOfShields1);
        numberView.setText(String.valueOf(number));
    }

    public void decrementShield1 (View v) {
        shieldsNumber1 = shieldsNumber1 - 1;
        displayShields1(shieldsNumber1);
    }

    public void incrementShield1 (View v) {
        shieldsNumber1 = shieldsNumber1 + 1;
        displayShields1(shieldsNumber1);
    }

    //Player 2

    public void displayShields2(int number) {
        TextView numberView = (TextView) findViewById(R.id.numberOfShields2);
        numberView.setText(String.valueOf(number));
    }


    public void decrementShield2 (View v) {
        shieldsNumber2 = shieldsNumber2 - 1;
        displayShields2(shieldsNumber2);
    }

    public void incrementShield2 (View v) {
        shieldsNumber2 = shieldsNumber2 + 1;
        displayShields2(shieldsNumber2);
    }

    /**
     * Add Castles and Shields points to Score for Player 1 and Player 2
     */

    public void addCastlePoints1 (View v) {
        int calCastlePoints1;
        calCastlePoints1 = shieldsNumber1 *2 + castlesNumber1 * 2;
        scorePlayer1 = scorePlayer1 + calCastlePoints1;
        displayForPlayer1(scorePlayer1);

        castlesNumber1 = 0;
        shieldsNumber1 = 0;
        displayCastles1(castlesNumber1);
        displayShields1(shieldsNumber1);
    }

    public void addCastlePoints2 (View v) {
        int calCastlePoints2;
        calCastlePoints2 = shieldsNumber2 *2 + castlesNumber2 * 2;
        scorePlayer2 = scorePlayer2 + calCastlePoints2;
        displayForPlayer2(scorePlayer2);

        castlesNumber2 = 0;
        shieldsNumber2 = 0;
        displayCastles1(castlesNumber2);
        displayShields1(shieldsNumber2);
    }

    /**
     * Cloister
     */

    //Player 1

    public void displayCloisters1(int number) {
        TextView numberView = (TextView) findViewById(R.id.numberOfCloisters1);
        numberView.setText(String.valueOf(number));
    }

    public void decrementCloister1 (View v) {
        cloistersNumber1 = cloistersNumber1 - 1;
        displayCloisters1(cloistersNumber1);
    }

    public void incrementCloister1 (View v) {
        if (cloistersNumber1 < 9 ) {
            cloistersNumber1 = cloistersNumber1 + 1;
        } else {
            cloistersNumber1 = 9;
        }
        displayCloisters1(cloistersNumber1);
    }

    //Player 2

    public void displayCloisters2(int number) {
        TextView numberView = (TextView) findViewById(R.id.numberOfCloisters2);
        numberView.setText(String.valueOf(number));
    }

    public void decrementCloister2 (View v) {
        cloistersNumber2 = cloistersNumber2 - 1;
        displayCloisters2(cloistersNumber2);
    }

    public void incrementCloister2 (View v) {
        if (cloistersNumber2 < 9 ) {
            cloistersNumber2 = cloistersNumber2 + 1;
        } else {
            cloistersNumber2 = 9;
        }
        displayCloisters2(cloistersNumber2);
    }

    /**
     * Add Cloisters points to Score for Player 1 and Player 2
     */

    public void addCloisterPoints1 (View v) {
        int calCloisterPoints1;
        calCloisterPoints1 = cloistersNumber1;
        scorePlayer1 = scorePlayer1 + calCloisterPoints1;
        displayForPlayer1(scorePlayer1);

        cloistersNumber1 =0;
        displayCloisters1(cloistersNumber1);
    }

    public void addCloisterPoints2 (View v) {
        int calCloisterPoints2;
        calCloisterPoints2 = cloistersNumber2;
        scorePlayer2 = scorePlayer2 + calCloisterPoints2;
        displayForPlayer2(scorePlayer2);

        cloistersNumber2 =0;
        displayCloisters2(cloistersNumber2);
    }

    /**
     * Road
     */

    //Player 1

    public void displayRoads1(int number) {
        TextView numberView = (TextView) findViewById(R.id.numberOfRoads1);
        numberView.setText(String.valueOf(number));
    }

    public void decrementRoad1 (View v) {
        roadsNumber1 = roadsNumber1 - 1;
        displayRoads1(roadsNumber1);
    }

    public void incrementRoad1 (View v) {
        roadsNumber1 = roadsNumber1 + 1;
        displayRoads1(roadsNumber1);
    }

    //Player 2

    public void displayRoads2(int number) {
        TextView numberView = (TextView) findViewById(R.id.numberOfRoads2);
        numberView.setText(String.valueOf(number));
    }

    public void decrementRoad2 (View v) {
        roadsNumber2 = roadsNumber2 - 1;
        displayRoads2(roadsNumber2);
    }

    public void incrementRoad2 (View v) {
        roadsNumber2 = roadsNumber2 + 1;
        displayRoads2(roadsNumber2);
    }

    /**
     * Add Roads points to Score for Player 1 and Player 2
     */

    public void addRoadPoints1 (View v) {
        int calRoadPoints1;
        calRoadPoints1 = roadsNumber1;
        scorePlayer1 = scorePlayer1 + calRoadPoints1;
        displayForPlayer1(scorePlayer1);

        roadsNumber1 =0;
        displayRoads1(roadsNumber1);
    }

    public void addRoadPoints2 (View v) {
        int calRoadPoints2;
        calRoadPoints2 = roadsNumber2;
        scorePlayer2 = scorePlayer2 + calRoadPoints2;
        displayForPlayer2(scorePlayer2);

        roadsNumber2 =0;
        displayRoads2(roadsNumber2);
    }

    /**
     *  Reset Score
     */

    public void resetScore (View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;

        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }
}

