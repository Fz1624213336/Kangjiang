package com.example.startproject.frament;

import android.app.Application;
import android.content.Context;

/**
 * Created by 方小茗 on 2019/6/27.
 */

public class Application10 extends Application {
    public static Application10 sApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication=this;
    }
    public static Context getAppContext(){
        return sApplication.getApplicationContext();
    }
    public static Application10 getsApplication(){
        return sApplication;
    }
}
