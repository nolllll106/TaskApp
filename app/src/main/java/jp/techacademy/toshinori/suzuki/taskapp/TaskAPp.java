package jp.techacademy.toshinori.suzuki.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Tony on 2017/05/07.
 */

public class TaskAPp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
