package com.experiment.navigationcomponentshowcase.ui.splash

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.experiment.navigationcomponentshowcase.R


class SplashFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        Handler().postDelayed({
            context?.let {
                findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
            }
        }, 2500)

        return view
    }
}