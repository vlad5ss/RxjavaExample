package com.uladzislau.tylkovich.rxjavaexample.doOnSuccess;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher80 {
    public static void main(String[] args) {
        Observable.just(5, 3, 7, 10, 2, 14)
                .reduce((total, next) -> total + next)
                .doOnSuccess(i -> System.out.println("Emitting: " + i))
                .subscribe(i -> System.out.println("Received: " + i));
    } }
