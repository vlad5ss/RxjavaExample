package com.uladzislau.tylkovich.rxjavaexample.buffer;

import io.reactivex.Observable;

/**
 * Created by mac on 7/30/17.
 */

public class Launcher111 {
    public static void main(String[] args) {
        Observable.range(1,10)
                .buffer(2, 1)
                .filter(c -> c.size() == 2)
                .subscribe(System.out::println);}}
