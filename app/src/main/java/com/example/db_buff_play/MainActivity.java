package com.example.db_buff_play;

import androidx.appcompat.app.AppCompatActivity;
import Entidades.Perfil;
import Entidades.Post;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Tabla de perfil", Post.creacionString());
    }
}