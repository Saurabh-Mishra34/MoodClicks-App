package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class lipage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipage);
        getSupportActionBar().hide();

    }

   public void gotoops(View v){
        Toast.makeText(lipage.this, "Login Successfull!!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,appOptions.class);
        startActivity(i);
    }


}