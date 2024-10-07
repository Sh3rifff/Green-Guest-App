package com.example.greenguest.view.fragments.onboarding.frame_bottom.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.greenguest.R
import com.example.greenguest.databinding.FragmentSecondBottomBinding

class SecondScreenBottom : Fragment() {
    private lateinit var binding: FragmentSecondBottomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBottomBinding.inflate(inflater, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPagerBottom)

        binding.nextButton.setOnClickListener {
            viewPager?.currentItem = 2
        }

        binding.skipButton.setOnClickListener {
            findNavController().navigate(R.id.action_viewPager_to_signIn)
        }


        return binding.root
    }
}