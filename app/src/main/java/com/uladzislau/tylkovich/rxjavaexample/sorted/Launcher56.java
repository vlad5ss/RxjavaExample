package com.uladzislau.tylkovich.rxjavaexample.sorted;

import java.util.Comparator;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher56 {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted(Comparator.reverseOrder())
                .subscribe(System.out::println);
    } }
