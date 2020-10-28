package com.yan.dagger001.dagger2

import com.yan.dagger001.models.Rims
import com.yan.dagger001.models.Tyres
import com.yan.dagger001.models.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTyres(): Tyres {
        var tyres = Tyres()
        tyres.inflate()
        return tyres
    }

    @Provides
    fun provideWheels(rims: Rims,tyres: Tyres): Wheels {
        return Wheels(rims,tyres)
    }
}