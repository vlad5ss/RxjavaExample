package com.uladzislau.tylkovich.rxjavaexample.count;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher62 {
    //ALL
    public static void main(String[] args) {
        Observable.just(5, 3, 7, 11, 2, 14)
                .all(i -> i < 10)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}