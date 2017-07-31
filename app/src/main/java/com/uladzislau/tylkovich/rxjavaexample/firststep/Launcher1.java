package com.uladzislau.tylkovich.rxjavaexample.firststep;

import android.util.Log;

import io.reactivex.Observable;

/**
 * Created by mac on 7/26/17.
 */

public class Launcher1 {
    public static void main(String[] args) {
        Observable<String> myStrings =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
//        Log.d("mystring", String.valueOf(myStrings));
        System.out.print(String.valueOf(myStrings));
    }

}
