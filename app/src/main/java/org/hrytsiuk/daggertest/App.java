package org.hrytsiuk.daggertest;

import android.app.Application;

import org.hrytsiuk.daggertest.dagger.AppComponent;
import org.hrytsiuk.daggertest.dagger.DaggerAppComponent;

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
