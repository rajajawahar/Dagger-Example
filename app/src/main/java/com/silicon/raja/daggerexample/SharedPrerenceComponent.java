package com.silicon.raja.daggerexample;


import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SharedPreferencesApp.class})
public interface SharedPrerenceComponent {

    SharedPreferences getSharedPreference();
}
