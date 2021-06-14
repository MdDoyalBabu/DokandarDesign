package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.BlacneSend.CashBlanceSendActivity;

public class RegisterActivity extends AppCompatActivity {

    private Button createAccont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        createAccont=findViewById(R.id.create_login_btn);

        createAccont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this, CashBlanceSendActivity.class);
                startActivity(intent);
            }
        });

    }
}