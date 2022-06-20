package com.example.thirdlibrarylearn.design_pattern.observer;

public class ObservableCreate<T> extends Observable {


    private ObservableOnSubscribe<T> source;

    public ObservableCreate(ObservableOnSubscribe<T> source) {
        this.source = source;
    }

    @Override
    protected void subscribeActual(Observer observer) {
        CreateEmitter emitter=new CreateEmitter(observer);
        source.subscribe(emitter);
    }


    static final class CreateEmitter<T> implements Emitter<T>{

        private Observer<T> observer;

        public CreateEmitter(Observer<T> observer) {
            this.observer=observer;
        }

        @Override
        public void onNext(T t) {
            observer.onNext(t);
        }

        @Override
        public void onError(Throwable throwable) {
            observer.onError(throwable);
        }

        @Override
        public void onComplete() {
            observer.onComplete();
        }
    }
}
