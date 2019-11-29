package jwest.android_class.travel_app

import com.google.android.gms.maps.model.LatLng

class Coordinates(Lat : Double, Lng : Double) {

    //val latLng =  LatLng(Lat, Lng)
    val lat = Lat
    val lng = Lng

    constructor() : this(100.0, 100.0) {

    }
}