package com.example.arjun27.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.arjun27.dagger.withdagger.MyAppilication;
import com.example.arjun27.dagger.withdagger.MyExample;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    MyExample mMyExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dateTextView = findViewById(R.id.textview);
        //SingletonData myExample = SingletonData.getInstance();
        ((MyAppilication) getApplication())
                .getMyComponent()
                .inject(MainActivity.this);
        dateTextView.setText((new Date(new Date().getTime())).toString());
    }
}
