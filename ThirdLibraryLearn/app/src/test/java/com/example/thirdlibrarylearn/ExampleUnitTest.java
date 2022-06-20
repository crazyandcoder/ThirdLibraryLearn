package com.example.thirdlibrarylearn;

import com.example.thirdlibrarylearn.design_pattern.observer.Emitter;
import com.example.thirdlibrarylearn.design_pattern.observer.Observable;
import com.example.thirdlibrarylearn.design_pattern.observer.ObservableOnSubscribe;
import com.example.thirdlibrarylearn.design_pattern.observer.Observer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
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