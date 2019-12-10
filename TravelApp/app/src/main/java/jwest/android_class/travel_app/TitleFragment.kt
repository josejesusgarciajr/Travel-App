package jwest.android_class.travel_app

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.firebase.database.*
import jwest.android_class.travel_app.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding
    private lateinit var token : SharedPreferences
    private lateinit var ref: DatabaseReference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)
        // Bind this fragment class to the layout
        binding.titleFragment = this


        token = binding.root.context.getSharedPreferences("user", Context.MODE_PRIVATE)

        ref = FirebaseDatabase.getInstance().getReference("members")

        var checkLoggedIn =  token.all["loginuser"].toString()

//        userAlreadyLoggedIn()
//        binding.loginButton.setOnClickListener { view : View ->
//            view.findNavController().navigate(R.id.log_In)
//        }
//
//        binding.registerButton.setOnClickListener { view : View ->
//            view.findNavController().navigate(R.id.registrationFragment)
//        }
//        Log.d("noonelogged", "in")

        if(checkLoggedIn == " ") {
            binding.mapButton.isVisible = false
            binding.registerButton.isVisible = true
            binding.loginButton.isVisible = true
            // Set the onClickListener for the submitButton
            binding.loginButton.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.log_In)
            }

            binding.registerButton.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.registrationFragment)
            }
            Log.d("noonelogged", "in")
        }
        else{
            binding.registerButton.isVisible = false
            binding.loginButton.isVisible = false
            binding.mapButton.isVisible = true
            Log.d("someoneloggedin", "!")
            binding.mapButton.setOnClickListener{ view : View ->
                view.findNavController().navigate(R.id.mapFragment)
            }
//            view?.findNavController()?.navigate(R.id.mapFragment)
        }

        return binding.root
    }

    private fun userAlreadyLoggedIn() {

        var username : String = token.getString("loginuser", " ").toString()
        Log.d("USERNAME FROM TOKEN", username)
        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") // THIS METHOD RUNS ONLY IF DATA READ FAILED
            }

            override fun onDataChange(p0: DataSnapshot) {
                // THIS METHOD RUNS ONLY IF DATA IS READ SUCCESSFULLY

                if(p0!!.exists()) {

                    for(M in p0.children) {

                        val member : Member? = M.getValue(Member::class.java)

                        if(member!!.username == username) {
                            // USER IS VALID: LOG THEM IN
                            Log.d("USER LOGG IN!", "USER LOGGED IN")
                            view!!.findNavController().navigate(R.id.mapFragment)
                            break
                        }
                    }
                }
            }

        })
    }
}
