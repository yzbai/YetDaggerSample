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

    //按理说，MainActivityModule已经在ApplicationComponent中注册了，写在Component的Modules中了。为什么还需要在MainActivityModule中，声明subcomponent是谁
    //原因是，在dagger.android中，设定每一个Activity都要提供自己的AndroidInjector<T>，而且要注册到map中，供AndroidInjector.Inject(...)调用时查询
    //下面这个方法，即是提供AndroidInjector<T>的工厂类。
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
