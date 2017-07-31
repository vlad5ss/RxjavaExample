package com.uladzislau.tylkovich.rxjavaexample.cache;

import io.reactivex.Observable;

/**
 * Created by mac on 7/29/17.
 */

public class Launcher104 {
    public static void main(String[] args) {
        Observable<Integer> cachedRollingTotals =
                Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                        .scan(0, (total,next) -> total + next)
                        .cache();
        cachedRollingTotals.subscribe(System.out::println);
    }
}
