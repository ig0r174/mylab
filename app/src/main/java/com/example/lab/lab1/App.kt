package com.example.lab.lab1

import android.app.Application
import android.content.Context
import com.example.lab.lab1.di.DaggerIAppComponent
import com.example.lab.lab1.di.IAppComponent

class App: Application() {
    lateinit var appComponent: IAppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerIAppComponent.create()
    }
}

fun Context.findAppComponent(): IAppComponent =
    (this.applicationContext as App).appComponent