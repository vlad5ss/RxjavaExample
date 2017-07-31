package com.uladzislau.tylkovich.rxjavaexample.maybe;

import io.reactivex.disposables.Disposable;

/**
 * Created by mac on 7/27/17.
 */

public interface MaybeObserver<T> {
    void onSubscribe(Disposable d);
    void onSuccess(T value);
    void onError(Throwable e);
    void onComplete();
}
