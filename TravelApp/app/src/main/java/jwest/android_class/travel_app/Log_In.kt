package jwest.android_class.travel_app


import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.tasks.Task
import com.google.firebase.database.*
import jwest.android_class.travel_app.databinding.FragmentLogInBinding
import jwest.android_class.travel_app.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.main.fragment_log__in.*

/**
 * A simple [Fragment] subclass.
 */
class Log_In : Fragment() {

    private lateinit var binding: FragmentLogInBinding
    private lateinit var ref: DatabaseReference
    private lateinit var token : SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentLogInBinding>(inflater,
            R.layout.fragment_log__in,container,false)
        // Bind this fragment class to the layout
        binding.logInFragment = this

        // GET A REFERENCE TO THE DATABASE
        ref = FirebaseDatabase.getInstance().getReference("members")

        token = binding.root.context.getSharedPreferences("user", Context.MODE_PRIVATE)

        userAlreadyLoggedIn()

        // Set the onClickListener for the submitButton
        binding.logInButton.setOnClickListener { view : View ->
            validateUser()
        }

        // SET ONCLICKLISTENER FOR Registration Button
        binding.registrationBtn.setOnClickListener{view: View? ->
            view!!.findNavController().navigate(R.id.logIn_To_Registration)
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


    private fun validateUser() : Boolean {

        var userState = false
        var username : String = binding.userName.text.toString()
        var password : String = binding.password.text.toString()

        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") // THIS METHOD RUNS ONLY IF DATA READ FAILED
            }

            override fun onDataChange(p0: DataSnapshot) {
                // THIS METHOD RUNS ONLY IF DATA IS READ SUCCESSFULLY

                if(p0!!.exists()) {

                    for(M in p0.children) {
                        Log.d("FROM FIREBASE", M.toString())
                        Log.d("KEY: ", M.key)
                        Log.d("Value: ", M.getValue().toString())
                        val member : Member? = M.getValue(Member::class.java)

                        Log.d("USER_STATE_USERNAME", member!!.username.toString())
                        Log.d("USER_STATE_PASSWORD", member!!.password.toString())
                        Log.d("USER_STATE_B_USERNAME", username)
                        Log.d("USER_STATE_B_PASSWORD", binding.password.text.toString())
                        if(member!!.username == username && member!!.password == password) {
                            // USER IS VALID: LOG THEM IN
                            userState = true
                            Log.d("USER_STATE", userState.toString())
                            view!!.findNavController().navigate(R.id.logIn_To_Google_Maps)

                            // EDITOR
                            var editor = token.edit()
                            editor.putString("loginuser", username)
                            editor.commit()
                            Log.d("EDITOR", editor.commit().toString())

                            break
                        }
                    }
                }
            }

        })
        Log.d("USER_STATE_END", userState.toString())
        return userState
    }
}
