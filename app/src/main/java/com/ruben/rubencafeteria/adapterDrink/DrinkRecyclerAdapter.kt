package com.ruben.rubencafeteria.adapterDrink

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ruben.rubencafeteria.DrinkRecycler
import com.ruben.rubencafeteria.R

class DrinkRecyclerAdapter (private val DrinkRecyclerList:List<DrinkRecycler>): RecyclerView.Adapter<DrinkRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinkRecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DrinkRecyclerViewHolder(layoutInflater.inflate(R.layout.item_drink_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: DrinkRecyclerViewHolder, position: Int) {
        val item = DrinkRecyclerList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = DrinkRecyclerList.size
}