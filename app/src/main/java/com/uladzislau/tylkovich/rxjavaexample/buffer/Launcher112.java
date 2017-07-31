package com.uladzislau.tylkovich.rxjavaexample.buffer;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by mac on 7/30/17.
 */

public class Launcher112 {
    public static void main(String[] args) {
        Observable.interval(300, TimeUnit.MILLISECONDS)
                .map(i -> (i + 1) * 300) // map to elapsed time
                .buffer(1, TimeUnit.SECONDS, 2)
                .subscribe(System.out::println);
        sleep(5000);
    }
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}