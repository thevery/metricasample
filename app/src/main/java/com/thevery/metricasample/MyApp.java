package com.thevery.metricasample;

import android.app.Application;

import com.yandex.metrica.Counter;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Counter.initialize(this);
    }
}
