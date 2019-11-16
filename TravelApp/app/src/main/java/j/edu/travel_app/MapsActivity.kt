package j.edu.travel_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Marker
import java.util.Locale


class MapsActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {

    private lateinit var mMap: GoogleMap
    private lateinit var gGroup: Group;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        // INITIALIZE THE GROUP
        gGroup = Group();

        // HARD CODE JUST FOR TESTING PURPOSES
        gGroup.addMember(Member("Jose", "Garcia", 21, Coordinates(36.1699, -115.1398)))
        gGroup.addMember(Member("Nairbis", "Sibrian", 21, Coordinates(38.7567, -120.8607)))
        gGroup.addMember(Member("Ruben", "Garcia", 22, Coordinates(21.1619, -86.8515)))
        gGroup.addMember(Member("Leslie", "Garcia", 21, Coordinates(19.8968, -155.5828)))


    }
    // User clicks on the map to get a dropped pin
        // The pop up window for the dropped pin displays place details
    private fun setMapLongClick(map: GoogleMap) {

        map.setOnMapLongClickListener { latlong ->
            var place = Place("Dropped Pin", Coordinates(latlong.latitude, latlong.longitude),
                                5, "Best Place Ever")

            // A Snippet is Additional text that's displayed below the title.
            val snippet = String.format(
                Locale.getDefault(),
                "Lat: %1$.5f, Long: %2$.5f",
                latlong.latitude,
                latlong.longitude
            ) + "\nRating: " + place.rating + "\nDescription: " + place.description

            map.addMarker(
                MarkerOptions()
                    .position(latlong)
                    .title(place.name)
                    .snippet(snippet)

            )
        }
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

        setMapLongClick(mMap)

        val zoom: Float = 2.0f

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(36.1000, -115.1000), zoom))

        gGroup.dispalyMembers(mMap)

        // creates a custom marker window using the CustomMarker class
            // use setOnInfoWindowClickListener to click on the pin and view details
        var markerWindowAdapter = CustomMarker(applicationContext)
        googleMap.setInfoWindowAdapter(markerWindowAdapter)

        googleMap.setOnInfoWindowClickListener(this)

    }
    override fun onInfoWindowClick(p0: Marker?) {

    }

}
