package com.ruben.rubencafeteria.adapterFood

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ruben.rubencafeteria.FoodRecycler
import com.ruben.rubencafeteria.R

class FoodRecyclerViewHolder(view : View):RecyclerView.ViewHolder(view){

    val foodRecyclerTitle = view.findViewById<TextView>(R.id.tvFoodRecyclerTitle)
    val foodRecyclerDescription = view.findViewById<TextView>(R.id.tvFoodRecyclerDescription)
    val foodRecyclerPrice = view.findViewById<TextView>(R.id.tvFoodRecyclerPrice)
    val foodRecyclerPhoto = view.findViewById<ImageView>(R.id.ivFoodRecycler)

    fun render(foodRecyclerModel: FoodRecycler){
        foodRecyclerTitle.text = foodRecyclerModel.title
        foodRecyclerDescription.text = foodRecyclerModel.description
        foodRecyclerPrice.text = foodRecyclerModel.price
        Glide.with(foodRecyclerPhoto.context).load(foodRecyclerModel.photo).into(foodRecyclerPhoto)

    }
}