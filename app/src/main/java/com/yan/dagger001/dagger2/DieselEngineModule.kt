package com.yan.dagger001.dagger2

import com.yan.dagger001.models.DieselEngine
import com.yan.dagger001.models.Engine
import com.yan.dagger001.models.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {
    var horsePower: Int

    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}