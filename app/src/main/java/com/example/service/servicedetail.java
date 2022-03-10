package com.example.service;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class servicedetail extends AppCompatActivity {
    Button confirm_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicedetail);


        confirm_btn = findViewById(R.id.confirm_btn);

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(servicedetail.this,serviced2.class);
                startActivity(intent);
                finish();
            }
        });









        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.home);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.home:
                        return true;

                    case R.id.inbox:
                        startActivity(new Intent(getApplicationContext(), Inbox.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.wallet:
                        startActivity(new Intent(getApplicationContext(), wallet.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext(), setting.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.complaint:
                        startActivity(new Intent(getApplicationContext(), complain.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                }
                return false;
            }
        });

    }
}