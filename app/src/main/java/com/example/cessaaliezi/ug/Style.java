package com.example.cessaaliezi.ug;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.example.cessaaliezi.ug.Adapter.CustomCardAdapter;
import com.example.cessaaliezi.ug.lists.StyleCategories;

import java.util.ArrayList;

public class Style extends AppCompatActivity {

    ListView SListView;
    CustomCardAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);
        SListView = (ListView)findViewById(R.id.liststyle);
         adapter = new CustomCardAdapter(Style.this,getcustomer());
        SListView.setAdapter(adapter);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabsytle);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Style.this,Option_style.class));
            }
        });

    }

    private ArrayList<StyleCategories> getcustomer()
    {
        ArrayList<StyleCategories> cus = new ArrayList<>();

        StyleCategories rowItem = new StyleCategories("Shirt Style 1","6 Required Measurements",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new StyleCategories("Shirt Style 2","10 Required Measurements",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new StyleCategories("Shirt Style 3","8 Required Measurements",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new StyleCategories("Shirt Style 4","6 Required Measurements",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new StyleCategories("Shirt Style 5","5 Required Measurements",R.drawable.ic_launcher_round);
        cus.add(rowItem);


        return cus;
    }
}
