package com.example.thirdlibrarylearn.design_pattern.observer;

public abstract class Observable<T> implements ObservableSource {


    @Override
    public void subscribeObserver(Observer observer) {
        subscribeActual(observer);
    }

    protected abstract void subscribeActual(Observer observer);

    public static <T> Observable create(ObservableOnSubscribe<T> source){
        return new ObservableCreate(source);
    }
}
