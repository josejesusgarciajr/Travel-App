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
import com.google.firebase.database.*
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
    private lateinit var landmarksReference: DatabaseReference
    private lateinit var memberReference: DatabaseReference
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
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?): View? {
//        // MIGHT NEED TO IMPLEMENT BINDING
//        gGroup = Group()
//
//        return inflater.inflate(R.layout.fragment_map, container, false)
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentMapBinding>(inflater,
            R.layout.fragment_map,container,false)
        // Bind this fragment class to the layout
        binding.mapFragment = this

        token = binding.root.context.getSharedPreferences("user", Context.MODE_PRIVATE)

        Log.d("GMAPS", "IDK WHAT IS GOING ON...")
        // SET ON CLICK LISTENER FOR LOG OUT BTN
        binding.GMapsLogOutBtn.setOnClickListener { view : View ->
            logout()
        }

        return binding.root
    }

    override fun onMapReady(google_map: GoogleMap?) {
        google_map?. let{
            mMap = it
        }
//        gGroup.displayMembers(mMap)
        displayLandmarks()
        setMapLongClick(mMap, view)

        val zoom: Float = 2.0f

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(36.1000, -115.1000), zoom))

//        gGroup.displayMembers(mMap)

        // creates a custom marker window using the CustomMarker class
        // use setOnInfoWindowClickListener to click on the pin and view details
        var markerWindowAdapter = CustomMarker(context)
        mMap.setInfoWindowAdapter(markerWindowAdapter)

        mMap.setOnInfoWindowClickListener(this)
    }

    // User clicks on the map to get a dropped pin
    // The pop up window for the dropped pin displays place details
    private fun setMapLongClick(map: GoogleMap, view: View?) {

        map.setOnMapLongClickListener { latlong ->
            var latitude : Float = latlong.latitude.toFloat()
            var longitude : Float = latlong.longitude.toFloat()
            view?.findNavController()?.navigate(MapFragmentDirections.actionMapFragmentToAddLandmarkFragment(latitude, longitude))

        }
    }
    private fun displayLandmarks() {
        landmarksReference = FirebaseDatabase.getInstance().getReference("landmarks")
        Log.d("firebase ", landmarksReference.database.reference.toString())

        landmarksReference.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") // THIS METHOD RUNS ONLY IF DATA READ FAILED
            }

            override fun onDataChange(p0: DataSnapshot) {
                // THIS METHOD RUNS ONLY IF DATA IS READ SUCCESSFULLY

                if(p0!!.exists()) {

                    for(L in p0.children) {
                        Log.d("FROM FIREBASE", L.toString())
                        Log.d("KEY: ", L.key)
                        Log.d("Value: ", L.getValue().toString())
                        val landmark = L.getValue(Landmark::class.java)

                        val latLng : LatLng = LatLng(landmark!!.coordinates.lat, landmark!!.coordinates.lng)
                        val info = landmark.title + " Lat: " + latLng.latitude + " Lng: " + latLng.longitude
                        Log.d("NameLatLng", info)
                        var marker : Marker = mMap.addMarker(MarkerOptions().position(latLng).title(landmark.title + "\n" + landmark.description))
                        marker.tag = landmark
                        Log.d("GOOGLEMAPS: ", landmark.title)
                    }
                }
            }
        })
    }
    override fun onInfoWindowClick(p0: Marker?) {
        Log.d("marker clicked!", p0?.title + " is the landmark info")
        Log.d("the object ", p0?.tag.toString())
        var landmark = p0?.tag as? Landmark

        memberReference = FirebaseDatabase.getInstance().getReference("members").child(landmark!!.authorId.toString())

        memberReference.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") // THIS METHOD RUNS ONLY IF DATA READ FAILED
            }

            override fun onDataChange(p0: DataSnapshot) {
                // THIS METHOD RUNS ONLY IF DATA IS READ SUCCESSFULLY

                if(p0!!.exists()) {
                    val member : Member? = p0.getValue(Member::class.java)
                    Log.d("IDKKK", member!!.firstName)
                    view?.findNavController()?.navigate(MapFragmentDirections.actionMapFragmentToLandmarkFragment(landmark!!.title, landmark!!.description, landmark!!.rating, landmark!!.id, landmark!!.authorId.toString(), member.firstName))
                }
            }

        })


    }

    private fun logout() {
        var editor = token.edit()
        editor.putString("loginuser", " ")
        editor.commit()
        Log.d("LOGOUT..", "hello?")
        Log.d("LOGOUT...", token.getString("loginuser", " ").toString())
        view!!.findNavController().navigate(R.id.log_In)
    }
}