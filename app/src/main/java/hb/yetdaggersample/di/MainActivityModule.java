package hb.yetdaggersample.di;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import hb.yetdaggersample.UserBiz;
import hb.yetdaggersample.ui.MainActivity;

/**
 * Created by Yuzhao on 8/2/2017.
 *
 */

@Module(subcomponents = {MainActivitySubcomponent.class})
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);

    @Singleton
    @Provides
    static UserBiz provideUserBiz() {
        return new UserBiz();
    }
}
