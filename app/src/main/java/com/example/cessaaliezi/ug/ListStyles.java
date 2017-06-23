package com.example.cessaaliezi.ug;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.cessaaliezi.ug.Adapter.CustomStyle;
import com.example.cessaaliezi.ug.lists.StyleAdd;

import java.util.ArrayList;

public class ListStyles extends AppCompatActivity {

    ListView SListView;
   CustomStyle adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_styles);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SListView = (ListView)findViewById(R.id.List1);
        adapter = new CustomStyle(ListStyles.this,getcustomer());
        SListView.setAdapter(adapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                final Dialog dialog = new Dialog(ListStyles.this);
                AlertDialog.Builder builder = new AlertDialog.Builder(ListStyles.this,R.style.MyDialogTheme);
                View pickerView = getLayoutInflater().inflate(R.layout.custom_category, null);
                builder.setView(pickerView);
                builder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                     //    Toast.makeText(getApplicationContext(), "got it!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(ListStyles.this,Home.class));
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alert = builder.create();
                alert.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialog) {
                        Button negativeButton = ((AlertDialog) dialog).getButton(DialogInterface.BUTTON_NEGATIVE);
                        Button positiveButton = ((AlertDialog) dialog).getButton(DialogInterface.BUTTON_POSITIVE);
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 2f);
                        negativeButton.setLayoutParams(params);
                        positiveButton.setLayoutParams(params);

                        negativeButton.invalidate();
                        positiveButton.invalidate();
                    }
                });
                alert.setTitle("Create New Category");
                alert.show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private ArrayList<StyleAdd> getcustomer()
    {
        ArrayList<StyleAdd> cus = new ArrayList<>();

        StyleAdd rowItem = new StyleAdd("Shirt Style");
        cus.add(rowItem);
        rowItem = new StyleAdd("trouser Style");
        cus.add(rowItem);
        rowItem = new StyleAdd("Agbada Style");
        cus.add(rowItem);
        rowItem = new StyleAdd("Shorts Style");
        cus.add(rowItem);
        rowItem = new StyleAdd("Cloth Style");
        cus.add(rowItem);
        rowItem = new StyleAdd("trouser Style");
        cus.add(rowItem);
        rowItem = new StyleAdd("Agbada Style");
        cus.add(rowItem);
        rowItem = new StyleAdd("Shorts Style");
        cus.add(rowItem);
        rowItem = new StyleAdd("Cloth Style");
        cus.add(rowItem);



        return cus;
    }
}
