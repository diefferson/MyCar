package com.gft.mycar.app

import com.gft.mycar.ui.base.BaseViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object AppInject{

    fun modules() : List<Module> = listOf(
        applicationModule,
        viewModelModule,
        repositoriesModule
    )

    private val applicationModule: Module = module {

    }

    private val viewModelModule = module {
        viewModel{ BaseViewModel()}

    }

    private val repositoriesModule: Module = module {

    }



}