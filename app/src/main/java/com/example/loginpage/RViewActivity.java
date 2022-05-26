package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rview);
        RecyclerView programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] musicNames = {"Baarishein","Alag Aasmaan","Gul","Mishri","Meri Baaton Mein Tu","Kyon","Zingaat","Mi Gente","Panda"};
        programmingList.setAdapter(new ProgrammingAdapter(musicNames));
        getSupportActionBar().hide();
    }

    public void gotoMusicPlayer(View v){
        Intent i = new Intent(this,MMPlayer.class);
        startActivity(i);
    }
}