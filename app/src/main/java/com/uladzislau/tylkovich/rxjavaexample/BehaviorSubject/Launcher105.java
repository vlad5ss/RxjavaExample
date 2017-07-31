package com.uladzislau.tylkovich.rxjavaexample.BehaviorSubject;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;

/**
 * Created by mac on 7/29/17.
 */

public class Launcher105 {
    public static void main(String[] args) {

    Subject<String> subject =
            BehaviorSubject.create();
subject.subscribe(s -> System.out.println("Observer 1: " +s));
        subject.onNext("Alpha");
        subject.onNext("Beta");
        subject.onNext("Gamma");
        subject.subscribe(s -> System.out.println("Observer 2: " + s));

    }}
