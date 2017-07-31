package com.uladzislau.tylkovich.rxjavaexample.interval;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher20 {
    public static void main(String[]args) {
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(s -> System.out.println(s + " Mississippi"));
        sleep(5000);
    }
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } }
}

