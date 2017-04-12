package com.example.android.focusquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.name;
import static android.R.attr.privateImeOptions;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);




        //Find view that shows the "let's go" button
        TextView letsGo = (TextView) findViewById(R.id.lets_go);

        //Set click listener to that view
        letsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz1Intent = new Intent(IntroActivity.this, Quiz1Activity.class);
                startActivity(quiz1Intent);
            }
        });

    }
}
