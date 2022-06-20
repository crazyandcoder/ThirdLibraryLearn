package com.example.thirdlibrarylearn.design_pattern.observer;

public interface ObservableSource<T> {

    void subscribeObserver(Observer<T>  observer);

}
