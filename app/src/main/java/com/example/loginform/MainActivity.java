package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editTextemailaddress, editTextpassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextemailaddress = findViewById(R.id.emailaddress);
        editTextpassword = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailaddress = editTextemailaddress.getText().toString();
                String password = editTextpassword.getText().toString();
                Intent intent = new Intent(MainActivity.this, welcomepage.class);
                startActivity(intent);
            }
        });
    }
}