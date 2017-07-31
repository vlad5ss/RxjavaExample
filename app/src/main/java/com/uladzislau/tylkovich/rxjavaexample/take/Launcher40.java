package com.uladzislau.tylkovich.rxjavaexample.take;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher40 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .take(3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    } }

