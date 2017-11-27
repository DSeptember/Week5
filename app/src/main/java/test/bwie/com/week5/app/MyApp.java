package test.bwie.com.week5.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by dy on 2017/11/23.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
