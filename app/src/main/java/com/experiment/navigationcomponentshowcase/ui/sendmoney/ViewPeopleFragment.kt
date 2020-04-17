package com.experiment.navigationcomponentshowcase.ui.sendmoney

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.experiment.navigationcomponentshowcase.R
import com.experiment.navigationcomponentshowcase.ui.sendmoney.adapter.PeopleAdapter
import kotlinx.android.synthetic.main.fragment_view_people.*

/**
 * See the project README for the equivalent Java code.
 */
class ViewPeopleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_people, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PeopleAdapter()
        adapter.setItems(PEOPLE)
        adapter.setOnItemClickedListener { name ->
             val directions = ViewPeopleFragmentDirections.actionViewPeopleFragmentToPayContactFragment(name)
             findNavController().navigate(directions)
        }
        people_recycler_view.adapter = adapter
    }

    private companion object {
        private val PEOPLE = listOf(
            "Jaleesa Callaghan",
            "Claretta Zabala",
            "Isaias Eckel",
            "Mickie Messick",
            "Delicia Escoto",
            "Gertrude Choy",
            "Cherly Solem",
            "Robert Lupi",
            "Belen Picou",
            "Tyra Chadwell",
            "Chae Cammarata",
            "Lourdes Artis",
            "Latrice Hennings",
            "Bok Arend",
            "Beth Wentworth",
            "Virgilio Bruneau",
            "Lekisha Sobel",
            "Katelynn Hathcock",
            "Jamel Meister",
            "Delsie Mosser",
            "Merideth Stickel",
            "Jermaine Goncalves",
            "Bruno Oldham",
            "Ethelene Budge",
            "Willy Wells",
            "Karol Galvin",
            "Lanell Pendley",
            "Thomas Granier",
            "Kylee Shavers",
            "Eufemia Mccully"
        )
    }
}