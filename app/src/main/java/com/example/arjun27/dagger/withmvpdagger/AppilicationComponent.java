package com.example.arjun27.dagger.withmvpdagger;

import com.example.arjun27.dagger.withmvpdagger.api.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules ={AppilicationModule.class,LoginModule.class, ApiModule.class})
public interface AppilicationComponent {

    void inject(LoginActivity loginActivity);
}
