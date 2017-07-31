package com.uladzislau.tylkovich.rxjavaexample.observablenever;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher25 {
    public static void main(String[] args) {
        Observable<String> empty = Observable.never();
        empty.subscribe(System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done!"));
        sleep(5000);
    }
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } }
