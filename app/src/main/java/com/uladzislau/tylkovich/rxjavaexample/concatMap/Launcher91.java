package com.uladzislau.tylkovich.rxjavaexample.concatMap;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher91 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        source.concatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
    } }

