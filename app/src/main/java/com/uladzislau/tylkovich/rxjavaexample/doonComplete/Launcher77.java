package com.uladzislau.tylkovich.rxjavaexample.doonComplete;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher77 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .doOnComplete(() -> System.out.println("Source is done emitting!"))
                .map(String::length)
                .subscribe(i -> System.out.println("Received: " + i));
    }
}
