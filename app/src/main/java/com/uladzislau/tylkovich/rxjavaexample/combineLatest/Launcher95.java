package com.uladzislau.tylkovich.rxjavaexample.combineLatest;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher95 {
    public static void main(String[] args) {
        Observable<Long> source1 =
                Observable.interval(300, TimeUnit.MILLISECONDS);
        Observable<Long> source2 =
                Observable.interval(1, TimeUnit.SECONDS);
        Observable.combineLatest(source1, source2,
            (l1,l2) -> "SOURCE 1: " + l1 + "  SOURCE 2: " + l2)
                    .subscribe(System.out::println);
                    sleep(3000);
                    }
public static void sleep(long millis) {
        try {
        Thread.sleep(millis);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }}}
