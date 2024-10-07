package com.example.greenguest.view.fragments.forget_password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.greenguest.R
import com.example.greenguest.databinding.FragmentEmailVerificationBinding

class EmailVerification : Fragment() {
    private lateinit var binding: FragmentEmailVerificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmailVerificationBinding.inflate(inflater, container, false)
        binding.sendLinkButton.setOnClickListener {
            findNavController().navigate(R.id.action_emailVerification_to_newPassword)
        }
        binding.back.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root

    }
}