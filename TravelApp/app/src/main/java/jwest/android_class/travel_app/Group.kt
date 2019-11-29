package jwest.android_class.travel_app
import android.util.Log
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Group {

    val group = mutableListOf<Member>()
    val ref = FirebaseDatabase.getInstance().getReference("members")


    fun addMember(member : Member) {
        group.add(member)
    }

    fun removeMember(member : Member) {
        group.remove(member)
    }

    fun displayMembers(mMap : GoogleMap) {

        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") // THIS METHOD RUNS ONLY IF DATA READ FAILED
            }

            override fun onDataChange(p0: DataSnapshot) {
                // THIS METHOD RUNS ONLY IF DATA IS READ SUCCESSFULLY

                if(p0!!.exists()) {

                    for(M in p0.children) {
                        Log.d("FROM FIREBASE", M.toString())
                        Log.d("KEY: ", M.key)
                        Log.d("Value: ", M.getValue().toString())
                        val member = M.getValue(Member::class.java)
                        group.add(member!!)

                        val latLng : LatLng = LatLng(member.coord.lng, member.coord.lng)
                        val info = member.getFullName() + " Lat: " + member.coord.lat + " Lng: " + member.coord.lng
                        Log.d("NameLatLng", info)
                        //mMap.addMarker(MarkerOptions().position(member.LatLng()).title(member.getFullName()))
                        mMap.addMarker(MarkerOptions().position(latLng).title(member.getFullName()))
                        Log.d("GOOGLEMAPS: ", member.firstName)
                        Log.d("GROUP_SIZE_ADD?", group.size.toString())
                    }
                }
            }

        })
        Log.d("DISPLAYONGOOGLE...MAPS", "GOING TO FOR LOOP")
        Log.d("GROUP_SIZE", group.size.toString())

//        for(member: Member in group) {
//            val latLng : LatLng = LatLng(member.coord.Lng, member.coord.Lng)
//            //mMap.addMarker(MarkerOptions().position(member.LatLng()).title(member.getFullName()))
//            mMap.addMarker(MarkerOptions().position(latLng).title(member.getFullName()))
//            Log.d("GOOGLEMAPS: ", member.firstName)
//        }
    }
}