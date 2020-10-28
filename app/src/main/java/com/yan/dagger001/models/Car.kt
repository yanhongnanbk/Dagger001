package com.yan.dagger001.models

import android.util.Log
import javax.inject.Inject


class Car {
    var engine: Engine
    var wheels: Wheels

    @Inject
    constructor(engine: Engine, wheels: Wheels) {
        this.engine = engine
        this.wheels = wheels
    }

    fun drive(){
        engine.start()
        Log.d("Car", "driving.... ")
    }
}