package com.uladzislau.tylkovich.rxjavaexample.collect;

import java.util.HashSet;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher71 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .collect(HashSet::new, HashSet::add)
                .subscribe(s -> System.out.println("Received: " + s));
    }


}
