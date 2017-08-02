package hb.yetdaggersample.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hb.yetdaggersample.UsefulHelper;

/**
 * Created by Yuzhao on 8/2/2017.
 *
 */

@Module
public abstract class ApplicationModule {

    @Singleton
    @Provides
    static UsefulHelper provideUsefulHelper() {
        return new UsefulHelper();
    }
}
