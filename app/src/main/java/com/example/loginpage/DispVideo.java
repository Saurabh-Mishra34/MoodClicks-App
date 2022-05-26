package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.VideoView;

public class DispVideo extends AppCompatActivity {
    ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp_video);
        VideoView mus = findViewById(R.id.mxpvid);
        mus.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.muvid);
        MediaController mediaController = new MediaController(this);
        mus.setMediaController(mediaController);
        mediaController.setAnchorView(mus);
        mus.start();
        getSupportActionBar().hide();
        imageview = (ImageView) findViewById(R.id.right_Icon);
        imageview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(DispVideo.this, imageview);
                //Inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(DispVideo.this,"You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                popup.show();//showing popup menu
            }
        });//closing the setOnClickListener method
    }

    public void gotomus(View v){
        Intent i = new Intent(this,MMPlayer.class);
        startActivity(i);
    }
    public void gotohome(View v){
        Intent i = new Intent(this,appOptions.class);
        startActivity(i);
    }
    public void gotosettings(View v){
        Intent i = new Intent(this,settingsActivity2.class);
        startActivity(i);
    }
}