package com.uladzislau.tylkovich.rxjavaexample.switchIfEmpty;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher54 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .filter(s -> s.startsWith("Z"))
                .switchIfEmpty(Observable.just("Zeta", "Eta", "Theta"))
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("RECEIVED ERROR: " + e)
                );
    } }
