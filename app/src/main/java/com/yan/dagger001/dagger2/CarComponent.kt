package com.yan.dagger001.dagger2

import com.yan.dagger001.MainActivity
import com.yan.dagger001.models.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [PetroEngineModule::class, WheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("HorsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("EngineCapacity") engineCapacity: Int): Builder

        fun build(): CarComponent

    }
}