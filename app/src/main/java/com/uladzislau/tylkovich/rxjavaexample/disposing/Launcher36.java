package com.uladzislau.tylkovich.rxjavaexample.disposing;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher36 {
    public static void main(String[] args) {
        Observable<Long> source =
                Observable.interval(1, TimeUnit.SECONDS);
        ResourceObserver<Long> myObserver = new
                ResourceObserver<Long>() {
                    @Override
                    public void onNext(Long value) {
                        System.out.println(value);
                    }
                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }
                    @Override
                    public void onComplete() {
                        System.out.println("Done!");
                    }
                };
        //capture Disposable
        Disposable disposable = source.subscribeWith(myObserver);
    }
}

