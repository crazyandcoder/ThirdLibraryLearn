package com.example.thirdlibrarylearn.design_pattern.observer;


public interface Emitter<T> {
    void onNext(T t);

    void onError(Throwable throwable);

    void onComplete();
}
