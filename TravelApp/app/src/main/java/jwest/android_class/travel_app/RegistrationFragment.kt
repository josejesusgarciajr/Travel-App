package jwest.android_class.travel_app


import android.content.Context
import android.net.nsd.NsdManager
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.*
import androidx.navigation.findNavController
import jwest.android_class.travel_app.databinding.FragmentLogInBinding
import jwest.android_class.travel_app.databinding.FragmentRegistrationBinding
import kotlinx.android.synthetic.main.fragment_registration.*

/**
 * A simple [Fragment] subclass.
 */
class RegistrationFragment : Fragment() {

    private var listener: RegistrationListener? = null

    public interface RegistrationListener {
        fun onInputASent(input: CharSequence) {

        }
    }

    private lateinit var binding: FragmentRegistrationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        // BINDING
       binding = DataBindingUtil.inflate<FragmentRegistrationBinding>(inflater,
           R.layout.fragment_registration,container,false)
        // Bind this fragment class to the layout
        binding.registrationFragment = this

        binding.registrationBtnToUserInfo.setOnClickListener { view: View? ->
//            var user : CharSequence = binding.registrationUserName.text
//            listener!!.onInputASent(user)
            view!!.findNavController().navigate(R.id.registration_To_RegistrationPartTwo)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if(context is RegistrationListener) {
            listener = context
        } else {
            Log.d("IMPLEMENT...", "FRAGMENT A LISTENER")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


}
