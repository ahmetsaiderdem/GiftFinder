package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnbul,btnhatir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnbul = findViewById(R.id.btnbul);
        btnhatir=findViewById(R.id.btnhatir);




        btnbul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gec = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(gec);
            }
        });
        btnhatir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gec = new Intent(MainActivity.this,Hatirlatici.class);
                startActivity(gec);
            }
        });





    }

}