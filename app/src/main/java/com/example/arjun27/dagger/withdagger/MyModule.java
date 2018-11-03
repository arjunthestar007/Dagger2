package com.example.arjun27.dagger.withdagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    @Singleton
    static  MyExample providerMyExample(){
        return new MyExampleImpl();
    }

}
