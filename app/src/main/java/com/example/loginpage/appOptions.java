package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class appOptions extends AppCompatActivity {

    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_options);
        getSupportActionBar().hide();
        imageview = (ImageView) findViewById(R.id.right_Icon);
        imageview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(appOptions.this, imageview);
                //Inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(appOptions.this,"You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                popup.show();//showing popup menu
            }
        });//closing the setOnClickListener method
    }

    public void gotoMusic(View v){
        Intent i = new Intent(this,RViewActivity.class);
        startActivity(i);
    }

    public void gotohome(View v){
        Intent i = new Intent(this,appOptions.class);
        startActivity(i);
    }

    public void vidplayer(View v){
        Intent i = new Intent(this,VidPlayerRecyclerView.class);
        startActivity(i);
    }
    public void gotosettings(View v){
        Intent i = new Intent(this,settingsActivity2.class);
        startActivity(i);
    }
}