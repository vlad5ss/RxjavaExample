package com.uladzislau.tylkovich.rxjavaexample.sorted;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher57 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma" ,"Delta",
                "Epsilon")
                .sorted((x,y) -> Integer.compare(x.length(), y.length()))
                .subscribe(System.out::println);
    }
}

