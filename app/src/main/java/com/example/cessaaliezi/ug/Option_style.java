package com.example.cessaaliezi.ug;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Option_style extends AppCompatActivity {

    ImageView clicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_style);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        clicked = (ImageView) findViewById(R.id.img_add);

        clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              final Dialog dialog = new Dialog(Option_style.this);
//               dialog.setTitle("Choose Image Source");
//                dialog.setContentView(R.layout.custom_dialog);
//
//
//
//               TextView txt_g = (TextView)dialog.findViewById(R.id.txt_gallery);
//                TextView txt_c = (TextView)dialog.findViewById(R.id.txt_camera);
//               ImageView img_g = (ImageView) dialog.findViewById(R.id.img_gallery);
//           ImageView img_c = (ImageView) dialog.findViewById(R.id.img_camera);
//
//               dialog.show();
                startActivity(new Intent(Option_style.this,ListStyles.class));
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
