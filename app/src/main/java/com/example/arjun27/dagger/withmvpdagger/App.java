package com.example.arjun27.dagger.withmvpdagger;

import android.app.Application;


public class App extends Application {
    AppilicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component=DaggerAppilicationComponent.builder().appilicationModule(new AppilicationModule(this)).
                build();

    }

    public AppilicationComponent getComponent() {
        return component;
    }
}
