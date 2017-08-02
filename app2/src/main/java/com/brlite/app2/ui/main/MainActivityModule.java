package com.brlite.app2.ui.main;

import com.brlite.app2.logic.UserBiz;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Yuzhao on 8/2/2017.
 * 这里只放 用于注册到MainActivity中的类型
 */

@Module/*(subcomponents = {MainActivitySubcomponent.class})*/
public abstract class MainActivityModule {

    /*@Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);*/

    //这句话的意思，就是为MainActivity生成 Injector或者Injector的工厂类，然后放入map（容器）中等待调用。名字不重要，意图（@ContributesAndroidInjector）和 目标（MainActivity）重要
    //也不一定放在这，可以集中放在其他地方
    @ContributesAndroidInjector()
    abstract MainActivity contributeMainActivity();


    @Singleton
    @Provides
    static UserBiz provideUserBiz() {
        return new UserBiz();
    }
}
