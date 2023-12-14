package com.ruben.rubencafeteria.adapterDrink

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ruben.rubencafeteria.DrinkRecycler
import com.ruben.rubencafeteria.R

class DrinkRecyclerViewHolder(view : View):RecyclerView.ViewHolder(view){

    val drinkRecyclerTitle = view.findViewById<TextView>(R.id.tvDrinkRecyclerTitle)
    val drinkRecyclerDescription = view.findViewById<TextView>(R.id.tvDrinkRecyclerDescription)
    val drinkRecyclerPrice = view.findViewById<TextView>(R.id.tvDrinkRecyclerPrice)
    val drinkRecyclerPhoto = view.findViewById<ImageView>(R.id.ivDrinkRecycler)

    fun render(drinkRecyclerModel: DrinkRecycler){
        drinkRecyclerTitle.text = drinkRecyclerModel.title
        drinkRecyclerDescription.text = drinkRecyclerModel.description
        drinkRecyclerPrice.text = drinkRecyclerModel.price
        Glide.with(drinkRecyclerPhoto.context).load(drinkRecyclerModel.photo).into(drinkRecyclerPhoto)

    }
}