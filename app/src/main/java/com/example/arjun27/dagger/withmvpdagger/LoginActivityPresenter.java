package com.example.arjun27.dagger.withmvpdagger;

public class LoginActivityPresenter implements LoginActivityMVP.Presenter {

    private LoginActivityMVP.View view;

    private LoginActivityMVP.Model model;

    public LoginActivityPresenter(LoginActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
        if (view != null) {
            if(view.getFirstname().trim().equals("")||view.getLastname().trim().equals("")){
                view.showInputError();

            }else{
                model.createUser(view.getFirstname(),view.getLastname());
                view.showUserSavedMessage();
            }

        }
    }

    @Override
    public void getCurrentUser() {
        User user=model.getUser();
        if(user==null){
            if(view!=null){
                view.showUserNotAvailable();
            }
        }
        else{
            if(view!=null){
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastname());
            }
        }
    }
}
