package com.example.service;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class commentspg extends AppCompatActivity {
    ListView clistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentspg);

        clistview=findViewById(R.id.clistview);

        ArrayList<comments> arrayList= new ArrayList<>();

        arrayList.add(new comments(R.drawable.whiterose, "Alaya",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Zain",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Ali",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Ahemd",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Alina",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Aarzoo",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Ayesha",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Aasiya",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Asfa",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.whiterose, "Arfa",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24, "Hello world"));
        arrayList.add(new comments(R.drawable.burger, "Fazeen",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.pizza, "Fazila",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.cake, "Faraha",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));
        arrayList.add(new comments(R.drawable.noodles, "Hassan",R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_outline_24, "Hello world"));

       commentsAdapter CommentsAdapter= new commentsAdapter(this,R.layout.commentlist,arrayList);
        clistview.setAdapter(CommentsAdapter);








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
                        startActivity(new Intent(getApplicationContext(), dashboard.class));
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
                        finish();
                        return true;
                }
                return false;
            }
        });
    }
}