package com.lozasolutions.androiddevcerttraining.injection.component;

import dagger.Subcomponent;
import com.lozasolutions.androiddevcerttraining.injection.PerActivity;
import com.lozasolutions.androiddevcerttraining.injection.module.ActivityModule;
import com.lozasolutions.androiddevcerttraining.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
