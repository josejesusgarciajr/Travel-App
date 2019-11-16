package j.edu.travel_app

import android.app.Activity
import android.content.Context
import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import android.R
import android.widget.TextView
import android.view.LayoutInflater



class CustomInfo(var context: Context) : GoogleMap.InfoWindowAdapter {

    override fun getInfoContents(marker: Marker): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.custom_marker, null)
        val windowInfo = view.findViewById(R.id.window1) as TextView
        return view
    }

    override fun getInfoWindow(marker: Marker): View? {
        return null
    }
}