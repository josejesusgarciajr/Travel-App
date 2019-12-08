package jwest.android_class.travel_app


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import jwest.android_class.travel_app.databinding.FragmentAddLandmarkBinding
import kotlin.math.roundToInt

/**
 * A simple [Fragment] subclass.
 */
class AddLandmarkFragment : Fragment() {
    private lateinit var binding: FragmentAddLandmarkBinding
    private lateinit var ref: DatabaseReference
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentAddLandmarkBinding>(inflater,
            R.layout.fragment_add_landmark, container,false)
        // Bind this fragment class to the layout
        binding.addLandmarkFragment = this
        // Inflate the layout for this fragment
        val args = AddLandmarkFragmentArgs.fromBundle(arguments!!)

        binding.addLandmarkSubmitButton.setOnClickListener { createLandmark(args.latitude, args.longitude, binding.landmarkTitleInput.text.toString(), binding.landmarkDescriptionInput.text.toString(), binding.landmarkRatingInput.rating.toString().toFloat() ) }
        return binding.root
    }

    private fun createLandmark(latitude : Float, longitude : Float, title : String, description : String, rating : Float){
        ref = FirebaseDatabase.getInstance().getReference("landmarks")
        val landmarkId : String = ref.push().key!!

        val newLandmark = Landmark(landmarkId, null, Coordinates(latitude.toDouble(), longitude.toDouble()), title, description, rating )

        ref.child(landmarkId).setValue(newLandmark).addOnCompleteListener {
            Log.d("added successfully! ", newLandmark.title)
            view?.findNavController()?.navigate(R.id.action_addLandmarkFragment_to_mapFragment)
        }

    }


}
