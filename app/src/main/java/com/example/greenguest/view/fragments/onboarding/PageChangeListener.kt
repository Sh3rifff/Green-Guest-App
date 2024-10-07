package com.example.greenguest.view.fragments.onboarding

import androidx.viewpager2.widget.ViewPager2

class PageChangeListener(private val viewPager: ViewPager2) : ViewPager2.OnPageChangeCallback() {
    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        viewPager.currentItem = position
    }
}