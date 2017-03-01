package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.PlayerFive_a_score;
import static com.example.android.courtcounter.R.id.PlayerFive_b_score;
import static com.example.android.courtcounter.R.id.PlayerFour_a_score;
import static com.example.android.courtcounter.R.id.PlayerFour_b_score;
import static com.example.android.courtcounter.R.id.PlayerOne_a_score;
import static com.example.android.courtcounter.R.id.PlayerOne_b_score;
import static com.example.android.courtcounter.R.id.PlayerThree_a_score;
import static com.example.android.courtcounter.R.id.PlayerThree_b_score;
import static com.example.android.courtcounter.R.id.PlayerTwo_a_score;
import static com.example.android.courtcounter.R.id.PlayerTwo_b_score;
import static com.example.android.courtcounter.R.id.team_a_score;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scorePlayerOneTeamA = 0;
    int scorePlayerTwoTeamA = 0;
    int scorePlayerThreeTeamA = 0;
    int scorePlayerFourTeamA = 0;
    int scorePlayerFiveTeamA = 0;
    int scorePlayerOneTeamB = 0;
    int scorePlayerTwoTeamB = 0;
    int scorePlayerThreeTeamB = 0;
    int scorePlayerFourTeamB = 0;
    int scorePlayerFiveTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayForPlayerOneForTeamA(0);
        displayForPlayerTwoForTeamA(0);
        displayForPlayerThreeForTeamA(0);
        displayForPlayerFourForTeamA(0);
        displayForPlayerFiveForTeamA(0);
        displayForPlayerOneForTeamB(0);
        displayForPlayerTwoForTeamB(0);
        displayForPlayerThreeForTeamB(0);
        displayForPlayerFourForTeamB(0);
        displayForPlayerFiveForTeamB(0);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerOne Team A.
     */
    public void displayForPlayerOneForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerOne_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerTwo Team A.
     */
    public void displayForPlayerTwoForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerTwo_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerThree Team A.
     */
    public void displayForPlayerThreeForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerThree_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerFour Team A.
     */
    public void displayForPlayerFourForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerFour_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerFive Team A.
     */
    public void displayForPlayerFiveForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerFive_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for PlayerOne Team B.
     */
    public void displayForPlayerOneForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerOne_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerTwo Team B.
     */
    public void displayForPlayerTwoForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerTwo_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerThree Team B.
     */
    public void displayForPlayerThreeForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerThree_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerFour Team B.
     */
    public void displayForPlayerFourForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerFour_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerFive Team B.
     */
    public void displayForPlayerFiveForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerFive_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset both teams scores back to 0
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scorePlayerOneTeamA = 0;
        scorePlayerTwoTeamA = 0;
        scorePlayerThreeTeamA = 0;
        scorePlayerFourTeamA = 0;
        scorePlayerFiveTeamA = 0;
        scorePlayerOneTeamB = 0;
        scorePlayerTwoTeamB = 0;
        scorePlayerThreeTeamB = 0;
        scorePlayerFourTeamB = 0;
        scorePlayerFiveTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);
        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);
    }


    /**
     * Increases score for PlayerOneTeam A by 3 points.
     */

    public void addThreeForPlayerOneTeamA(View v) {
        scorePlayerOneTeamA = scorePlayerOneTeamA + 3;
        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerOneTeam A by 2 points.
     */

    public void addTwoForPlayerOneTeamA(View v) {
        scorePlayerOneTeamA = scorePlayerOneTeamA + 2;
        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForTeamA(scorePlayerOneTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerOneTeam A by 1 point.
     */

    public void addOneForPlayerOneTeamA(View v) {
        scorePlayerOneTeamA = scorePlayerOneTeamA + 1;
        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerTwoTeam A by 3 points.
     */

    public void addThreeForPlayerTwoTeamA(View v) {
        scorePlayerTwoTeamA = scorePlayerTwoTeamA + 3;
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerTwoTeam A by 2 points.
     */

    public void addTwoForPlayerTwoTeamA(View v) {
        scorePlayerTwoTeamA = scorePlayerTwoTeamA + 2;
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerTwoTeam A by 1 point.
     */

    public void addOneForPlayerTwoTeamA(View v) {
        scorePlayerTwoTeamA = scorePlayerTwoTeamA + 1;
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }


    /**
     * Increases score for PlayerThreeTeam A by 3 points.
     */

    public void addThreeForPlayerThreeTeamA(View v) {
        scorePlayerThreeTeamA = scorePlayerThreeTeamA + 3;
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerThreeTeam A by 2 points.
     */

    public void addTwoForPlayerThreeTeamA(View v) {
        scorePlayerThreeTeamA = scorePlayerThreeTeamA + 2;
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerThreeTeam A by 1 point.
     */

    public void addOneForPlayerThreeTeamA(View v) {
        scorePlayerThreeTeamA = scorePlayerThreeTeamA + 1;
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }


    /**
     * Increases score for PlayerFourTeam A by 3 points.
     */

    public void addThreeForPlayerFourTeamA(View v) {
        scorePlayerFourTeamA = scorePlayerFourTeamA + 3;
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFourTeam A by 2 points.
     */

    public void addTwoForPlayerFourTeamA(View v) {
        scorePlayerFourTeamA = scorePlayerFourTeamA + 2;
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFourTeam A by 1 point.
     */

    public void addOneForPlayerFourTeamA(View v) {
        scorePlayerFourTeamA = scorePlayerFourTeamA + 1;
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFiveTeam A by 3 points.
     */

    public void addThreeForPlayerFiveTeamA(View v) {
        scorePlayerFiveTeamA = scorePlayerFiveTeamA + 3;
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFiveTeam A by 2 points.
     */

    public void addTwoForPlayerFiveTeamA(View v) {
        scorePlayerFiveTeamA = scorePlayerFiveTeamA + 2;
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFiveTeam A by 1 point.
     */

    public void addOneForPlayerFiveTeamA(View v) {
        scorePlayerFiveTeamA = scorePlayerFiveTeamA + 1;
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerOneTeam B by 3 points.
     */

    public void addThreeForPlayerOneTeamB(View v) {
        scorePlayerOneTeamB = scorePlayerOneTeamB + 3;
        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerOneTeam B by 2 points.
     */

    public void addTwoForPlayerOneTeamB(View v) {
        scorePlayerOneTeamB = scorePlayerOneTeamB + 2;
        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerOneTeam B by 1 point.
     */

    public void addOneForPlayerOneTeamB(View v) {
        scorePlayerOneTeamB = scorePlayerOneTeamB + 1;
        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerTwoTeam B by 3 points.
     */

    public void addThreeForPlayerTwoTeamB(View v) {
        scorePlayerTwoTeamB = scorePlayerTwoTeamB + 3;
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerTwoTeam B by 2 points.
     */

    public void addTwoForPlayerTwoTeamB(View v) {
        scorePlayerTwoTeamB = scorePlayerTwoTeamB + 2;
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerTwoTeam B by 1 point.
     */

    public void addOneForPlayerTwoTeamB(View v) {
        scorePlayerTwoTeamB = scorePlayerTwoTeamB + 1;
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }


    /**
     * Increases score for PlayerThreeTeam B by 3 points.
     */

    public void addThreeForPlayerThreeTeamB(View v) {
        scorePlayerThreeTeamB = scorePlayerThreeTeamB + 3;
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerThreeTeam B by 2 points.
     */

    public void addTwoForPlayerThreeTeamB(View v) {
        scorePlayerThreeTeamB = scorePlayerThreeTeamB + 2;
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerThreeTeam B by 1 point.
     */

    public void addOneForPlayerThreeTeamB(View v) {
        scorePlayerThreeTeamB = scorePlayerThreeTeamB + 1;
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }


    /**
     * Increases score for PlayerFourTeam B by 3 points.
     */

    public void addThreeForPlayerFourTeamB(View v) {
        scorePlayerFourTeamB = scorePlayerFourTeamB + 3;
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFourTeam B by 2 points.
     */

    public void addTwoForPlayerFourTeamB(View v) {
        scorePlayerFourTeamB = scorePlayerFourTeamB + 2;
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFourTeam B by 1 point.
     */

    public void addOneForPlayerFourTeamB(View v) {
        scorePlayerFourTeamB = scorePlayerFourTeamB + 1;
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFiveTeam B by 3 points.
     */

    public void addThreeForPlayerFiveTeamB(View v) {
        scorePlayerFiveTeamB = scorePlayerFiveTeamB + 3;
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFiveTeam B by 2 points.
     */

    public void addTwoForPlayerFiveTeamB(View v) {
        scorePlayerFiveTeamB = scorePlayerFiveTeamB + 2;
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFiveTeam B by 1 point.
     */

    public void addOneForPlayerFiveTeamB(View v) {
        scorePlayerFiveTeamB = scorePlayerFiveTeamB + 1;
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }
}
