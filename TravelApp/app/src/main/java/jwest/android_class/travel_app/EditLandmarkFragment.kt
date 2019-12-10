package jwest.android_class.travel_app

import android.content.Context
import android.content.SharedPreferences
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
import jwest.android_class.travel_app.databinding.FragmentEditLandmarkBinding
import kotlin.math.roundToInt

/**
 * A simple [Fragment] subclass.
 */
class EditLandmarkFragment : Fragment() {
    private lateinit var binding: FragmentEditLandmarkBinding
    private lateinit var ref: DatabaseReference
    private lateinit var token : SharedPreferences
    private lateinit var memberReference: DatabaseReference


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentEditLandmarkBinding>(inflater,
            R.layout.fragment_edit_landmark, container,false)
        // Bind this fragment class to the layout
        binding.editLandmarkFragment = this
        // Inflate the layout for this fragment
        val args = EditLandmarkFragmentArgs.fromBundle(arguments!!)

        binding.landmarkTitleInput.setText(args.landmarkTitle)
        binding.landmarkDescriptionInput.setText(args.landmarkDescription)

        token = binding.root.context.getSharedPreferences("user", Context.MODE_PRIVATE)

        binding.editLandmarkSubmit.setOnClickListener { editLandmark(args.landmarkId.toString(), args.landmarkRating, args.landmarkAuthorName) }
        return binding.root
    }

    private fun editLandmark(landmarkId : String, landmarkRating : Float, landmarkAuthorName : String) {
        ref = FirebaseDatabase.getInstance().getReference("landmarks")
        var landmark = ref.child(landmarkId)
        landmark.child("title").setValue(binding.landmarkTitleInput.text.toString())
        landmark.child("description").setValue(binding.landmarkDescriptionInput.text.toString())

        var loggedInUserId =  token.all["userID"].toString()

//        memberReference = FirebaseDatabase.getInstance().getReference("members")
//        var landmarkAuthor = memberReference.child(landmark.child("authorId").toString())

        view?.findNavController()?.navigate(EditLandmarkFragmentDirections.actionEditLandmarkFragmentToLandmarkFragment(binding.landmarkTitleInput.text.toString(), binding.landmarkDescriptionInput.text.toString(), landmarkRating, landmarkId, loggedInUserId,landmarkAuthorName))
    }
}
