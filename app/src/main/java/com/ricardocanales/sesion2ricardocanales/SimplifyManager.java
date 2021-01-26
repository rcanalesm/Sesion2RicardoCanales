package com.ricardocanales.sesion2ricardocanales;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class SimplifyManager implements LifecycleObserver{
    public void setOwner(Lifecycle lifecycle){
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void createHappened(){
        Log.d("Sample", "The OnCreate was invoked from SimplifyManager");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void startHappened(){
        Log.d("Sample", "The OnStart was invoked from SimplifyManager");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resumeHappened(){
        Log.d("Sample", "The OnResume was invoked from SimplifyManager");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pauseHappened(){
        Log.d("Sample", "The OnPause was invoked from SimplifyManager");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stopHappened(){
        Log.d("Sample", "The OnStop was invoked from SimplifyManager");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroyHappened(){
        Log.d("Sample", "The OnDestroy was invoked from SimplifyManager");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onEventHappened(){
        Log.d("Sample", "The OnAnyEvent was invoked from SimplifyManager");
    }

}
