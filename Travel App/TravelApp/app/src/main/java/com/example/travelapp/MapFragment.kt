package com.example.travelapp


import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.travelapp.databinding.DialogWindowBinding
import com.example.travelapp.databinding.FragmentMapBinding
import androidx.navigation.findNavController
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.dialog_window.view.*
import kotlinx.android.synthetic.main.fragment_map.*
import java.util.*


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
        savedInstanceState: Bundle?): View? {

        gGroup = Group()

        // HARD CODE JUST FOR TESTING PURPOSES
//        gGroup.addMember(Member("Jose", "Garcia", 21, Coordinates(36.1699, -115.1398)))
//        gGroup.addMember(Member("Nairbis", "Sibrian", 21, Coordinates(38.7567, -120.8607)))
//        gGroup.addMember(Member("Ruben", "Garcia", 22, Coordinates(21.1619, -86.8515)))
//        gGroup.addMember(Member("Leslie", "Garcia", 21, Coordinates(19.8968, -155.5828)))

        binding = DataBindingUtil.inflate<FragmentMapBinding>(inflater,
            R.layout.fragment_map,container,false)

        return binding.root

        //return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onMapReady(google_map: GoogleMap?) {
        google_map?. let{
            mMap = it
        }
        gGroup.dispalyMembers(mMap)

        setMapLongClick(mMap, view)

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
    private fun setMapLongClick(map: GoogleMap, view: View?) {

        map.setOnMapLongClickListener { latlong ->

            view?.findNavController()?.navigate(R.id.action_mapFragment_to_windowFragment)


//            var place = Place("Dropped Pin", Coordinates(latlong.latitude, latlong.longitude),
//                5, "Best Place Ever")
//
//            // A Snippet is Additional text that's displayed below the title.
//            val snippet = String.format(
//                Locale.getDefault(),
//                "Lat: %1$.5f, Long: %2$.5f",
//                latlong.latitude,
//                latlong.longitude
//            ) + "\nRating: " + place.rating + "\nDescription: " + place.description
//
//            map.addMarker(
//                MarkerOptions()
//                    .position(latlong)
//                    .title(place.name)
//                    .snippet(snippet)
//
//            )
        }
    }
    fun showWindow(view: View?) {
        binding.apply {
            val builder = AlertDialog.Builder(view?.context)

            // Get layout inflater
            val inflater = requireActivity().layoutInflater

            // Inflate the dialog with custom window
            val dialogView = inflater.inflate(R.layout.dialog_window, null)

            // Inflate and set the layout for the dialog
            // Pass null as the parent view because its going in the dialog layout
            builder.setView(dialogView)
                // Add action buttons
                .setPositiveButton("OK")
                { dialog, which ->

                    //val rating = ratingBar.rating.toString()
                    val rating = dialogView.ratingBar.rating.toString()

                    // User clicked OK button.
                    Toast.makeText(
                        view?.context, "Pressed OK " + rating,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .setNegativeButton("Cancel")
                { dialog, which ->
                    dialog.cancel()
                }
            builder.create()
            builder.show()
        }
    }
    override fun onInfoWindowClick(p0: Marker?) {
        Toast.makeText(
            context, "Window",
            Toast.LENGTH_SHORT
        ).show()


    }


}
