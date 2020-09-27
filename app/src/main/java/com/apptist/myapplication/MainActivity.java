package com.apptist.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomFragment fragment;
    String MsgFrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment=(BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        this.MsgFrag="MainActivity"+"OnCreateExecute";


        fragment.display(MsgFrag);
        Toast.makeText(this,"OnCreate Triggered", 5).show();
    }

    protected void onStart() {
        super.onStart();
        this.MsgFrag+="OnStartExecute";
        fragment.display(MsgFrag);

        Toast.makeText(this,"OnStart Triggered", 5).show();

    }

}
