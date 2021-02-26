package com.jeremyliao.lebapp.app;

import android.app.Application;

import com.jeremyliao.liveeventbus.XLiveDataEventBus;

/**
 * Created by liaohailiang on 2019/3/26.
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        XLiveDataEventBus
                .config()
                .lifecycleObserverAlwaysActive(true);
    }
}
