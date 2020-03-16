package com.example.multirecyclerviewexe.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multirecyclerviewexe.R
import com.example.multirecyclerviewexe.adapter.LatestArrivalAdapter
import com.example.multirecyclerviewexe.model.LatestArrival
import kotlinx.android.synthetic.main.fragment_latest_arrival.view.*

/**
 * A simple [Fragment] subclass.
 */
class LatestArrivalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_latest_arrival, container, false)

        val listLatestArrival = ArrayList<LatestArrival>()
        listLatestArrival.add(LatestArrival(R.drawable.jansport_bag, "Fresh Hip Hop\nBag", "Jansport", 200000.0))
        listLatestArrival.add(LatestArrival(R.drawable.bag, "Non-flamable\nLeather Bag", "JoJo", 350000.0))
        listLatestArrival.add(LatestArrival(R.drawable.shirt, "Smart Shirt\nFor Nerds", "H & M", 150000.0))
        listLatestArrival.add(LatestArrival(R.drawable.girljean, "Cozy\nJean", "H & M", 150000.0))
        listLatestArrival.add(LatestArrival(R.drawable.skirt, "Sweet\nSkrit", "H & M", 150000.0))
        listLatestArrival.add(LatestArrival(R.drawable.womanbag, "Gorgeous Bag\nFor Ladies", "Louis Vuitton", 150000.0))
        listLatestArrival.add(LatestArrival(R.drawable.croptop, "Sexy\nBlouse", "H & M", 150000.0))

        val latestArrivalAdapter = LatestArrivalAdapter(listLatestArrival)
        root.recyclerLatestArrival.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = latestArrivalAdapter
        }

        return root
    }

}
