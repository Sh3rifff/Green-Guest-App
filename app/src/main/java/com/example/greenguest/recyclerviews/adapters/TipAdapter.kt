package com.example.greenguest.recyclerviews.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.greenguest.databinding.TipRecyclerItemBinding
import com.example.greenguest.model.Tip

class TipAdapter(private val clueList: List<Tip>) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {
    class TipViewHolder(val binding: TipRecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        return TipViewHolder(TipRecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return clueList.size
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = clueList[position]
        holder.binding.title.text = tip.title
        holder.binding.description.text = tip.description
        holder.binding.image.setImageResource(tip.image)
    }
}