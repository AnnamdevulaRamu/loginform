package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editTextemailaddress,editTextpassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextemailaddress=findViewById(R.id.emailaddress);
        editTextpassword=findViewById(R.id.password);
        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailaddress = editTextemailaddress.getText().toString();
                String password = editTextpassword.getText().toString();
                if (emailaddress.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter valid email id", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter valid password", Toast.LENGTH_SHORT).show();
                }
                else {
                    next();
            });

        }

            private void next() {
                mAuth.signInwithEmailandPassword
            }

            Intent intent=new Intent ( MainActivity.this,welcomepage.class);
                intent.putExtra( "username", username);
                startActivity(intent);
            }
        });
    }
}