package com.prisar.dalim

import android.app.Application
import com.google.android.datatransport.BuildConfig
import com.prisar.dalim.di.appModule
import com.prisar.dalim.di.viewmodelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application() {
    override fun onCreate() {
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