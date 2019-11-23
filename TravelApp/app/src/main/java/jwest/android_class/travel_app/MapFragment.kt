package jwest.android_class.travel_app


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import jwest.android_class.travel_app.databinding.FragmentMapBinding
import jwest.android_class.travel_app.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.main.fragment_map.*
import java.util.*
/**
 * A simple [Fragment] subclass.
 */
class MapFragment : Fragment(), OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {
    private lateinit var binding: FragmentMapBinding
    private lateinit var gGroup: Group
    var mapFragment : SupportMapFragment? = null

    private lateinit var mMap : GoogleMap

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mapView.onCreate(savedInstanceState)
        mapView.onResume()
        mapView.getMapAsync(this)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // MIGHT NEED TO IMPLEMENT BINDING
        gGroup = Group()

        // HARD CODE JUST FOR TESTING PURPOSES
        gGroup.addMember(Member("Jose", "Garcia", 21, Coordinates(36.1699, -115.1398)))
        gGroup.addMember(Member("Nairbis", "Sibrian", 21, Coordinates(38.7567, -120.8607)))
        gGroup.addMember(Member("Ruben", "Garcia", 22, Coordinates(21.1619, -86.8515)))
        gGroup.addMember(Member("Leslie", "Garcia", 21, Coordinates(19.8968, -155.5828)))
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onMapReady(google_map: GoogleMap?) {
        google_map?. let{
            mMap = it
        }
        gGroup.dispalyMembers(mMap)

        setMapLongClick(mMap)

        val zoom: Float = 2.0f

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(36.1000, -115.1000), zoom))

        gGroup.dispalyMembers(mMap)

        // creates a custom marker window using the CustomMarker class
        // use setOnInfoWindowClickListener to click on the pin and view details
        var markerWindowAdapter = CustomMarker(context)
        mMap.setInfoWindowAdapter(markerWindowAdapter)

        mMap.setOnInfoWindowClickListener(this)
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
    override fun onInfoWindowClick(p0: Marker?) {

    }
}
