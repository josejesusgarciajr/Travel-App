package com.example.travelapp

import com.google.android.gms.maps.model.LatLng

class Member (firstName: String, lastName: String, age : Int, coordinates: Coordinates)  {

    val firstName = firstName;
    fun getFullName() : String {
        return firstName;
    }

    val coord = coordinates;

    fun LatLng() : LatLng {
        return coord.latLng;
    }

}