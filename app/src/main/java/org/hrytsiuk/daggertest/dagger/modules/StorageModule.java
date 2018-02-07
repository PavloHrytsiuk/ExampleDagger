package org.hrytsiuk.daggertest.dagger.modules;

import org.hrytsiuk.daggertest.main.DatabaseHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {
    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }
}
