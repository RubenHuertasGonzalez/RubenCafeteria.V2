package com.ruben.rubencafeteria.adapterFood

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ruben.rubencafeteria.FoodRecycler
import com.ruben.rubencafeteria.R

class FoodRecyclerAdapter (private val FoodRecyclerList:List<FoodRecycler>): RecyclerView.Adapter<FoodRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodRecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FoodRecyclerViewHolder(layoutInflater.inflate(R.layout.item_food_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: FoodRecyclerViewHolder, position: Int) {
        val item = FoodRecyclerList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = FoodRecyclerList.size
}