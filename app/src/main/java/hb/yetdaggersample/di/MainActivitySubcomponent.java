package hb.yetdaggersample.di;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import hb.yetdaggersample.MainActivity;

/**
 * Created by Yuzhao on 8/2/2017.
 *
 */

@Subcomponent
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {   }

}
