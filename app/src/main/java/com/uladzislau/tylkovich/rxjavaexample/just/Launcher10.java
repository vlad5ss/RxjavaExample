package com.uladzislau.tylkovich.rxjavaexample.just;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher10 {
    public static void main(String[] args) {
        List<String> items =
                Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observable<String> source = Observable.fromIterable(items);
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
