package com.mvision.applogin;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.edit_username);
        etPassword = (EditText) findViewById(R.id.edit_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etUsername.getText().toString().equals("root") && etPassword.getText().toString().equals("root")){
                    //valid
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    //invalid
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this)
                            .setMessage("Invalid username or password.");
                    dialog.show();
                }
            }
        });
    }
}
