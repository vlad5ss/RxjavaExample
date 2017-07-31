package com.uladzislau.tylkovich.rxjavaexample.observableempty;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher24 {
    public static void main(String[] args) {
        Observable<String> empty = Observable.empty();
        empty.subscribe(System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done!"));
    } }
