package com.example.lab.lab1.di

import com.example.lab.lab1.viewmodels.ViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Singleton @Component(modules = [
    AppBindsModule::class,
])
interface IAppComponent {
    fun viewModelFactory(): ViewModelFactory
}