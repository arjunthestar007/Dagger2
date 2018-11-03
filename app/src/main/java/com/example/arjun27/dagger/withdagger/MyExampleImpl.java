package com.example.arjun27.dagger.withdagger;

import java.util.Date;

public class MyExampleImpl implements MyExample {

    private long date;

    public MyExampleImpl() {
        date = new Date().getTime();

    }

    @Override
    public long getDate() {
        return date;
    }
}
