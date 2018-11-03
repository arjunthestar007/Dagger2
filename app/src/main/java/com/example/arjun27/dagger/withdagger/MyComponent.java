package com.example.arjun27.dagger.withdagger;

import com.example.arjun27.dagger.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
    void inject(MainActivity mainActivity);
}
