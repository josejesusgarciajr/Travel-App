package jwest.android_class.travel_app


import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import jwest.android_class.travel_app.databinding.FragmentRegistrationPartTwoBinding
import jwest.android_class.travel_app.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.main.fragment_log__in.view.*

/**
 * A simple [Fragment] subclass.
 */
class RegistrationPartTwoFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationPartTwoBinding
    private lateinit var ref: DatabaseReference
    private var USER = "username"
    private var PASS = "password"

    private lateinit var username: String
    private lateinit var password: String

//    fun  newInstance(user: String, pass: String) : RegistrationPartTwoFragment {
//        var rfpt : RegistrationPartTwoFragment = RegistrationPartTwoFragment()
//        var args: Bundle = Bundle()
//        args.putString(USER, user)
//        args.putString(PASS, pass)
//        rfpt.setArguments(args)
//        return rfpt
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentRegistrationPartTwoBinding>(inflater,
            R.layout.fragment_registration_part_two,container,false)
        // Bind this fragment class to the layout
        binding.registrationPartTwoFragment = this

        // CONNECT TO FIREBASE DATABASE
        ref = FirebaseDatabase.getInstance().getReference("members")

        // GET THE USERNAME & PASSWORD FROM REGISTRATION FRAGMENT

        //val args = RegistrationPartTwoFragmentArgs.fromBundle(arguments!!)
//        username = args.argsUsername
//        password = args.argsPassword

//        Log.d("USERNAME_FROM_FP2", username)
//        Log.d("PASSWORD_FROM_FP2", password)

        binding.RegTwoBtnSubmit.setOnClickListener { view: View? ->
            registerUser()
        }

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun getCoordinates() : Coordinates {
        var geocoder: Geocoder = Geocoder(context)
        var homeTown: String = binding.HomeTown.text.toString()

        var a: MutableList<Address>? = geocoder.getFromLocationName(homeTown, 1)
        var c: Coordinates = Coordinates(a!!.get(0).latitude, a!!.get(0).longitude)
        return  c
    }

    private fun registerUser() {
        //        // ADDING
        val memberID : String = ref.push().key!!

        val c : Coordinates = getCoordinates()
        val s : String = "lat: " + c.lat.toString() +  " lng: " + c.lng.toString()
        Log.d("COORDINATES", s)

//        var fName: String = binding.FirstName.text.toString()
//        var lName: String = binding.LastName.text.toString()
//        var age: Int = binding.Age.text.toString().toInt()
//
//        val member : Member = Member(memberID, fName, lName, age, c, username, password)

//        ref.child(memberID).setValue(member).addOnCompleteListener {
//            Toast.makeText(context, "You are now Registerd!", Toast.LENGTH_LONG).show()
//        }
    }


}
