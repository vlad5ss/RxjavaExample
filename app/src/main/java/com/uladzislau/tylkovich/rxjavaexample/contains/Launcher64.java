package com.uladzislau.tylkovich.rxjavaexample.contains;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher64 {
    public static void main(String[] args) {
        Observable.range(1,10000)
                .contains(9563)
                .subscribe(s -> System.out.println("Received: " + s));
    } }
