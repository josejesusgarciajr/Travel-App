// HAVE TO DO THIS TO MAKE MAP APPEAR!
// ALSO MAKE SURE YOU ARE CONNECTED TO THE INTERNET!

// BELOW IS FROM AN ERROR IN THE LOG CAT
//2019-11-14 18:24:32.902 5482-6996/j.edu.travel_app E/Google Maps Android API: In the Google Developer Console (https://console.developers.google.com)
//Ensure that the "Google Maps Android API v2" is enabled.
//Ensure that the following Android Key exists:
//API Key: AIzaSyA5Yny5QlDtQPf5nPQy8g3VisAYkM9o6qw
//Android Application (<cert_fingerprint>;<package_name>): 5C:F5:02:23:EE:06:8D:DA:FC:8E:B8:A0:59:21:28:3B:68:94:32:A1;j.edu.travel_app
//2019-11-14 18:28:08.846 6666-6700/? E/GooglePlayServicesUtil: The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.
//2019-11-14 18:28:08.894 6666-6699/? E/GooglePlayServicesUtil: The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.



package j.edu.travel_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var gGroup: Group

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        // INITIALIZE THE GROUP
        gGroup = Group()

        // HARD CODE JUST FOR TESTING PURPOSES
        gGroup.addMember(Member("Jose", "Garcia", 21, Coordinates(36.1699, -115.1398)))
        gGroup.addMember(Member("Nairbis", "Sibrian", 21, Coordinates(38.7567, -120.8607)))
        gGroup.addMember(Member("Ruben", "Garcia", 22, Coordinates(21.1619, -86.8515)))
        gGroup.addMember(Member("Leslie", "Garcia", 21, Coordinates(19.8968, -155.5828)))
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        gGroup.dispalyMembers(mMap)

    }
}

