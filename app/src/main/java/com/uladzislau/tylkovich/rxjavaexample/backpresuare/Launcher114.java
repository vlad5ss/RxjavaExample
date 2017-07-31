package com.uladzislau.tylkovich.rxjavaexample.backpresuare;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by mac on 7/30/17.
 */

public class Launcher114 {
    public static void main(String[] args) {
        Observable.range(1, 999_999_999)
                .map(MyItem::new)
                .observeOn(Schedulers.io())
                .subscribe(myItem -> {
                    sleep(50);
                    System.out.println("Received MyItem " +myItem.id);
                });

    sleep(Long.MAX_VALUE);
}
static void sleep(long milliseconds) {
        try {
        Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
static final class MyItem {
    final int id;
    MyItem(int id) {
        this.id = id;
        System.out.println("Constructing MyItem " + id);
    }}

}