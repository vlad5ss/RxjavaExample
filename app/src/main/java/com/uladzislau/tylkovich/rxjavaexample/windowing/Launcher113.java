package com.uladzislau.tylkovich.rxjavaexample.windowing;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

import static io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe;

/**
 * Created by mac on 7/30/17.
 */

public class Launcher113 {
//        public static void main(String[] args) {
//            Observable.interval(300, TimeUnit.MILLISECONDS)
//                    .map(i -> (i + 1) * 300) // map to elapsed time
//                    .window(1, TimeUnit.SECONDS)
//                    .flatMapSingle(obs -> obs.reduce("", (total,    next) -> total + (total.equals("")   "" : "|") + next))
//                    .subscribe(System.out::println);
//                    sleep(5000);
//                    }
//public static void sleep(int millis) {
//        try {
//        Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }}

}