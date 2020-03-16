package com.example.multirecyclerviewexe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.multirecyclerviewexe.R
import com.example.multirecyclerviewexe.model.LatestArrival
import kotlinx.android.synthetic.main.item_latest_arrival.view.*

class LatestArrivalAdapter(private var listLatestArrival: List<LatestArrival>) : RecyclerView.Adapter<LatestArrivalAdapter.LatestArrivalViewHolder>() {
    inner class LatestArrivalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(latestArrival: LatestArrival) {
            itemView.imgLatestArrival.setImageResource(latestArrival.image)
            itemView.txtLatestArrivalName.text = latestArrival.name
            itemView.txtLatestArrivalBrand.text = latestArrival.brand
            itemView.txtLatestArrivalPrice.text = latestArrival.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_latest_arrival, parent, false)
        return LatestArrivalViewHolder(view)
    }

    override fun getItemCount(): Int = listLatestArrival.size

    override fun onBindViewHolder(holder: LatestArrivalViewHolder, position: Int) {
        holder.bind(listLatestArrival[position])
    }
}