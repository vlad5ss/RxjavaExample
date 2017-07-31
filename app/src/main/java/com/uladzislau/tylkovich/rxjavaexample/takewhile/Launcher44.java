package com.uladzislau.tylkovich.rxjavaexample.takewhile;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher44 {
    public static void main(String[] args) {
        Observable.range(1,100)
                .skipWhile(i -> i <= 95)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    } }
