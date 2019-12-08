package jwest.android_class.travel_app
import com.google.android.gms.maps.model.LatLng

class Member (id: String, firstName: String, lastName: String, age : Int, coordinates: Coordinates, username: String, password: String)  {

    val firstName = firstName
    val lastName = lastName
    val username = username
    val password = password
    val age = age

    constructor() : this("", "", "", -1, Coordinates(100.0, 100.0), "", ""){

    }

    fun getFullName() : String {
        return firstName +  " " + lastName
    }

    val coord = coordinates

}