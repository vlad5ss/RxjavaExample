package com.uladzislau.tylkovich.rxjavaexample.any;

import java.time.LocalDate;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher63 {
    public static void main(String[] args) {
        Observable.just("2016-01-01", "2016-05-02", "2016-09-12",
                "2016-04-03")
                .map(LocalDate::parse)
                .any(dt -> dt.getMonthValue() >= 6)
                .subscribe(s -> System.out.println("Received: " + s));
    } }

