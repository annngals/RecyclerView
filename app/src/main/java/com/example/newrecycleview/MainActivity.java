package com.example.newrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rview;
    ArrayList<String> colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rview = findViewById(R.id.rview);


        colors = new ArrayList<>(Arrays.asList(
                fromStr(R.string.colorOne),
                fromStr(R.string.colorTwo),
                fromStr(R.string.colorThree)));

        Log.d("mytag", "sin"+colors);

        ColorAdapter adapter = new ColorAdapter(getLayoutInflater());
        adapter.submitList(colors);
        rview.setLayoutManager(new LinearLayoutManager(this));
        // задаём оформление
        rview.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rview.setAdapter(adapter);

    }

    String fromStr(int id) {
        return getResources().getString(id);
    }
}