package hb.yetdaggersample.di;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import hb.yetdaggersample.MainActivity;

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
}
