package com.uladzislau.tylkovich.rxjavaexample.toSortedList;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher67 {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .toSortedList()
                .subscribe(s -> System.out.println("Received: " + s));
    } }
