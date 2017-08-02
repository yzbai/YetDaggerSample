package com.brlite.app2.ui.second;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Yuzhao on 8/2/2017.
 */

@Module
public abstract class SecondActivityModule {
    @ContributesAndroidInjector
    abstract SecondActivity contributeSecondActivity();
}
