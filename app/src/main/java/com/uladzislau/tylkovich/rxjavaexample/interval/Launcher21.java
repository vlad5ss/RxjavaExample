package com.uladzislau.tylkovich.rxjavaexample.interval;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher21 {
    public static void main(String[] args) {
        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);
        //Observer 1
        seconds.subscribe(l -> System.out.println("Observer 1: " + l));
        //sleep 5 seconds
        sleep(5000);
        //Observer 2
        seconds.subscribe(l -> System.out.println("Observer 2: " + l));
        //sleep 5 seconds
        sleep(5000);
    }
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();} }
}