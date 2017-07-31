package com.uladzislau.tylkovich.rxjavaexample.coldobservable;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Laucher15 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");
        //first observer
        source.subscribe(s -> System.out.println("Observer 1 Received: " + s));
                //second observer
                source.map(String::length).filter(i -> i >= 5)
                        .subscribe(s -> System.out.println("Observer 2 Received: " + s));
    } }
