package com.uladzislau.tylkovich.rxjavaexample.scan;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher60 {
    public static void main(String[] args) {
        Observable.just(5, 3, 7, 10, 2, 14)
                .scan((accumulator, next) -> accumulator + next)
                .subscribe(s -> System.out.println("Received: " + s));
    } }
