package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int score=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void button1(View view)
    {  score = score + 3 ;
        displayForTeamA(score);
    }
    public void button2(View view)
    {   score = score + 2;
        displayForTeamA(score);
    }
    public void button3(View view)
    {   score = score + 1;
        displayForTeamA(score);
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }
    public void button4(View view)
    {  scoreB = scoreB + 3 ;
        displayForTeamB(scoreB);
    }
    public void button5(View view)
    {   scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    public void button6(View view)
    {   scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

public void reset(View view)
{
    score = 0;
    scoreB = 0;
    displayForTeamA(score);
    displayForTeamB(scoreB);
}
}
