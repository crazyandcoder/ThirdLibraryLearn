package com.example.thirdlibrarylearn.design_pattern.observer;

public class test {


    public static void main(String args[]){
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(Emitter<String> emitter) {
                emitter.onNext("hello");
            }
        }).subscribeObserver(new Observer<String>() {
            @Override
            public void onNext(String o) {
                System.out.println(o);
            }

            @Override
            public void onSubscribe() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

}
