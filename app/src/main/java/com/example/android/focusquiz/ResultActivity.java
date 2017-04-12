package com.example.android.focusquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;


import java.text.NumberFormat;

import static android.R.attr.name;

public class ResultActivity extends AppCompatActivity {


    public static String RESULT = "result";

    private int result;
    private String yourResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = getIntent().getIntExtra(RESULT, 0);

        yourResult = result + "/5";

        ((TextView)findViewById(R.id.quiz_result)).setText(yourResult);

    }

}