package com.example.thirdlibrarylearn.design_pattern.observer;


/**
 * 抽象观察者
 */
public interface Observer<T> {
    void onNext(T t);

    void  onSubscribe();

    void onError(Throwable throwable);

    void onComplete();
}
