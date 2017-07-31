package com.uladzislau.tylkovich.rxjavaexample.comleteble;

import io.reactivex.Completable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher34 {
    public static void main(String[] args) {
        Completable.fromRunnable(() -> runProcess())
                .subscribe(() -> System.out.println("Done!"));
    }
    public static void runProcess() {
        //run process here
    }
}
