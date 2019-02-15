package com.charlezz.fragmentcommunication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.charlezz.fragmentcommunication.eventbus_example.EventBusActivity;
import com.charlezz.fragmentcommunication.interface_example.InterfaceExamActivity;
import com.charlezz.fragmentcommunication.viewmodel_example.ViewModelActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.usingViewModel).setOnClickListener(this);
        findViewById(R.id.usingInterface).setOnClickListener(this);
        findViewById(R.id.usingEventBus).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.usingViewModel:
                startActivity(new Intent(this, ViewModelActivity.class));
                break;
            case R.id.usingInterface:
                startActivity(new Intent(this, InterfaceExamActivity.class));
                break;
            case R.id.usingEventBus:
                startActivity(new Intent(this, EventBusActivity.class));
                break;
        }
    }
}
