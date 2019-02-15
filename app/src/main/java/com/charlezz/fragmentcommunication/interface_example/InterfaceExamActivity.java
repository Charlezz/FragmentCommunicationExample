package com.charlezz.fragmentcommunication.interface_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.charlezz.fragmentcommunication.R;

public class InterfaceExamActivity extends AppCompatActivity implements FragmentListener{

    FragmentA2 fragmentA2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_exam);
        fragmentA2 = (FragmentA2) getSupportFragmentManager().findFragmentById(R.id.fragmentA);
    }


    @Override
    public void onTextChange(String s) {
        if(fragmentA2!=null){
            fragmentA2.setText(s);
        }
    }
}
