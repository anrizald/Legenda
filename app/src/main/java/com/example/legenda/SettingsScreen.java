package com.example.legenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_screen);
    }
    public void backToMain(View view){ //MoveLayout to MainMenu
        Intent intent = new Intent(SettingsScreen.this, MainMenu.class);
        startActivity(intent);
    }
}