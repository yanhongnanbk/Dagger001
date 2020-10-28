package com.yan.dagger001.models

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {
    var horsePower: Int
    var engineCapacity: Int

    @Inject
    constructor(
        @Named("HorsePower") horsePower: Int,
        @Named("EngineCapacity") engineCapacity: Int
    ) {
        this.horsePower = horsePower
        this.engineCapacity = engineCapacity
    }


    override fun start() {
//        TODO("Not yet implemented")
        Log.d("car", "Petro Engine+Horse power${horsePower} Engine capacity ${engineCapacity}")
    }
}