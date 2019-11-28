package com.example.travelapp


import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.travelapp.databinding.FragmentTitleBinding
import android.widget.Toast
import android.content.DialogInterface
import kotlinx.android.synthetic.main.dialog_window.*
import kotlinx.android.synthetic.main.fragment_title.*


class TitleFragment : Fragment() {
    private lateinit var binding: FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {


        binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)
        // Bind this fragment class to the layout
        binding.title = this

        // Set the onClickListener for the submitButton
        binding.titleToMapButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_mapFragment)
        }

        binding.userDialogButton.setOnClickListener{onClickShowAlert(it)}

        return binding.root
    }

    fun onClickShowAlert(view: View) {
        binding.apply {
            val builder = AlertDialog.Builder(view.context)

            // Get layout inflater
            val inflater = requireActivity().layoutInflater

            // Inflate and set the layout for the dialog
            // Pass null as the parent view because its going in the dialog layout
            builder.setView(inflater.inflate(R.layout.dialog_window, null))
                // Add action buttons
                .setPositiveButton("OK")
                    { dialog, which ->

                        //var rating = ratingBar.rating
                        // User clicked OK button.
                        Toast.makeText(
                            view.context, "Pressed OK",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                .setNegativeButton("Cancel")
                    { dialog, which ->
                        dialog.cancel()
                    }
            builder.create()
            builder.show()
        }



//        myAlertBuilder.setTitle("Alert");
//        myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop:");
//
//        myAlertBuilder.setPositiveButton(
//            "OK"
//        ) { dialog, which ->
//
//            var rating = ratingBar.rating
//            // User clicked OK button.
//            Toast.makeText(
//                view.context, "Pressed OK and rating is " + rating.toString(),
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//        myAlertBuilder.setNegativeButton(
//            "Cancel"
//        ) { dialog, which ->
//            // User cancelled the dialog.
//            Toast.makeText(
//                view.context, "Pressed Cancel",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//        myAlertBuilder.show();
//    }


    }


}
