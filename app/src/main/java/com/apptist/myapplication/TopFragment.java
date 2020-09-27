package com.apptist.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.*;

public class TopFragment extends Fragment {

    public static ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_top,container,false);
        // Inflate the layout for this fragment

        String[] storage={

                "AIActivity","VRActivity"};
                ListView listView=view.findViewById(R.id.listviewID);
        ArrayAdapter<String>listViewAdapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_activated_1,storage);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {

                    Intent intent = new Intent(getActivity(), AiActivity.class);

                    startActivity(intent);
                }

                if (i == 1) {

                    Intent intent = new Intent(getActivity(), VRActivity.class);

                    startActivity(intent);

                }
            }
            });

        return view;

    }
}