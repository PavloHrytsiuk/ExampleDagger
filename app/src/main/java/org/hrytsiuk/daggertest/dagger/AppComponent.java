package org.hrytsiuk.daggertest.dagger;

import org.hrytsiuk.daggertest.dagger.modules.NetworkModule;
import org.hrytsiuk.daggertest.dagger.modules.StorageModule;
import org.hrytsiuk.daggertest.main.MainActivity;

import dagger.Component;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    void injectsMainActivity(MainActivity mainActivity);
}
