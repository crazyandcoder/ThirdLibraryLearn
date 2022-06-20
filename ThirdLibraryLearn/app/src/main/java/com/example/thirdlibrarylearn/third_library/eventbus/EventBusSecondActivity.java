package com.example.thirdlibrarylearn.third_library.eventbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.thirdlibrarylearn.R;
import com.example.thirdlibrarylearn.third_library.eventbus.event.MessageEvent;

import org.greenrobot.eventbus.EventBus;

public class EventBusSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus_second);
        EventBus.getDefault().post(new MessageEvent("hello eventbus"));
    }
}
