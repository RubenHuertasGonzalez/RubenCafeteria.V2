package com.ruben.rubencafeteria.pay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ruben.rubencafeteria.R

class PayAdapter(private val payList: List<Pay>) : RecyclerView.Adapter<PayHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PayHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PayHolder(layoutInflater.inflate(R.layout.item_pay_recycler, parent, false))
    }

    override fun getItemCount(): Int = payList.size

    override fun onBindViewHolder(holder: PayHolder, position: Int) {
        val item = payList[position]
        holder.render(item)
    }
}
