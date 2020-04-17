package com.experiment.navigationcomponentshowcase.ui.dashboard.tabbeddesign


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.experiment.navigationcomponentshowcase.R
import kotlinx.android.synthetic.main.fragment_tabbed_layout.*

class FragmentTwo : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tabbed_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tv_fragment_name.text = "Fragment Two"
    }
}
