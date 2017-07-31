package com.uladzislau.tylkovich.rxjavaexample.autoConnect;

import java.util.concurrent.ThreadLocalRandom;

import io.reactivex.Observable;

/**
 * Created by mac on 7/29/17.
 */

public class Launcher102 {
    public static void main(String[] args) {
        Observable<Integer> threeRandoms = Observable.range(1,3)
                .map(i -> randomInt())
                .publish()
                .autoConnect(2);
        //Observer 1 - print each random integer
        threeRandoms.subscribe(i -> System.out.println("Observer 1: " + i));
//Observer 2 - sum the random integers, then print
threeRandoms.reduce(0, (total,next) -> total + next).subscribe(i -> System.out.println("Observer 2: " +   i)); }
    public static int randomInt() {
        return ThreadLocalRandom.current().nextInt(100000);
    } }
