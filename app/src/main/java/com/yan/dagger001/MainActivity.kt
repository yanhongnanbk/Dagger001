package com.yan.dagger001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yan.dagger001.dagger2.CarComponent
import com.yan.dagger001.dagger2.DaggerCarComponent
import com.yan.dagger001.models.Car
import com.yan.dagger001.models.Engine
import com.yan.dagger001.models.Wheels
import dagger.internal.DaggerCollections
import javax.inject.Inject

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var engine = Engine()
//        var wheels = Wheels()
//
//        car = Car(engine, wheels)
//        car = DaggerCarComponent.create().getCar()
        var carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        car.drive()


    }
}