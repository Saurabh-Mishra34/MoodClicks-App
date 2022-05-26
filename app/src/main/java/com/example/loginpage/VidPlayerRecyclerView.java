package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VidPlayerRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid_player_recycler_view);
        RecyclerView programmingList2 = findViewById(R.id.programmingList2);
        programmingList2.setLayoutManager(new LinearLayoutManager(this));
        String[] vidNames = {"Piya Boley","Motivational","Lake Music","Mishri","Meri Baaton Mein Tu","Kyon","Zingaat","Mi Gente","Panda"};
        programmingList2.setAdapter(new ProgrammingVideoAdapter(vidNames));
        getSupportActionBar().hide();
    }
    public void gotoVideoPlayer(View v){
        Intent i = new Intent(this,DispVideo.class);
        startActivity(i);
    }
}