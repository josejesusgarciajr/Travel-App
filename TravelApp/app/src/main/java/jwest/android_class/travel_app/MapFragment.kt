package jwest.android_class.travel_app


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import jwest.android_class.travel_app.databinding.FragmentLogInBinding
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
    private lateinit var token : SharedPreferences

    //private val ref = FirebaseDatabase
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
        savedInstanceState: Bundle?): View? {
        // MIGHT NEED TO IMPLEMENT BINDING
        gGroup = Group()

        binding = DataBindingUtil.inflate<FragmentMapBinding>(inflater,
            R.layout.fragment_map,container,false)
        // Bind this fragment class to the layout
        binding.mapFragment = this

        token = binding.root.context.getSharedPreferences("jose", Context.MODE_PRIVATE)

        Log.d("GMAPS", "IDK WHAT IS GOING ON...")
        // SET ON CLICK LISTENER FOR LOG OUT BTN
        binding.GMapsLogOutBtn.setOnClickListener { view : View ->
            logout()
        }

        return binding.root
        //return inflater.inflate(R.layout.fragment_map, container, false)
    }

    private fun logout() {
        var editor = token.edit()
        editor.putString("loginuser", " ")
        editor.commit()
        Log.d("LOGOUT..", "hello?")
        Log.d("LOGOUT...", token.getString("loginuser", " ").toString())
        view!!.findNavController().navigate(R.id.log_In)
    }

    override fun onMapReady(google_map: GoogleMap?) {
        google_map?. let{
            mMap = it
        }
        gGroup.displayMembers(mMap)

        setMapLongClick(mMap)

        val zoom: Float = 2.0f

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(36.1000, -115.1000), zoom))

        gGroup.displayMembers(mMap)

        // creates a custom marker window using the CustomMarker class
        // use setOnInfoWindowClickListener to click on the pin and view details
        var markerWindowAdapter = CustomMarker(context)
        mMap.setInfoWindowAdapter(markerWindowAdapter)

        mMap.setOnInfoWindowClickListener(this)

//        // SET ON CLICK LISTENER FOR LOG OUT BTN
//        binding.GMapsLogOutBtn.setOnClickListener { view : View ->
//            logout()
//        }
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
