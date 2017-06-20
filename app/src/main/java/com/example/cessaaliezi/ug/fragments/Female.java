package com.example.cessaaliezi.ug.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.cessaaliezi.ug.Adapter.CustomAdapter;
import com.example.cessaaliezi.ug.R;
import com.example.cessaaliezi.ug.lists.RowItem;

import java.util.ArrayList;

public class Female extends Fragment {


    ListView FListView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_female,container,false);

        FListView = (ListView) view.findViewById(R.id.listFemale);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getcustomer());
        FListView.setAdapter(adapter);
        return view;

    }
    private ArrayList<RowItem> getcustomer()
    {
        ArrayList<RowItem> cus = new ArrayList<>();

        RowItem rowItem = new RowItem("Yinka Okon",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new RowItem("Ugo Chukwuwemeka",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new RowItem("Eke Carisson",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new RowItem("Tedimola Doro",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new RowItem("Chidiebere O",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new RowItem("Osmiemhen A",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new RowItem("Oghenefegha Abiku",R.drawable.ic_launcher_round);
        cus.add(rowItem);
        rowItem = new RowItem("Franklin C.",R.drawable.ic_launcher_round);
        cus.add(rowItem);

        return cus;
    }

    @Override
    public String toString() {
        String title = "Female";
        return title;
    }
}
