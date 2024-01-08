package com.ruben.rubencafeteria.pay

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ruben.rubencafeteria.R

class PayHolder(view: View): RecyclerView.ViewHolder(view) {

    val PayName = view.findViewById<TextView>(R.id.tvPayRecyclerTitle)
    val PayPrice = view.findViewById<TextView>(R.id.tvPayRecyclerPrice)
    val PayDescription = view.findViewById<TextView>(R.id.tvPayRecyclerDescription)
    val PayPhoto = view.findViewById<ImageView>(R.id.ivPayRecycler)


    fun render(payModel: Pay) {
        PayName.text = payModel.foodPay
        PayPrice.text = payModel.preuPay
        PayDescription.text = payModel.descriptionPay
        Glide.with(PayPhoto.context).load(payModel.imagePay).into(PayPhoto)
    }
}