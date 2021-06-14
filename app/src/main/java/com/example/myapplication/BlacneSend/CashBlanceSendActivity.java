package com.example.myapplication.BlacneSend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.LoginActivity;
import com.example.myapplication.R;
import com.example.myapplication.RegisterActivity;
import com.example.myapplication.allProfile.CustomerProfileActivity;

public class CashBlanceSendActivity extends AppCompatActivity {

    private Button sendmony;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_blance_send);

        sendmony=findViewById(R.id.sendmony);

        sendmony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CashBlanceSendActivity.this, CustomerProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}