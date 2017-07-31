package com.uladzislau.tylkovich.rxjavaexample.toList;

import java.util.concurrent.CopyOnWriteArrayList;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher66 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .toList(CopyOnWriteArrayList::new)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
