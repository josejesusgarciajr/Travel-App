package jwest.android_class.travel_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import jwest.android_class.travel_app.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)
        // Bind this fragment class to the layout
        binding.titleFragment = this

        // Set the onClickListener for the submitButton
        binding.titleToMapButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_mapFragment)
        }

        binding.titleToReviewButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_reviewFragment)
        }
        return binding.root
    }
}
