package com.charlezz.fragmentcommunication.eventbus_example;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.charlezz.fragmentcommunication.R;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class FragmentA3 extends Fragment {
    private TextView textView;

    private CompositeDisposable disposables = new CompositeDisposable();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        textView = view.findViewById(R.id.input);

        Disposable disposable = RxEventBus.getInstance().toObservable().subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object o) throws Exception {
                textView.setText((String)o);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {

            }
        });
        disposables.add(disposable);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(disposables.isDisposed()){
            disposables.dispose();
        }
    }
}
