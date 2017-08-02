package hb.yetdaggersample.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import hb.yetdaggersample.YetDaggerSampleApplication;
import hb.yetdaggersample.base.BaseApplication;

/**
 * Created by Yuzhao on 8/2/2017..
 *
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, AndroidSupportInjectionModule.class, ApplicationModule.class, MainActivityModule.class})
public interface ApplicationComponent {

    void inject(BaseApplication application);
}
