package com.yan.dagger001.models

import android.util.Log
import javax.inject.Inject

class DieselEngine : Engine {

    var horsePower: Int

    @Inject
    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    override fun start() {
        Log.d("car", "Diesel Engine, horse power value ${this.horsePower}")
    }
}