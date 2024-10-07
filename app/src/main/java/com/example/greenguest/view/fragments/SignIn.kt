package com.example.greenguest.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.greenguest.R
import com.example.greenguest.databinding.FragmentSignInBinding
import com.example.greenguest.view.util.attachPasswordVisibility

class SignIn : Fragment() {
    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(inflater, container, false)

        binding.signInButton.setOnClickListener {
            findNavController().navigate(R.id.action_signIn_to_homePage)
        }
        binding.forgetPwd.setOnClickListener {
            findNavController().navigate(R.id.action_signIn_to_emailVerification)
        }
        binding.register.setOnClickListener {
            findNavController().navigate(R.id.action_signIn_to_register)
        }
        binding.passwordVisibility.attachPasswordVisibility(binding.password)


        return binding.root
    }
}