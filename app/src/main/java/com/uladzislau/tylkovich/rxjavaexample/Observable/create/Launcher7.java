package com.uladzislau.tylkovich.rxjavaexample.Observable.create;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher7 {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            try {
                emitter.onNext("Alpha");
                emitter.onNext("Beta");
                emitter.onNext("Gamma");
                emitter.onNext("Delta");
                emitter.onNext("Epsilon");
                emitter.onComplete();
            } catch (Throwable e) {
                emitter.onError(e);
            } });
        Observable<Integer> lengths = source.map(String::length);
        Observable<Integer> filtered = lengths.filter(i -> i >= 5);
        filtered.subscribe(s -> System.out.println("RECEIVED: " +
                s)); }
}
