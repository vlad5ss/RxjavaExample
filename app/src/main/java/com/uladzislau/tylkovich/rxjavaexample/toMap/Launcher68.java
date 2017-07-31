package com.uladzislau.tylkovich.rxjavaexample.toMap;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher68 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")


    .toMap(s -> s.charAt(0))
            .subscribe(s -> System.out.println("Received: " + s));
            }}
