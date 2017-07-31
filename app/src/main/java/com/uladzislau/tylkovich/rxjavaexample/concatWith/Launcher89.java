package com.uladzislau.tylkovich.rxjavaexample.concatWith;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher89 {
    public static void main(String[] args) {
        Observable<String> source1 =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        Observable<String> source2 =
                Observable.just("Zeta", "Eta", "Theta");
        Observable.concat(source1, source2)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    } }

