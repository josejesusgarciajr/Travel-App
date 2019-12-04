package jwest.android_class.travel_app


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import jwest.android_class.travel_app.databinding.FragmentLandmarkBinding

/**
 * A simple [Fragment] subclass.
 */
class LandmarkFragment : Fragment() {
    private lateinit var binding: FragmentLandmarkBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentLandmarkBinding>(inflater,
            R.layout.fragment_landmark, container,false)
        // Bind this fragment class to the layout
        binding.landmarkFragment = this

        return binding.root
    }
}
