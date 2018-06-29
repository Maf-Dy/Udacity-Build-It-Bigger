package com.mafdy.jokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokelibrary);

        Intent i = getIntent();
        String joke = i.getStringExtra("Joke");
        TextView textView = (TextView) findViewById(com.mafdy.jokelibrary.R.id.textView);
        if (joke != null && joke.length() != 0) {
            textView.setText(joke);
        }
    }
}
