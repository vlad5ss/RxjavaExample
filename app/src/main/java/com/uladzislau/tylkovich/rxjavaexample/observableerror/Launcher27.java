package com.uladzislau.tylkovich.rxjavaexample.observableerror;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher27 {
    public static void main(String[] args) {
        Observable.error(() -> new Exception("Crash and burn!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        Throwable::printStackTrace,
                        () ->  System.out.println("Done!"));
    }
}
