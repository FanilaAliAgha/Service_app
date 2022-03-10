package com.example.service;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dashboard extends AppCompatActivity {
ImageView profile;


    androidx.cardview.widget.CardView order;
    androidx.cardview.widget.CardView porders;
    androidx.cardview.widget.CardView commentcard;
    androidx.cardview.widget.CardView sdetail;


    com.google.android.material.floatingactionbutton.FloatingActionButton  notificationbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        
        order=findViewById(R.id.order);

        porders=findViewById(R.id.porders);

        commentcard=findViewById(R.id.commentcard);
        notificationbtn=findViewById(R.id.notificationbtn);

        sdetail=findViewById(R.id.sdetail);
        profile=findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, com.example.service.profile.class);
                startActivity(intent);

            }
        });


        
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, com.example.service.order.class);
                startActivity(intent);

            }
        });



        porders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, com.example.service.pendingorder.class);
                startActivity(intent);

            }
        });



        commentcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, com.example.service.commentspg.class);
                startActivity(intent);

            }
        });

        sdetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, com.example.service.servicedetail.class);
                startActivity(intent);


            }
        });



        notificationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, com.example.service.notificationpg.class);
                startActivity(intent);

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