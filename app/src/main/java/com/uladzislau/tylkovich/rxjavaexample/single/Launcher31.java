package com.uladzislau.tylkovich.rxjavaexample.single;

import io.reactivex.Single;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher31 {
    public static void main(String[] args) {
        Single.just("Hello")
                .map(String::length)
                .subscribe(System.out::println,
                        Throwable::printStackTrace);
    } }