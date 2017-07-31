package com.uladzislau.tylkovich.rxjavaexample.Zipping;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher94 {
    public static void main(String[] args) {
        Observable<String> strings =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        Observable<Long> seconds =
                Observable.interval(1, TimeUnit.SECONDS);
        Observable.zip(strings,seconds, (s, l) -> s)
                .subscribe(s ->
                        System.out.println("Received " + s +
                                " at " + LocalTime.now())
                );
        sleep(6000);
    }
    public static void sleep(long millis) {
        try {
    Thread.sleep(millis);
} catch (InterruptedException e) {
        e.printStackTrace();
        }
        }}