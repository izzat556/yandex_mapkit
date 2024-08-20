package com.unact.yandexmapkitexample;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class MainApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    MapKitFactory.setApiKey("550e8356-8615-48a1-8fd6-6313343f372a");
  }
}
