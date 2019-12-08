package jwest.android_class.travel_app


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import jwest.android_class.travel_app.databinding.FragmentLandmarkBinding
import android.graphics.PorterDuff
import android.graphics.drawable.LayerDrawable
import android.graphics.Color
import android.util.Log
import android.widget.RatingBar
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.fragment_edit_landmark.*


/**
 * A simple [Fragment] subclass.
 */
class LandmarkFragment : Fragment() {
    private lateinit var binding: FragmentLandmarkBinding
    private lateinit var ref: DatabaseReference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentLandmarkBinding>(inflater,
            R.layout.fragment_landmark, container,false)
        // Bind this fragment class to the layout
        binding.landmarkFragment = this

        val args = LandmarkFragmentArgs.fromBundle(arguments!!)
        binding.landmarkTitleText.text = args.landmarkTitle
        binding.landmarkDescriptionText.text = args.landmarkDescription

        val ratingBar = binding.landmarkRatingInput as RatingBar
        ratingBar.rating = args.landmarkRating

        binding.landmarkDeleteButton.setOnClickListener{ deleteLandmark(args.landmarkId) }
        binding.landmarkEditButton.setOnClickListener{ view?.findNavController()?.navigate(LandmarkFragmentDirections.actionLandmarkFragmentToEditLandmarkFragment(args.landmarkId, args.landmarkTitle, args.landmarkDescription, args.landmarkRating)) }
        return binding.root
    }

    private fun deleteLandmark(landmarkId : String) {
        ref = FirebaseDatabase.getInstance().getReference("landmarks")
        var landmark = ref.child(landmarkId)
        landmark.removeValue()
        Log.d("delete : ", landmarkId)
        view?.findNavController()?.navigate(R.id.action_landmarkFragment_to_mapFragment)
    }

//    private fun editLandmark() {
//        view?.findNavController()?.navigate(LandmarkFragmentDirections.actionLandmarkFragmentToEditLandmarkFragment)
//    }
}
