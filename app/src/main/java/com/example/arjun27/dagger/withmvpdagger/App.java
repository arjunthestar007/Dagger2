package com.example.arjun27.dagger.withmvpdagger;

import android.app.Application;

import com.example.arjun27.dagger.withmvpdagger.api.ApiModule;


public class App extends Application {
    AppilicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppilicationComponent.builder()
                .appilicationModule(new AppilicationModule(this))
                .loginModule(new LoginModule())
                .apiModule(new ApiModule())
                .build();

    }

    public AppilicationComponent getComponent() {
        return component;
    }
}
