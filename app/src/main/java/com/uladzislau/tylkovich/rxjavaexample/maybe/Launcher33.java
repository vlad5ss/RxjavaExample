package com.uladzislau.tylkovich.rxjavaexample.maybe;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher33 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");
        source.firstElement().subscribe(
                s -> System.out.println("RECEIVED " + s),
                Throwable::printStackTrace,
                () -> System.out.println("Done!"));
    }
}