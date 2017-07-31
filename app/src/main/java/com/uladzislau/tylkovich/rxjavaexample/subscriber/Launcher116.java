package com.uladzislau.tylkovich.rxjavaexample.subscriber;

import java.util.concurrent.ThreadLocalRandom;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by mac on 7/30/17.
 */

public class Launcher116 {
    public static void main(String[] args) {
        Flowable.range(1,1000)
                .doOnNext(s -> System.out.println("Source pushed " + s))
                .observeOn(Schedulers.io())
                .map(i -> intenseCalculation(i))
                .subscribe(s -> System.out.println("Subscriber received " + s),
                        Throwable::printStackTrace,
                        () -> System.out.println("Done!")
                );
        sleep(20000);
    }
    public static <T> T intenseCalculation(T value) {

        sleep(ThreadLocalRandom.current().nextInt(200));
        return value;
    }
    public static void sleep(long millis) {
        try {

            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}