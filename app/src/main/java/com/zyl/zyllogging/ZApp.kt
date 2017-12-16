package com.zyl.zyllogging

import android.app.Application
import com.zyl.zlogger.ZLogger

/**
 * Created by Administrator on 2017/12/16 0016.
 */
class ZApp : Application() {


    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
        //开启打印日志
        ZLogger.init(true)
    }

    companion object {
        lateinit var instance: ZApp
    }
}