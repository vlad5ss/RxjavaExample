package com.uladzislau.tylkovich.rxjavaexample.replaying;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by mac on 7/29/17.
 */

public class Launcher103 {
    public static void main(String[] args) {
        Observable<Long> seconds =
                Observable.interval(1, TimeUnit.SECONDS)
                        .replay()
                        .autoConnect();
//Observer 1
        seconds.subscribe(l -> System.out.println("Observer 1: " + l));
                sleep(3000);
//Observer 2
        seconds.subscribe(l -> System.out.println("Observer 2: " + l));
        sleep(3000);
    }
    public static void sleep(long millis) {
        try {

    Thread.sleep(millis);
} catch (InterruptedException e) {
        e.printStackTrace();}
    }}