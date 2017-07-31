package com.uladzislau.tylkovich.rxjavaexample.toMap;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher70 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")

    .toMultimap(String::length)
    .subscribe(s -> System.out.println("Received: " + s));
}
    }

