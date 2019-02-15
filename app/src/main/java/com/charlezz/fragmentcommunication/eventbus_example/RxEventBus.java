package com.charlezz.fragmentcommunication.eventbus_example;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class RxEventBus {
    private static final RxEventBus instance = new RxEventBus();

    public static RxEventBus getInstance(){
        return instance;
    }

    private PublishSubject<Object> bus = PublishSubject.create();

    private RxEventBus(){
    }

    public void send(Object o) {
        bus.onNext(o);
    }

    public Observable<Object> toObservable() {
        return bus;
    }

}
