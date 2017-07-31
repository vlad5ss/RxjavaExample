package com.uladzislau.tylkovich.rxjavaexample.comleteble;

import io.reactivex.disposables.Disposable;

/**
 * Created by mac on 7/27/17.
 */

public interface CompletableObserver<T> {
    void onSubscribe(Disposable d);
    void onComplete();
    void onError(Throwable error);
}
