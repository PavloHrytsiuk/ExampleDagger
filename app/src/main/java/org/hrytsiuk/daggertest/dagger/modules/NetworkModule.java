package org.hrytsiuk.daggertest.dagger.modules;

import org.hrytsiuk.daggertest.main.NetworkUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
}
