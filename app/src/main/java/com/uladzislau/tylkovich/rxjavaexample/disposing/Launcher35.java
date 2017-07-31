package com.uladzislau.tylkovich.rxjavaexample.disposing;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher35 {
    public static void main(String[] args) {
        Observable<Long> seconds =
                Observable.interval(1, TimeUnit.SECONDS);
        Disposable disposable =
                seconds.subscribe(l -> System.out.println("Received: " + l));
        //sleep 5 seconds
        sleep(5000);
        //dispose and stop emissions
        disposable.dispose();
        //sleep 5 seconds to prove
        //there are no more emissions
        sleep(5000);
    }
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } }
