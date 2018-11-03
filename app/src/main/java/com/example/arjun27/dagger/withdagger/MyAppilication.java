package com.example.arjun27.dagger.withdagger;

import android.app.Application;

public class MyAppilication extends Application {

    MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = createMyComponent();

    }
    public MyComponent getMyComponent() {
        return myComponent;
    }
    private MyComponent createMyComponent() {
        return DaggerMyComponent
                .builder()
                .myModule(new MyModule())
                .build();
    }
}

