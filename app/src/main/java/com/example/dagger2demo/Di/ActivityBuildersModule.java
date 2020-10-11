package com.example.dagger2demo.Di;

import com.example.dagger2demo.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();


    @Provides
    static String someString(){
        return "this is a test string";
    }
}
