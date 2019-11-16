package j.edu.travel_app

import android.app.Activity
import android.content.Context
import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import android.widget.TextView
import android.view.LayoutInflater


class CustomMarker(var context: Context) : GoogleMap.InfoWindowAdapter {
    lateinit var inflater: LayoutInflater
    lateinit var view: View
    lateinit var viewName: TextView
    lateinit var viewLocation: TextView

    override fun getInfoContents(marker: Marker): View {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        view = inflater.inflate(R.layout.custom_marker, null)
        viewName = view.findViewById(R.id.header)

        viewName.setText(marker.title.toString())

        viewLocation = view.findViewById(R.id.body)

        viewLocation.setText(marker.snippet)

        return view
    }

    override fun getInfoWindow(marker: Marker): View? {
        return null
    }
}