package com.uladzislau.tylkovich.rxjavaexample.observablefromcallable;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher30 {
    public static void main(String[] args) {
        Observable.just(1 / 0)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("Error Captured: " + e));
    } }
