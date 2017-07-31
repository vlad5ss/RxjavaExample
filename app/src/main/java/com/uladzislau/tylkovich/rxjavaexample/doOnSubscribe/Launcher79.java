package com.uladzislau.tylkovich.rxjavaexample.doOnSubscribe;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher79 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .doOnSubscribe(d -> System.out.println("Subscribing!"))
                .doOnDispose(() -> System.out.println("Disposing!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    } }
