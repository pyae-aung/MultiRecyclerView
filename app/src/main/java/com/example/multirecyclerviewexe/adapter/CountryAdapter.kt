package com.example.multirecyclerviewexe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multirecyclerviewexe.R
import com.example.multirecyclerviewexe.model.Country
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(private val listCountry: List<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    inner class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(country: Country) {
            itemView.imgCountry.setImageResource(country.image)
            itemView.txtCountryName.text = country.countryName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int = listCountry.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(listCountry[position])
    }
}