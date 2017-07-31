package com.uladzislau.tylkovich.rxjavaexample.distinct;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher46 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")

    .distinct(String::length)
    .subscribe(i -> System.out.println("RECEIVED: " + i));
}}

