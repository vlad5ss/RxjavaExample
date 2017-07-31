package com.uladzislau.tylkovich.rxjavaexample.multicasting;

import java.util.concurrent.ThreadLocalRandom;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

/**
 * Created by mac on 7/29/17.
 */

public class Launcher99 {
    public static void main(String[] args) {
        ConnectableObservable<Integer> threeInts =
                Observable.range(1,3).publish();
        Observable<Integer> threeRandoms = threeInts.map(i ->
                randomInt());
        threeRandoms.subscribe(i -> System.out.println("Observer 1: " + i));
                threeRandoms.subscribe(i -> System.out.println("Observer 2: " + i));
                        threeInts.connect();
    }
    public static int randomInt() {
        return ThreadLocalRandom.current().nextInt(100000);
    } }


