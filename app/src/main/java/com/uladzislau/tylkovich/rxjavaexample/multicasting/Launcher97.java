package com.uladzislau.tylkovich.rxjavaexample.multicasting;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher97 {
    public static void main(String[] args) {
        Observable<Integer> threeIntegers  = Observable.range(1,
                3);
        threeIntegers.subscribe(i -> System.out.println("Observer One: " + i));
        threeIntegers.subscribe(i -> System.out.println("Observer Two: " + i));
    } }
