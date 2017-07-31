package com.uladzislau.tylkovich.rxjavaexample.count;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher61 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .count()
                .subscribe(s -> System.out.println("Received: " + s));
    } }
