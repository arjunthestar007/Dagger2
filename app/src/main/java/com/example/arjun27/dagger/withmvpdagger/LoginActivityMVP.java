package com.example.arjun27.dagger.withmvpdagger;

public interface LoginActivityMVP {

    interface View{

        String getFirstname();
        String getLastname();
        void showUserNotAvailable();
        void showInputError();
        void showUserSavedMessage();
        void setFirstName(String fname);
        void setLastName(String lname);


    }
    interface Presenter{
        void setView (LoginActivityMVP.View view);
        void loginButtonClicked();
        void getCurrentUser();

    }

    interface Model{
        void createUser(String fname,String lname);
        User getUser();

    }

}
