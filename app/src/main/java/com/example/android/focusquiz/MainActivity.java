package com.example.android.focusquiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;
import static android.R.attr.name;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Get user's name
        EditText nameField = (EditText) findViewById(R.id.input_name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();


        //Find view that shows the "and let's go" button
        TextView andLetsGo = (TextView) findViewById(R.id.start_button);

        //Set click listener to that view
        andLetsGo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introIntent = new Intent(MainActivity.this, IntroActivity.class);
                startActivity(introIntent);
            }
        });

    }

}












