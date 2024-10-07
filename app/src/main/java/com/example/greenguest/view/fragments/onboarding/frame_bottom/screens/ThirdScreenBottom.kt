package com.example.greenguest.view.fragments.onboarding.frame_bottom.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.greenguest.R
import com.example.greenguest.databinding.FragmentThirdBottomBinding

class ThirdScreenBottom : Fragment() {
    private lateinit var binding: FragmentThirdBottomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBottomBinding.inflate(inflater, container, false)

        binding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_viewPager_to_register)

        }

        binding.signInButton.setOnClickListener {
            findNavController().navigate(R.id.action_viewPager_to_signIn)
        }

        return binding.root
    }
}