package com.ujianaruna.jovandy.ui

import android.app.Application
import com.ujianaruna.jovandy.R
import com.ujianaruna.jovandy.di.initDI
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Bold.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

        initDI()
    }
}
