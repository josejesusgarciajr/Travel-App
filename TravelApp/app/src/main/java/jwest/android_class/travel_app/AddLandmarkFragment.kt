package jwest.android_class.travel_app


import android.app.AlertDialog
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
import kotlinx.android.synthetic.main.dialog_window.view.*
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


        binding.addLandmarkSubmitButton.setOnClickListener{onClickShowRating(it)}

        return binding.root
    }

    fun onClickShowRating(view: View) {
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


                    var rating = dialogView.ratingBar.rating.toString()

                    // User clicked OK button.
                    Toast.makeText(
                        view.context, "Pressed OK " + rating,
                        Toast.LENGTH_SHORT
                    ).show()

                    // Get the arguments passed into the fragment
                    val args = AddLandmarkFragmentArgs.fromBundle(arguments!!)

                    // Store landmark input in Firebase
                    createLandmark(args.latitude, args.longitude, binding.landmarkTitleInput.text.toString(), binding.landmarkDescriptionInput.text.toString(), dialogView.ratingBar.rating )
                }
                .setNegativeButton("Cancel")
                { dialog, which ->
                    dialog.cancel()
                }
            builder.create()
            builder.show()
        }
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
