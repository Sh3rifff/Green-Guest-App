package com.example.greenguest.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.greenguest.R
import com.example.greenguest.databinding.FragmentHomePageBinding
import com.example.greenguest.model.Tip
import com.example.greenguest.recyclerviews.CustomScrollListener
import com.example.greenguest.recyclerviews.adapters.TipAdapter

class HomePage : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    private var tipList = emptyList<Tip>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
        //example items
        tipList = listItems()

        val snapHelper = LinearSnapHelper()
        val linearLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        snapHelper.attachToRecyclerView(binding.tipRecycler)
        binding.tipRecycler.layoutManager = linearLayoutManager
        binding.tipRecycler.adapter = TipAdapter(tipList)
        binding.tipRecycler.addOnScrollListener(
            CustomScrollListener(
                itemList = listOf(
                    binding.item1,
                    binding.item2,
                    binding.item3,
                    binding.item4
                ),
                context = requireContext(),
                linearLayoutManager
            )
        )
        return binding.root
    }
}
private fun listItems(): List<Tip> {
    val list = mutableListOf<Tip>()
    list.add(Tip("Bağdan bazara", "Aqroturizmin yerli  fermerlərə dəstəyi", R.drawable.img_cow))
    list.add(Tip("Bağdan bazara", "Aqroturizmin yerli  fermerlərə dəstəyi", R.drawable.img_cow))
    list.add(Tip("Bağdan bazara", "Aqroturizmin yerli  fermerlərə dəstəyi", R.drawable.img_cow))
    list.add(Tip("Bağdan bazara", "Aqroturizmin yerli  fermerlərə dəstəyi", R.drawable.img_cow))
    return list
}