package jwest.android_class.travel_app


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.*
import jwest.android_class.travel_app.databinding.FragmentLogInBinding
import jwest.android_class.travel_app.databinding.FragmentRegistrationBinding
import kotlinx.android.synthetic.main.fragment_registration.*

/**
 * A simple [Fragment] subclass.
 */
class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        // BINDING
       binding = DataBindingUtil.inflate<FragmentRegistrationBinding>(inflater,
           R.layout.fragment_registration,container,false)
        // Bind this fragment class to the layout
        binding.registrationFragment = this

        // Inflate the layout for this fragment
        return binding.root
    }


}
