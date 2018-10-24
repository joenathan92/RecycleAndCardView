package com.example.ukrida.recycleandcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private ArrayList<Mahasiswa> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        MahasiswaAdapter adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData()
    {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Jonathan", "412011014", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Prasetyo", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Jonathan Prasetyo", "1214230345", "987648765"));
    }
}
