package com.example.android.tenniscounter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int LOVE = 0;
    final int FIFTEEN = 15;
    final int THIRTY = 30;
    final int FOURTY = 40;
    int points_For_Player1 = 0;
    int sets_For_Player1 = 0;
    int games_For_Player1 = 0;
    int points_For_Player2 = 0;
    int sets_For_Player2 = 0;
    int games_For_Player2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the score for Player 1.
     */

    public void displayForPlayer1(int points, int sets, int games) {
        TextView pointsView_1 = (TextView) findViewById(R.id.pointsForPlayer1);
        TextView setsView_1 = (TextView) findViewById(R.id.setsForPlayer1);
        TextView gamesView_1 = (TextView) findViewById(R.id.gamesForPlayer1);
        pointsView_1.setText(String.valueOf(points));
        setsView_1.setText(String.valueOf(sets));
        gamesView_1.setText(String.valueOf(games));
    }

    /**
     * Displays the score for Player 2.
     */

    public void displayForPlayer2(int points, int sets, int games) {
        TextView pointsView_2 = (TextView) findViewById(R.id.pointsForPlayer2);
        TextView setsView_2 = (TextView) findViewById(R.id.setsForPlayer2);
        TextView gamesView_2 = (TextView) findViewById(R.id.gamesForPlayer2);
        pointsView_2.setText(String.valueOf(points));
        setsView_2.setText(String.valueOf(sets));
        gamesView_2.setText(String.valueOf(games));
    }

    /**
     * this is a simplified version tennis.
     * total points:4
     * total games:6
     * total set:5
     */

    public void scoreForPlayer1(View v) {
        if (points_For_Player1 == FOURTY) {
            if (games_For_Player1 == 5) {
                if (sets_For_Player1 == 4) {

                } else {
                    sets_For_Player1 = sets_For_Player1 + 1;
                    points_For_Player1 = LOVE;
                    games_For_Player1 = 0;
                }

            } else {
                games_For_Player1 = games_For_Player1 + 1;
                points_For_Player1 = LOVE;
            }
        } else if (points_For_Player1 == THIRTY) {
            points_For_Player1 = FOURTY;
        } else if (points_For_Player1 == FIFTEEN) {
            points_For_Player1 = THIRTY;
        } else points_For_Player1 = FIFTEEN;
        displayForPlayer1(points_For_Player1, sets_For_Player1, games_For_Player1);

    }

    public void scoreForPlayer2(View v) {
        if (points_For_Player2 == FOURTY) {
            if (games_For_Player2 == 5) {
                if (sets_For_Player2 == 4) {

                } else {
                    sets_For_Player2 = sets_For_Player2 + 1;
                    points_For_Player2 = LOVE;
                    games_For_Player2 = 0;
                }

            } else {
                games_For_Player2 = games_For_Player2 + 1;
                points_For_Player2 = LOVE;
            }
        } else if (points_For_Player2 == THIRTY) {
            points_For_Player2 = FOURTY;
        } else if (points_For_Player2 == FIFTEEN) {
            points_For_Player2 = THIRTY;
        } else points_For_Player2 = FIFTEEN;
        displayForPlayer2(points_For_Player2, sets_For_Player2, games_For_Player2);

    }

    public void faultForPlayer1(View v) {
        scoreForPlayer2(v);
    }

    public void faultForPlayer2(View v) {
        scoreForPlayer1(v);
    }

    public void reset(View v) {
        points_For_Player1 = 0;
        sets_For_Player1 = 0;
        games_For_Player1 = 0;
        points_For_Player2 = 0;
        sets_For_Player2 = 0;
        games_For_Player2 = 0;
        displayForPlayer1(points_For_Player1, sets_For_Player1, games_For_Player1);
        displayForPlayer2(points_For_Player2, sets_For_Player2, games_For_Player2);
    }

}
