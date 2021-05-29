package com.example.quiz10118008;

/*
    29/5/2021 11:13AM
    10118008
    Michael Nagaku Milenn Salim
    IF-1
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.kotak1);
        Adapter adapter = new Adapter();

        GridLayoutManager layoutManager=new GridLayoutManager(this,5);

        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }
}