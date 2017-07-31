package com.uladzislau.tylkovich.rxjavaexample.observOn;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by mac on 7/29/17.
 */

public class Launcher110 {
    public static void main(String[] args) {
        //Happens on IO Scheduler
        Observable.just("WHISKEY/27653/TANGO", "6555/BRAVO",
                "232352/5675675/FOXTROT")

                .subscribeOn(Schedulers.io())
                .flatMap(s -> Observable.fromArray(s.split("/")))
//Happens on Computation Scheduler
                .observeOn(Schedulers.computation())
                .filter(s -> s.matches("[0-9]+"))
                .map(Integer::valueOf)
                .reduce((total, next) -> total + next)
                .subscribe(i -> System.out.println("Received " + i
                        + Thread.currentThread().getName()));
        sleep(1000);
    }
    public static void sleep(int millis) {
        try {

    Thread.sleep(millis);
} catch (InterruptedException e) {
        e.printStackTrace();
        }}}