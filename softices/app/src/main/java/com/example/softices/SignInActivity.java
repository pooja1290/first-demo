package com.example.softices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
//EditText email,password;
//Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        final EditText email=(EditText)findViewById(R.id.edt_email);
        final EditText password=(EditText)findViewById(R.id.edt_password);
        Button signin=(Button)findViewById(R.id.btn_signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("email") && password.getText().toString().equals("pass")) {
                    Toast.makeText(SignInActivity.this, "Sign In Successfully", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(SignInActivity.this, "user and password is not correct", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
