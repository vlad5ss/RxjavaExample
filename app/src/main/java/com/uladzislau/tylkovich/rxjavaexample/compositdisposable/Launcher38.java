package com.uladzislau.tylkovich.rxjavaexample.compositdisposable;

import io.reactivex.Observable;

/**
 * Created by mac on 7/27/17.
 */

public class Launcher38 {
    public static void main(String[] args) {
        Observable<Integer> source =
                Observable.create(observableEmitter -> {
                    try {
                        for (int i = 0; i < 1000; i++) {
                            while (!observableEmitter.isDisposed()) {
                                observableEmitter.onNext(i);
                            }
                            if (observableEmitter.isDisposed())
                                return;
                            }
                    observableEmitter.onComplete();
                } catch (Throwable e) {
            observableEmitter.onError(e);
        }
    }); }
}
