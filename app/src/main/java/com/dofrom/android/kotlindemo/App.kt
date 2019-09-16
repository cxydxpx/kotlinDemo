package com.dofrom.android.kotlindemo

import android.app.Application
import android.content.Context
import kotlin.properties.Delegates

/**
 * 作者 Y_MS
 * Created by ${APEN} on 2019-09-16.
 * GitHub：https://github.com/cxydxpx
 */
class App : Application() {

    companion object {
        var context: Context by Delegates.notNull()
            private set
    }

    override fun onCreate() {
        super.onCreate()

        context = applicationContext

    }


}