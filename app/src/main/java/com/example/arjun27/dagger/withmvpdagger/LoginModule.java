package com.example.arjun27.dagger.withmvpdagger;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter provideloginActivityPresenter(LoginActivityMVP.Model model){

        return new LoginActivityPresenter(model);
    }


    @Provides
    public LoginActivityMVP.Model provideloginActivityModel(LoginRepository repository){

        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){

        return new MemoryRepository();

    }

}
