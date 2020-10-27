package com.example.legenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameScreen2c1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen2c1);
    }
    public void GoBack(View view){//MoveLayout to MainMeny after game end
        Intent intent = new Intent(GameScreen2c1.this, MainMenu.class);
        startActivity(intent);
    }
}