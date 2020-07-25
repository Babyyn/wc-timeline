package com.ccf.wc.timeline.core

import android.util.Log
import com.ccf.wc.baselib.BaseAppModule

class TimelineAppModule : BaseAppModule() {

    private val TAG = "TimelineAppModule"

    override fun onCreate() {
        super.onCreate()
        // TODO
    }

    override fun lazyInitAfterLaunched() {
        super.lazyInitAfterLaunched()
        // TODO
    }

    override fun doNotIncludeWhenLaunch(): Boolean {
        return true
    }
}