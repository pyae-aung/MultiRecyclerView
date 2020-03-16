package com.example.multirecyclerviewexe.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.multirecyclerviewexe.R
import com.example.multirecyclerviewexe.adapter.CountryAdapter
import com.example.multirecyclerviewexe.model.Country
import kotlinx.android.synthetic.main.fragment_country.view.*

/**
 * A simple [Fragment] subclass.
 */
class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(
            R.layout.fragment_country,
            container,
            false
        ) // Inflate the layout for this fragment

        val listCountry = ArrayList<Country>()
        listCountry.add(Country(R.drawable.china, "China"))
        listCountry.add(Country(R.drawable.korea, "Korea"))
        listCountry.add(Country(R.drawable.japan, "Japan"))
        listCountry.add(Country(R.drawable.world, "International"))

        val countryAdapter = CountryAdapter(listCountry)
        root.recyclerCountry.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = countryAdapter
        }

        return root
    }

}
