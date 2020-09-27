package com.apptist.myapplication;

import android.os.Bundle;
import android.view.*;
import androidx.fragment.app.Fragment;



import android.widget.TextView;

public class BottomFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }

    public void display(String message){

        TextView text=(TextView) getActivity().findViewById(R.id.textID);
        text.setText(message + "\n");



    }


}