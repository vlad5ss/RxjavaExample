package com.uladzislau.tylkovich.rxjavaexample.sorted;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher55 {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted()
                .subscribe(System.out::println);
    } }
