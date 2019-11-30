package jwest.android_class.travel_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil

import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import jwest.android_class.travel_app.databinding.ActivityMainBinding
import androidx.databinding.adapters.NumberPickerBindingAdapter.setValue
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase



class MainActivity : AppCompatActivity() {


    private lateinit var drawerLayout: DrawerLayout
    private lateinit var ref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout
        //getting a navController object
        val navController = this.findNavController(R.id.myNavHostFragment)

        //links navigation controller to the app bar
        NavigationUI.setupActionBarWithNavController(this, navController)
        NavigationUI.setupWithNavController(binding.navView, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        Log.d("here", " main activity")


        // THIS IS SUPPOSE TO GET A CONNECTION TO FIREBASE
        ref = FirebaseDatabase.getInstance().getReference("members")

        Log.d("FIREBASE_REF", ref.database.getReference().toString())
    }
    //override this method to tell Android to call navigateUp() in the navigation controller when
    //up button is pressed
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}

