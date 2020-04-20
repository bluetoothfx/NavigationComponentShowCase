package com.experiment.navigationcomponentshowcase

import android.app.PendingIntent.getActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.experiment.navigationcomponentshowcase.ui.home.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // region View Reference
        setContentView(R.layout.activity_main)

        //getting bottom navigation view reference
        val bottomNavView: BottomNavigationView = findViewById(R.id.nav_view)

        //getting reference of hosting fragment
        val navController = findNavController(R.id.nav_host_fragment)
        // endregion

        // region Configure App Bar
        // Passing each menu ID as a set of Ids because each menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        //Alternative approach to setup ActionBarWithNavController -- comment out previous 2 lines
        //setupActionBarWithNavController(navController, AppBarConfiguration(bottomNavView.menu))
        //endregion

        //region Configure bottom nav
        //setup navigation component with bottom nav
        bottomNavView.setupWithNavController(navController)
        //endregion

        //region Configure Fragment bottom navigation & support appbar handling
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.splashFragment || destination.id == R.id.loginFragment || destination.id == R.id.registrationFragment) {
                bottomNavView.visibility = View.GONE
                supportActionBar?.hide()
            } else if (destination.id == R.id.payContactFragment || destination.id == R.id.viewPeopleFragment ||
                destination.id == R.id.payContactFragment || destination.id == R.id.paymentCompleteFragment ||
                destination.id == R.id.viewDisclaimerFragment
            ) {
                bottomNavView.visibility = View.GONE
            } else {
                bottomNavView.visibility = View.VISIBLE
                supportActionBar?.show()
            }
        }
        //endregion
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp()
    }

    override fun onBackPressed() {
        var navController: NavController =
            Navigation.findNavController(this, R.id.nav_host_fragment)

        // region default implementation
        super.onBackPressed()
        // endregion

        //region 1st Implementation - with double tap exit (only when Home is visible)
        /*if (navController.currentDestination?.label != "Home")
            super.onBackPressed()
        else {

            if (doubleBackToExitPressedOnce && navController.currentDestination?.label == "Home") {
                super.onBackPressed()
                return
            }
            this.doubleBackToExitPressedOnce = true
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

            Handler().postDelayed(Runnable {
                doubleBackToExitPressedOnce = false
            }, 2000)
        }*/
        // endregion

        //region 2nd Implementation - with double tap exit (only when no more back is possible)
        /*var result: Boolean = navController.popBackStack()
        Log.v("TAG", "$result ${navController.currentDestination?.label}")
        if (!result) {
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed()
                return
            }
            this.doubleBackToExitPressedOnce = true
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

            Handler().postDelayed(Runnable {
                doubleBackToExitPressedOnce = false
            }, 2000)
        }*/
        //endregion
    }
}
