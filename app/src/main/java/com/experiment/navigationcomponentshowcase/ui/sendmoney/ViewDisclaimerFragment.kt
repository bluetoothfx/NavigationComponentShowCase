package com.experiment.navigationcomponentshowcase.ui.sendmoney

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.experiment.navigationcomponentshowcase.R
import kotlinx.android.synthetic.main.fragment_view_disclaimer.*

class ViewDisclaimerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_view_disclaimer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        disclaimer_text.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce iaculis ligula lectus, efficitur luctus arcu mattis eget. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Aliquam vel fringilla purus, vel tincidunt dui. Etiam congue rutrum lacus sed bibendum. Nam sed ornare risus. Ut facilisis odio eu elit malesuada tristique. Curabitur varius tristique tellus ut ultrices. Phasellus at lorem eu velit ultrices pharetra non eu ligula. Duis auctor purus sem, quis iaculis ipsum dignissim sed."
    }
}