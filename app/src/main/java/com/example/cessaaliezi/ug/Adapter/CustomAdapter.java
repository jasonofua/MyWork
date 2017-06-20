package com.example.cessaaliezi.ug.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cessaaliezi.ug.R;
import com.example.cessaaliezi.ug.lists.RowItem;

import java.util.List;

/**
 * Created by Cessa Aliezi on 18/06/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<RowItem> rowItems;
    LayoutInflater inflater;

    public CustomAdapter(Context context, List<RowItem> rowItems) {
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
         convertView = inflater.inflate(R.layout.model, parent,false);
        }

        TextView cusName = (TextView)convertView.findViewById(R.id.cusname);
        ImageView profile_img = (ImageView)convertView.findViewById(R.id.profileImage);

        final String name = rowItems.get(position).getCustomerName();
        int img = rowItems.get(position).getProfile_pic();
        cusName.setText(name);
        profile_img.setImageResource(img);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,name,Toast.LENGTH_LONG).show();
            }
        });

        return convertView;
    }
}
