package com.prisar.dalim.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module


val viewmodelModule = module {
    viewModelOf(::AutoCompleteViewModel)
}