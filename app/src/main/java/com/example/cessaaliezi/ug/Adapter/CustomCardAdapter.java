package com.example.cessaaliezi.ug.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cessaaliezi.ug.R;
import com.example.cessaaliezi.ug.lists.StyleCategories;

import java.util.ArrayList;

/**
 * Created by Cessa Aliezi on 18/06/2017.
 */

public class CustomCardAdapter extends BaseAdapter {


    Context context;
    ArrayList<StyleCategories> styleCategories;
    LayoutInflater inflater;

    public CustomCardAdapter(Context context, ArrayList<StyleCategories> rowItems) {
        this.context = context;
        this.styleCategories = rowItems;
    }

    @Override
    public int getCount() {
        return styleCategories.size();
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
            convertView = inflater.inflate(R.layout.models_style, parent,false);
        }
        TextView styleType = (TextView)convertView.findViewById(R.id.cart_type);
        TextView styleMeasure = (TextView)convertView.findViewById(R.id.cartType_measure);
        ImageView style_img = (ImageView)convertView.findViewById(R.id.img_type);

        String type = styleCategories.get(position).getStyleName();
        String measure = styleCategories.get(position).getMeasurement();
        int img = styleCategories.get(position).getStyle_pic();

        styleType.setText(type);
        styleMeasure.setText(measure);
        style_img.setImageResource(img);

        return convertView;
    }
}
