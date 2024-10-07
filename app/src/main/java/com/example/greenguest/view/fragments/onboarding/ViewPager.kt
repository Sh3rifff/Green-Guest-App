package com.example.greenguest.view.fragments.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.greenguest.databinding.FragmentViewPagerBinding
import com.example.greenguest.view.fragments.onboarding.frame_bottom.screens.FirstScreenBottom
import com.example.greenguest.view.fragments.onboarding.frame_bottom.screens.SecondScreenBottom
import com.example.greenguest.view.fragments.onboarding.frame_bottom.screens.ThirdScreenBottom
import com.example.greenguest.view.fragments.onboarding.frame_top.screens.FirstScreenTop
import com.example.greenguest.view.fragments.onboarding.frame_top.screens.SecondScreenTop
import com.example.greenguest.view.fragments.onboarding.frame_top.screens.ThirdScreenTop

class ViewPager : Fragment() {
    private lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val topFragmentList = arrayListOf(
            FirstScreenTop(),
            SecondScreenTop(),
            ThirdScreenTop()
        )
        val bottomFragmentList = arrayListOf(
            FirstScreenBottom(),
            SecondScreenBottom(),
            ThirdScreenBottom()
        )

        binding.viewPagerBottom.adapter = ViewPagerAdapter(
            bottomFragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPagerTop.adapter = ViewPagerAdapter(
            topFragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )


        binding.viewPagerBottom.registerOnPageChangeCallback(PageChangeListener(binding.viewPagerTop))
        binding.viewPagerTop.isUserInputEnabled = false

        binding.dotsIndicator.attachTo(binding.viewPagerBottom)

        return binding.root
    }

}