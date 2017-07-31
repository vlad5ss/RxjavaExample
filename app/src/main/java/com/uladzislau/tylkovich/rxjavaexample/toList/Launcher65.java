package com.uladzislau.tylkovich.rxjavaexample.toList;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher65 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")

.toList()
    .subscribe(s -> System.out.println("Received: " + s));
}}
