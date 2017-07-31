package com.uladzislau.tylkovich.rxjavaexample.startwith;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher53 {
    public static void main(String[] args) {

    Observable<String> menu =
            Observable.just("Coffee", "Tea", "Espresso", "Latte");
//print menu
menu.startWithArray("COFFEE SHOP MENU","----------------")
        .subscribe(System.out::println);
}}
