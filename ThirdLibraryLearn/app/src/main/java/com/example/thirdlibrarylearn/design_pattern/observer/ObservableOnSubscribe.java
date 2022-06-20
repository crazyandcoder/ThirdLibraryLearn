package com.example.thirdlibrarylearn.design_pattern.observer;

public interface ObservableOnSubscribe<T> {

    void subscribe(Emitter<T> emitter);
}
