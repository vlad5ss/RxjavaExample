package com.uladzislau.tylkovich.rxjavaexample.distinctUntilChanged;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher48 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma",
                "Delta")
                .distinctUntilChanged(String::length)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }}
