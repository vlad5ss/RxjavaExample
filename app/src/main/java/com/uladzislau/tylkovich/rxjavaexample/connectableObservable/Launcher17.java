package com.uladzislau.tylkovich.rxjavaexample.connectableObservable;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;
/**
 * Created by mac on 7/26/17.
 */

public class Launcher17 {
    public static void main(String[] args) {

        ConnectableObservable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").publish();
        //Set up observer 1
        source.subscribe(s -> System.out.println("Observer 1: " + s));
        //Set up observer 2
        source.map(String::length).subscribe(i -> System.out.println("Observer 2: " + i));
//Fire!
        source.connect();
    }
}
