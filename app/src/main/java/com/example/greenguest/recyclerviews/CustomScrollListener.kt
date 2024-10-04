package com.example.greenguest.recyclerviews

import android.content.Context
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greenguest.R

class CustomScrollListener(
    private val itemList: List<ImageView>,
    private val context: Context,
    private val linearLayoutManager: LinearLayoutManager
) : RecyclerView.OnScrollListener() {

    private var itemPosition: Int = 0

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
        itemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition()
        if (itemPosition != -1){
            val tipPositionList = itemList
            tipPositionList.forEach {
                it.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_tips_unfocused))
            }
            tipPositionList[itemPosition].setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_tips_focused))
        }
    }
}