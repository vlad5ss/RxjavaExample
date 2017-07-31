package com.uladzislau.tylkovich.rxjavaexample.distinctUntilChanged;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher47 {
    public static void main(String[] args) {
        Observable.just(1, 1, 1, 2, 2, 3, 3, 2, 1, 1)
                .distinctUntilChanged()
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    } }
