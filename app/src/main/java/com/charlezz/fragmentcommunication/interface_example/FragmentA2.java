package com.charlezz.fragmentcommunication.interface_example;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.charlezz.fragmentcommunication.R;

public class FragmentA2 extends Fragment {
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        textView = view.findViewById(R.id.input);
        return view;
    }

    public void setText(String s) {
        if(textView!=null){
            textView.setText(s);
        }
    }
}
