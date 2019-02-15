package com.charlezz.fragmentcommunication.viewmodel_example;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<String> liveText = new MutableLiveData<>();


    public LiveData<String> getText(){
        return liveText;
    }

    public void setText(String text){
        liveText.setValue(text);
    }

}
