package jwest.android_class.travel_app
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.MarkerOptions

class Group {

    val group = mutableListOf<Member>();

    fun addMember(member : Member) {
        group.add(member);
    }

    fun removeMember(member : Member) {
        group.remove(member)
    }

    fun dispalyMembers(mMap : GoogleMap) {
        for(member: Member in group) {
            mMap.addMarker(MarkerOptions().position(member.LatLng()).title(member.getFullName()))
        }
    }
}