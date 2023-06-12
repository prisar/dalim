package com.prisar.dalim.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import com.prisar.dalim.ui.screens.AutoCompleteViewModel


val viewmodelModule = module {
    viewModelOf(::AutoCompleteViewModel)
}