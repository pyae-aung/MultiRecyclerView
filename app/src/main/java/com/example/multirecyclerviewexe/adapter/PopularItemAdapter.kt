package com.example.multirecyclerviewexe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.multirecyclerviewexe.R
import com.example.multirecyclerviewexe.model.PopularItem
import kotlinx.android.synthetic.main.item_popular.view.*

class PopularItemAdapter(private val listPopularItem: List<PopularItem>) :
    RecyclerView.Adapter<PopularItemAdapter.PopularItemViewHolder>() {
    inner class PopularItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(popularItem: PopularItem) {
            itemView.imgPopular.setImageResource(popularItem.image)
            itemView.txtPopularItemName.text = popularItem.name
            itemView.txtPopularBrand.text = popularItem.brand
            itemView.txtPopularPrice.text = popularItem.price.toString()
            itemView.txtPopularDiscountPrice.text = popularItem.originalPrice.toString()

            if(popularItem.isNew == false) {
                itemView.txtNew.visibility = View.INVISIBLE
            }

            if(popularItem.hasDiscount == false) {
                itemView.txtDiscount.visibility = View.INVISIBLE
                itemView.txtPopularDiscountPrice.visibility = View.INVISIBLE

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)
        return PopularItemViewHolder(view)
    }

    override fun getItemCount(): Int = listPopularItem.size

    override fun onBindViewHolder(holder: PopularItemViewHolder, position: Int) {
        holder.bind(listPopularItem[position])
    }
}