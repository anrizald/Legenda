package com.example.legenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreditsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits_screen);
    }
    public void backToMain(View view){ //MoveLayout to MainMenu
        Intent intent = new Intent(CreditsScreen.this, MainMenu.class);
        startActivity(intent);
    }
}