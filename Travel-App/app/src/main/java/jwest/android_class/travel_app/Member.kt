package jwest.android_class.travel_app
import com.google.android.gms.maps.model.LatLng

class Member (firstName: String, lastName: String, age : Int, coordinates: Coordinates)  {

    val firstName = firstName
    val lastName = lastName
    val age = age
    fun getFullName() : String {
        return firstName + " " + lastName;
    }

    val coord = coordinates;

    fun LatLng() : LatLng {
        return coord.latLng;
    }

}