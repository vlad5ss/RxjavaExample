package com.uladzislau.tylkovich.rxjavaexample.flatMap;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher88 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        source.flatMap(s -> Observable.fromArray(s.split("")),
                (s,r) ->
                        s + "-" + r)
                .subscribe(System.out::println);
    }}
