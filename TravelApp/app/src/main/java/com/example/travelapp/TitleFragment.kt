package com.example.travelapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.travelapp.databinding.FragmentTitleBinding


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

        return binding.root
    }


}
