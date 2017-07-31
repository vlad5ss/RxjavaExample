package com.uladzislau.tylkovich.rxjavaexample.defaultIfEmpty;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher54 {
    public static void main(String[] args) {
        Observable<String> items =
                Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");
        items.filter(s -> s.startsWith("Z"))
                .defaultIfEmpty("None")
                .subscribe(System.out::println);
    } }

