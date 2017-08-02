package com.brlite.app4lib.di;




import com.brlite.app4lib.util.UsefulHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Yuzhao on 8/2/2017.
 *
 * 这里放入全局使用的工具类，全局单利
 */

@Module
public abstract class ApplicationModule {

    @Singleton
    @Provides
    static UsefulHelper provideUsefulHelper() {
        return new UsefulHelper();
    }
}
