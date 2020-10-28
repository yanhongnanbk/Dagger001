package com.yan.dagger001.dagger2

import com.yan.dagger001.models.Engine
import com.yan.dagger001.models.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetroEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}