package com.example.travelapp

import android.app.AlertDialog
import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.travelapp.databinding.DialogWindowBinding


class WindowFragment : Fragment() {
    private lateinit var binding: DialogWindowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<DialogWindowBinding>(inflater,
            R.layout.dialog_window,container,false)



        binding.submitButton.setOnClickListener{onClickShowAlert(it)}

        return binding.root

    }

    fun onClickShowAlert(view: View) {
        binding.apply {
            val builder = AlertDialog.Builder(view.context)

            // Get layout inflater
            val inflater = requireActivity().layoutInflater

            // Inflate and set the layout for the dialog
            // Pass null as the parent view because its going in the dialog layout
            //builder.setView(inflater.inflate(R.layout.dialog_window, null))


                var placeName = binding.placeName.text.toString()
                var rating = binding.ratingBar.rating.toString()
                var description = binding.placeDescription.text.toString()

                Toast.makeText(view.context, "Pressed OK " + rating,
                    Toast.LENGTH_SHORT).show()




                // Add action buttons
//                .setPositiveButton("OK")
//                { dialog, which ->
//
//                    //val rating = ratingBar.rating.toString()
//                    //var rating = ratingBar.rating.toString()
//                    // User clicked OK button.
//                    Toast.makeText(
//                        view.context, "Pressed OK ",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//                .setNegativeButton("Cancel")
//                { dialog, which ->
//                    dialog.cancel()
//                }
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
