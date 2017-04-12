package com.example.android.focusquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class Quiz1Activity extends AppCompatActivity {

    private int points1 = 0;
    private int points2 = 0;
    private int points3 = 0;
    private int points4 = 0;
    private int points5 = 0;
    private int result =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        //Find view that shows the "submit" button
        View checkResults = (Button) findViewById(R.id.submit_button);

        //Set click listener to that view
        checkResults.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                RadioGroup onRadioButtonClickedDots = (RadioGroup) findViewById(R.id.onRadioButtonClickedDots);
                int solution = onRadioButtonClickedDots.getCheckedRadioButtonId();
                if (solution == R.id.radio_a_dots) {
                    points1 = 1;
                } else {
                    points1 = 0;
                }

                RadioGroup onRadioButtonClickedBlackw = (RadioGroup) findViewById(R.id.onRadioButtonClickedBlackw);
                int solution2 = onRadioButtonClickedBlackw.getCheckedRadioButtonId();
                if (solution2 == R.id.radio_a_blackw) {
                    points2 = 1;
                } else {
                    points2 = 0;
                }

                RadioGroup onRadioButtonClickedYellow = (RadioGroup) findViewById(R.id.onRadioButtonClickedYellow);
                int solution3 = onRadioButtonClickedYellow.getCheckedRadioButtonId();
                if (solution3 == R.id.radio_c_yellow) {
                    points3 = 1;
                } else {
                    points3 = 0;
                }

                EditText inputAnswer= (EditText)findViewById(R.id.input_answer);

                String answer = inputAnswer.getText().toString();
                if (answer.equals("Moon")) {
                    points5 = 1;
                }



                Intent summaryIntent = new Intent(Quiz1Activity.this, ResultActivity.class);
                result = points1 + points2 + points3 + points4 + points5;
                summaryIntent.putExtra(ResultActivity.RESULT, result);
                startActivity(summaryIntent);

            }
        });
    }


    /**
     * These methods calculate the points for all questions
     *
     * @param view
     */




    /*public void onRadioButtonClickedDots(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_a_dots:
                if (checked) {
                    points1 = 1;
                }
                break;
            case R.id.radio_b_dots:
                if (checked) {
                    points1 = 0;
                }
                break;
            case R.id.radio_c_dots:
                if (checked) {
                    points1 = 0;
                }
                break;

        }
    }*/

    /*public void onRadioButtonClickedBlackw(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_a_blackw:
                if (checked) {
                    points2 = 1;
                }
                break;
            case R.id.radio_b_blackw:
                if (checked) {
                    points2 = 0;
                }
                break;
            case R.id.radio_c_blackw:
                if (checked) {
                    points2 = 0;
                }

        }
    }*/

    /*public void onRadioButtonClickedYellow(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_a_yellow:
                if (checked) {
                    points3 = 0;
                }
                break;
            case R.id.radio_b_yellow:
                if (checked) {
                    points3 = 0;
                }
                break;
            case R.id.radio_c_yellow:
                if (checked) {
                    points3 = 1;
                }
                break;

        }
    }*/

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkbox:
                if (checked) {
                    points4 = 1;
                } else {
                    points4 = 0;
                }
                break;
        }
    }

    /**
     * Check the answers to the input question
     *
     * @param userAnswer is the user's input answer to quiz 4
     */
   /* private int userInputAnswer(String userAnswer) {

        String answer = "Moon";
        if (userAnswer.equals(answer)) {
            points5 = 1;
        }
        return result;
    }*/
}