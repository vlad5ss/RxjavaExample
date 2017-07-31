package com.uladzislau.tylkovich.rxjavaexample.withLatestFrom;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher96 {
    public static void main(String[] args) {
        Observable<Long> source1 =
                Observable.interval(300, TimeUnit.MILLISECONDS);
        Observable<Long> source2 =
                Observable.interval(1, TimeUnit.SECONDS);
        source2.withLatestFrom(source1,
                (l1,l2) -> "SOURCE 2: " + l1 + "SOURCE 1: " + l2
        ) .subscribe(System.out::println);
        sleep(3000);
    }
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e) {
                e.printStackTrace();
            } }
    }