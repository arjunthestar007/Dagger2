package com.example.arjun27.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dateTextView = findViewById(R.id.textview);
        //SingletonData myExample = SingletonData.getInstance();
        dateTextView.setText((new Date(new Date().getTime())).toString());
    }
}
