package com.prisar.dalim

import android.app.Application
import com.google.android.datatransport.BuildConfig

class MainApplication : Application() {
    verride fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
//            Napier.base(DebugAntilog())
        }

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(
                appModule,
                viewmodelModule
            )
        }
    }
}