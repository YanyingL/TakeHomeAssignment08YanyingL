package com.example.android.takehomeassignment08_yanyingl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<lists> views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ImagesAdapter(views,this));
    }


    private void initialData(){
        views=new ArrayList<>();
        views.add(new lists(R.string.pic1_name,R.string.pic1_description,R.drawable.pic1));
        views.add(new lists(R.string.pic2_name,R.string.pic2_description,R.drawable.pic2));
        views.add(new lists(R.string.pic3_name,R.string.pic3_description,R.drawable.pic3));

    }
}
