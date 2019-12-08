package jwest.android_class.travel_app


import android.app.AlertDialog
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
import kotlinx.android.synthetic.main.dialog_window.view.ratingBar
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

        binding.rateButton.setOnClickListener{userRating(it)}

        binding.landmarkDeleteButton.setOnClickListener{ deleteLandmark(args.landmarkId) }
        binding.landmarkEditButton.setOnClickListener{ view?.findNavController()?.navigate(LandmarkFragmentDirections.actionLandmarkFragmentToEditLandmarkFragment(args.landmarkId, args.landmarkTitle, args.landmarkDescription, args.landmarkRating)) }
        return binding.root
    }

    fun userRating(view: View) {
        binding.apply {
            val builder = AlertDialog.Builder(view.context)

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


                    var rating = dialogView.ratingBar.rating

//                    // User clicked OK button.
//                    Toast.makeText(
//                        view.context, "Pressed OK " + rating.toString(),
//                        Toast.LENGTH_SHORT
//                    ).show()

                    var args = LandmarkFragmentArgs.fromBundle(arguments!!)
                    // Take the average and show the new current rating
                    landmarkRatingInput.rating = (landmarkRatingInput.rating + rating)/2

                    // Needs to be implemented
                    //editLandmark()


                }
                .setNegativeButton("Cancel")
                { dialog, which ->
                    dialog.cancel()
                }
            builder.create()
            builder.show()
        }
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
