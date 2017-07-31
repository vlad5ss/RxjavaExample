package com.uladzislau.tylkovich.rxjavaexample.Implementing;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher13 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        Throwable::printStackTrace);
    } }
