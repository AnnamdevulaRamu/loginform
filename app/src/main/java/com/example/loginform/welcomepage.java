package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class welcomepage extends AppCompatActivity {
    TextView text;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        text=findViewById(R.id.text);
        back=findViewById(R.id.back);
        Intent intent=getIntent();
        String data=intent.getStringExtra( "username");
        text.setText("Hello Ramu Welcome "+data+" to umang solutions!" );

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });
    }
}