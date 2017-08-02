package hb.yetdaggersample.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import hb.yetdaggersample.base.YetDaggerSampleApplication;

/**
 * Created by Yuzhao on 8/2/2017..
 *
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, AndroidSupportInjectionModule.class, MainActivityModule.class})
public interface ApplicationComponent {

    void inject(YetDaggerSampleApplication application);
}
