package com.example.arjun27.dagger;

import java.util.Date;

public class SingletonData {

    private static SingletonData instance = null;

    private  long date;

    static SingletonData getInstance() {
        if (instance == null) {
            instance = new SingletonData();
        }
        return instance;
    }

    SingletonData(){
        date=new Date().getTime();
    }


    long getDate() {
        return date;
    }
}
