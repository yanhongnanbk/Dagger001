package com.yan.dagger001.models

import android.util.Log
import javax.inject.Inject

class PetrolEngine : Engine {
    @Inject
    constructor()

    override fun start() {
//        TODO("Not yet implemented")
        Log.d("car", "Petro Engine")
    }
}