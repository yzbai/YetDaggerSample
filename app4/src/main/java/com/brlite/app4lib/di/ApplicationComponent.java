package com.brlite.app4lib.di;



import com.brlite.app4lib.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Yuzhao on 8/2/2017..
 *
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,    //Injector Map 容器
        ApplicationModule.class,                //全局单例使用的类别
        ActivityModule.class})                  // 所有的针对Activity, Fragment 的Module都写到这儿
public interface ApplicationComponent {

    //对于特指android中的组件注入，只有这一句显示调用。用于注入Application中声明的 DispatchingAndroidInjector.

    void inject(BaseApplication application);
}
