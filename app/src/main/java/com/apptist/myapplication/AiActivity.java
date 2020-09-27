package com.apptist.myapplication;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.*;

public class AiActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_ai_activity);
        RelativeLayout relativelayout=(RelativeLayout)findViewById(R.id.aiactivityID);
        TextView textview= new TextView(this);
        textview.setText("OnCreateExecute" );

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        params.leftMargin = 300;

        relativelayout.addView(textview, params);



    }

        protected void onStart(){

        super.onStart();
            RelativeLayout relativelayout=(RelativeLayout)findViewById(R.id.aiactivityID);
            TextView textview= new TextView(this);
            textview.setText("OnStartExecute");


            relativelayout.addView(textview);


        }

    }

