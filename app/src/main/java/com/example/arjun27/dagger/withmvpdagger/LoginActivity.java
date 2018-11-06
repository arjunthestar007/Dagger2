package com.example.arjun27.dagger.withmvpdagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.arjun27.dagger.R;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity  implements LoginActivityMVP.View{

    EditText fname,lname;
    Button submit;
    @Inject
    LoginActivityMVP.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((App)getApplication()).getComponent().inject(this);
        fname=findViewById(R.id.editText1);
        lname=findViewById(R.id.editText2);
        submit=findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginButtonClicked();
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstname() {
        return fname.getText().toString();
    }

    @Override
    public String getLastname() {
        return lname.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {

        Toast.makeText(this, "user is not available", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "user cannot be empty", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showUserSavedMessage() {

        Toast.makeText(this, "user saved", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void setFirstName(String fname) {
        this.fname.setText(fname);

    }

    @Override
    public void setLastName(String lname) {
        this.lname.setText(lname);
    }
}
