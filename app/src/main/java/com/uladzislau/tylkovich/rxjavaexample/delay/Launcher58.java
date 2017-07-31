package com.uladzislau.tylkovich.rxjavaexample.delay;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher58 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma" ,"Delta",
                "Epsilon")
                .delay(3, TimeUnit.SECONDS)
                .subscribe(s -> System.out.println("Received: " + s));
        sleep(5000);
    }
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}}
