package com.yan.dagger001.models

import javax.inject.Inject

class Wheels {
//    We dont own this class so we cannot annote it with @Inject

    var rims: Rims
    var tyres: Tyres

    constructor(rims: Rims, tyres: Tyres) {
        this.rims = rims
        this.tyres = tyres
    }
}