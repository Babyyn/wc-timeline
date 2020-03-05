package com.ccf.wc.timeline.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
import com.ccf.wc.baselib.core.TimeLineConstants

@Route(path = TimeLineConstants.SERVICE_TIMELINE)
class TimelineApiServiceImpl: ITimelineApiService, IProvider {

    override fun init(context: Context?) {

    }
}