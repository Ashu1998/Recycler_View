package com.tinkerbyte.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
//afjhjakdf
//afsjdfla
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String [] country = {"India","Pakistan","Japan","China","Singapore","Bangladesh","Azbakistan","USA","Korea","South Africa","Afhganistan"};
        recyclerView.setAdapter(new myAdapter(country));
    }
}
