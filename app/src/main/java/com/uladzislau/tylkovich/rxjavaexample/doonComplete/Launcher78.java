package com.uladzislau.tylkovich.rxjavaexample.doonComplete;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher78 {
    public static void main(String[] args) {
        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .doOnError(e -> System.out.println("Source failed!"))
                .map(i -> 10 / i)
                .doOnError(e -> System.out.println("Division failed!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("RECEIVED ERROR: " + e)
                );
    } }

