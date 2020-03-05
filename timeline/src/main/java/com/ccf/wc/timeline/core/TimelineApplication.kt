package com.ccf.wc.timeline.core

import com.ccf.wc.baselib.BaseApplication

class TimelineApplication: BaseApplication() {

    override fun initBaseAppModules() {
        registerBaseAppModule(TimelineAppModule::class.java)
    }
}