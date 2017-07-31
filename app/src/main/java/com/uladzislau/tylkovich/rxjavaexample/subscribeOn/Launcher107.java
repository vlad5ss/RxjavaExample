package com.uladzislau.tylkovich.rxjavaexample.subscribeOn;

import java.util.concurrent.ThreadLocalRandom;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by mac on 7/29/17.
 */

public class Launcher107 {
    public static void main(String[] args) {
        Observable<Integer> lengths =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon")
                        .subscribeOn(Schedulers.computation())
                        .map(Launcher107::intenseCalculation)
                        .map(String::length);
        lengths.subscribe(i ->
                System.out.println("Received " + i + " on thread " +
                        Thread.currentThread().getName()));
        lengths.subscribe(i ->
                System.out.println("Received " + i + " on thread " +
                        Thread.currentThread().getName()));
        sleep(10000);
    }
    public static <T> T intenseCalculation(T value) {
        sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }
    public static void sleep(int millis) {
        try {
    Thread.sleep(millis);
} catch (InterruptedException e) {
        e.printStackTrace();
        }    } }
