package com.uladzislau.tylkovich.rxjavaexample.range;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher18 {
    public static void main(String[] args) {
        Observable.range(1,10)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    } }
