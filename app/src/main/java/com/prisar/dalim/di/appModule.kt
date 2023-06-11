package com.prisar.dalim.di

import com.mediamonks.wordfilter.LanguageChecker
import com.prisar.dalim.data.autocomplete.AutoCompleteService
import com.prisar.dalim.data.autocomplete.AutoCompleteServiceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
    single<AutoCompleteService> {
        AutoCompleteServiceImpl(
            context = androidContext(),
            languageChecker = get()
        )
    }

    singleOf<LanguageChecker>(::LanguageCheckerImpl)
}