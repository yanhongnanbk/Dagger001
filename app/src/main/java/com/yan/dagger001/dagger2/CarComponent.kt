package com.yan.dagger001.dagger2

import com.yan.dagger001.MainActivity
import com.yan.dagger001.models.Car
import dagger.Component

@Component(modules = [DieselEngineModule::class, WheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}