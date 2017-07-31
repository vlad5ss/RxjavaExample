package com.uladzislau.tylkovich.rxjavaexample.subscribeOn;

import java.net.URL;
import java.util.Scanner;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by mac on 7/29/17.
 */

public class Launcher109 {
    public static void main(String[] args) {
        Observable.fromCallable(() ->
                getResponse("https://api.github.com/users/thomasnield/starred")
        ).subscribeOn(Schedulers.io())
                .subscribe(System.out::println);
        sleep(10000);
    }
    private static String getResponse(String path) {
        try {
            return new Scanner(new URL(path).openStream(),
                    "UTF-8").useDelimiter("\\A").next();
        } catch (Exception e) {
            return e.getMessage();
        } }
    public static void sleep(int millis) {
        try {

    Thread.sleep(millis);
} catch (InterruptedException e) {
        e.printStackTrace();
        }}}
