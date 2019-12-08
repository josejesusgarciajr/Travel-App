package jwest.android_class.travel_app


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import jwest.android_class.travel_app.databinding.FragmentRegistrationPartTwoBinding
import jwest.android_class.travel_app.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class RegistrationPartTwoFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationPartTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentRegistrationPartTwoBinding>(inflater,
            R.layout.fragment_registration_part_two,container,false)
        // Bind this fragment class to the layout
        binding.registrationPartTwoFragment = this

        // GET THE USERNAME FROM REGISTRATION FRAGMENT
        //var username : String =
        // GET THE PASSWORD FROM REGISTRATION FRAGMENT


        // Inflate the layout for this fragment
        return binding.root
    }


}
