package com.lozasolutions.androiddevcerttraining.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.lozasolutions.androiddevcerttraining.data.DataManager;
import com.lozasolutions.androiddevcerttraining.data.SyncService;
import com.lozasolutions.androiddevcerttraining.data.local.DatabaseHelper;
import com.lozasolutions.androiddevcerttraining.data.local.PreferencesHelper;
import com.lozasolutions.androiddevcerttraining.data.remote.RibotsService;
import com.lozasolutions.androiddevcerttraining.injection.ApplicationContext;
import com.lozasolutions.androiddevcerttraining.injection.module.ApplicationModule;
import com.lozasolutions.androiddevcerttraining.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
