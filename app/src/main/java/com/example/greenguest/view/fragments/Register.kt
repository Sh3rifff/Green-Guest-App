package com.example.greenguest.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.greenguest.R
import com.example.greenguest.databinding.FragmentRegisterBinding
import com.example.greenguest.view.util.attachPasswordVisibility

class Register : Fragment() {
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)

        binding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_register_to_signIn)
        }
        binding.signIn.setOnClickListener {
            findNavController().navigate(R.id.action_register_to_signIn)
        }
        binding.passwordVisibility.attachPasswordVisibility(binding.password)
        binding.confirmPasswordVisibility.attachPasswordVisibility(binding.passwordConfirm)
        return binding.root

    }

}