package com.uladzislau.tylkovich.rxjavaexample.concatWith;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by mac on 7/28/17.
 */

public class Launcher90 {
    public static void main(String[] args) {
        //emit every second, but only take 2 emissions
        Observable<String> source1 =

        Observable.interval(1, TimeUnit.SECONDS)
        .take(2)
        .map(l -> l + 1) // emit elapsed seconds
        .map(l -> "Source1: " + l + " seconds");
//emit every 300 milliseconds
        Observable<String> source2 =
        Observable.interval(300, TimeUnit.MILLISECONDS)
        .map(l -> (l + 1) * 300) // emit elapsed milliseconds
        .map(l -> "Source2: " + l + " milliseconds");
        Observable.concat(source1, source2)
        .subscribe(i -> System.out.println("RECEIVED: " + i));
//keep application alive for 5 seconds
        sleep(5000);}
public static void sleep(long millis) {
        try {
        Thread.sleep(millis);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    } }