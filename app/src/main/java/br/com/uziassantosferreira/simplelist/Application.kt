package br.com.uziassantosferreira.simplelist

import android.app.Application
import br.com.uziassantosferreira.simplelist.beagle.MyBeagleSetup

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        MyBeagleSetup().init(this)
    }
}