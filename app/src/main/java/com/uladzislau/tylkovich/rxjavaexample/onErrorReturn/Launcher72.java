package com.uladzislau.tylkovich.rxjavaexample.onErrorReturn;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher72 {
    public static void main(String[] args) {
        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .map(i -> 10 / i)
                .onErrorReturn(e -> - 1)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("RECEIVED ERROR: " + e)
                ); }


}
