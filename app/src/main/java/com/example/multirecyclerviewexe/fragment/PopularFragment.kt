package com.example.multirecyclerviewexe.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multirecyclerviewexe.R
import com.example.multirecyclerviewexe.adapter.PopularItemAdapter
import com.example.multirecyclerviewexe.model.PopularItem
import kotlinx.android.synthetic.main.fragment_popular.view.*
import kotlinx.android.synthetic.main.item_popular.view.*

/**
 * A simple [Fragment] subclass.
 */
class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_popular, container, false)// Inflate the layout for this fragment

        val listPopularItem = ArrayList<PopularItem>()
        listPopularItem.add(PopularItem(R.drawable.bag, "Super Bag", "Gucci", 7500000.0, 9800000.0, false, true))
        listPopularItem.add(PopularItem(R.drawable.iphone_eleven, "Iphone 11", "Apple", 1130000.0, 9800000.0, true, false))
        listPopularItem.add(PopularItem(R.drawable.nitendo_switch, "Switch Console", "Nintendo", 15130000.0, 9800000.0, false, true))
        listPopularItem.add(PopularItem(R.drawable.shirt, "Cool Shirt", "Hazard", 6600000.0, 9200000.0, false, false))
        listPopularItem.add(PopularItem(R.drawable.jansport_bag, "Super Bag", "Jansport", 670000.0, 9100000.0, true, false))
        listPopularItem.add(PopularItem(R.drawable.chair, "Supernatural Chair", "Don't Know", 2200000.0, 1110000.0, false, true))

        val popularItemAdapter = PopularItemAdapter(listPopularItem)
        root.recyclerPopular.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = popularItemAdapter
        }



        return root
    }

}
