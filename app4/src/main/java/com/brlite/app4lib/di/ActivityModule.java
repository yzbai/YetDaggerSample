package com.brlite.app4lib.di;


import com.brlite.app4.logic.UserBiz;
import com.brlite.app4.ui.MainActivity;
import com.brlite.app4.ui.SecondActivity;
import com.brlite.app4.ui.ThirdActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Yuzhao on 8/2/2017.
 * 集中放置用于注入到Activity中的类别
 */

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector
    abstract SecondActivity contributeSecondActivity();

    @ContributesAndroidInjector
    abstract ThirdActivity contributeThirdActivity();

    @Singleton
    @Provides
    static UserBiz provideUserBiz() {
        return new UserBiz();
    }

}
