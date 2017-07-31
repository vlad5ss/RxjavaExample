package com.uladzislau.tylkovich.rxjavaexample.retry;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher74 {
    public static void main(String[] args) {
        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .map(i -> 10 / i)
                .retry()
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("RECEIVED ERROR: " + e));
     }}

