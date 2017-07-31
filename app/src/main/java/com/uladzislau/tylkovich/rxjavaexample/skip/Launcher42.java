package com.uladzislau.tylkovich.rxjavaexample.skip;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher42 {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .skip(80)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }}

