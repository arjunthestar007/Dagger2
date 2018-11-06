package com.example.arjun27.dagger.withmvpdagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules ={AppilicationModule.class,LoginModule.class})
public interface AppilicationComponent {

    void inject(LoginActivity loginActivity);
}
