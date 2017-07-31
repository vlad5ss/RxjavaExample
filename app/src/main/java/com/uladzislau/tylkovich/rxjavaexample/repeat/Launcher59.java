package com.uladzislau.tylkovich.rxjavaexample.repeat;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher59 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma" ,"Delta",
                "Epsilon")
                .repeat(2)
                .subscribe(s -> System.out.println("Received: " + s));
    }}
