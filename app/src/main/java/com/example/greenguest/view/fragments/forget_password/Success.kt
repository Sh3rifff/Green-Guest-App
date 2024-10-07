package com.example.greenguest.view.fragments.forget_password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.greenguest.R
import com.example.greenguest.databinding.FragmentSuccessBinding

class Success : Fragment() {
    private lateinit var binding: FragmentSuccessBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSuccessBinding.inflate(inflater, container, false)
        binding.continueButton.setOnClickListener {
            findNavController().navigate(R.id.action_success_to_signIn)
        }
        return binding.root
    }

}