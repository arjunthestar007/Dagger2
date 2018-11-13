package com.example.arjun27.dagger;

import com.example.arjun27.dagger.withmvpdagger.LoginActivityMVP;
import com.example.arjun27.dagger.withmvpdagger.LoginActivityPresenter;
import com.example.arjun27.dagger.withmvpdagger.User;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PresenterTests {
    LoginActivityMVP.Model model; // interface
    LoginActivityMVP.View view;  // interface
    LoginActivityPresenter presenter;
    User user;


    @Before
    public void setUp() throws Exception {
        model=mock(LoginActivityMVP.Model.class);
        user=new User("fox","mul");
        when(model.getUser()).thenReturn(user);
        view=mock(LoginActivityMVP.View.class);
        presenter=new LoginActivityPresenter(model);
        presenter.setView(view);
    }
}
