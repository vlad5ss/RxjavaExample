package com.uladzislau.tylkovich.rxjavaexample.firststep;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher3 {
    public static void main(String[] args) {
        Observable<String> myStrings =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        myStrings.map(s -> s.length()).subscribe(s ->
                System.out.println(s));
    }
}
