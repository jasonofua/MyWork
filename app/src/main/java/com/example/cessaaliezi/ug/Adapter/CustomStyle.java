package com.example.cessaaliezi.ug.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cessaaliezi.ug.R;
import com.example.cessaaliezi.ug.lists.StyleAdd;

import java.util.List;

/**
 * Created by Cessa Aliezi on 22/06/2017.
 */

public class CustomStyle extends BaseAdapter{


    Context context;
    List<StyleAdd> rowItems;
    LayoutInflater inflater;

    public CustomStyle(Context context, List<StyleAdd> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }


    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (inflater == null)
        {
            inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }
        if (convertView==null)
        {
            convertView = inflater.inflate(R.layout.model_pop, parent,false);
        }

        TextView cusName = (TextView)convertView.findViewById(R.id.txt_style_pop);
        ImageView profile_img = (ImageView)convertView.findViewById(R.id.img_overflow);


       try {
           final String name = rowItems.get(position).getStyleName();
           cusName.setText(name);

           profile_img.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   PopupMenu popup = new PopupMenu(context, view);
                   popup.getMenuInflater().inflate(R.menu.menu_overflow_styles,
                           popup.getMenu());
                   popup.show();
               }
           });


           convertView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Toast.makeText(context,name,Toast.LENGTH_LONG).show();
               }
           });


       }catch (Exception e ){
           e.printStackTrace();
       }


        return convertView;
    }
}
