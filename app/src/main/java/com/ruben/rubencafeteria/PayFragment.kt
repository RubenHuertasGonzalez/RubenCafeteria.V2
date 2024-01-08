package com.ruben.rubencafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.ruben.rubencafeteria.databinding.FragmentPayBinding
import com.ruben.rubencafeteria.pay.PayAdapter
import com.ruben.rubencafeteria.pay.PayProvider

class PayFragment : Fragment() {

    private lateinit var binding: FragmentPayBinding

    val combinedList: MutableList<Any> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPayBinding.inflate(inflater)
        initRecyclerView()
        return binding.root
    }

    fun initRecyclerView() {
        val manager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, manager.orientation)
        val recyclerView = binding.recyclerPay
        recyclerView.layoutManager = manager
        recyclerView.adapter = PayAdapter(PayProvider.payList)
        binding.recyclerPay.addItemDecoration(decoration)

    }
}