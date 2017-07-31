package com.uladzislau.tylkovich.rxjavaexample.elementat;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher49 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma",
                "Delta")
                .elementAt(3)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    } }
