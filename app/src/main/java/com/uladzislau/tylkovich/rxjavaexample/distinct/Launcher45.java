package com.uladzislau.tylkovich.rxjavaexample.distinct;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher45 {


    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .map(String::length)
                .distinct()
                .subscribe(i -> System.out.println("RECEIVED: " + i));

    }
}

