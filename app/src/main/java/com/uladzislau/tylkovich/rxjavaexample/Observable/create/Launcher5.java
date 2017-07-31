package com.uladzislau.tylkovich.rxjavaexample.Observable.create;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher5 {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("Alpha");
            emitter.onNext("Beta");
            emitter.onNext("Gamma");
            emitter.onNext("Delta");
            emitter.onNext("Epsilon");
            emitter.onComplete();
        });
        source.subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}

