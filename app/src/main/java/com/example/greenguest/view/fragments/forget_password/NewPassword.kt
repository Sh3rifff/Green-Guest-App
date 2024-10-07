package com.example.greenguest.view.fragments.forget_password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.greenguest.R
import com.example.greenguest.databinding.FragmentNewPasswordBinding
import com.example.greenguest.view.util.attachPasswordVisibility

class NewPassword : Fragment() {
    private lateinit var binding: FragmentNewPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewPasswordBinding.inflate(inflater, container, false)
        binding.saveButton.setOnClickListener {
            findNavController().navigate(R.id.action_newPassword_to_success)
        }
        binding.back.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.passwordVisibility.attachPasswordVisibility(binding.password)
        binding.confirmPasswordVisibility.attachPasswordVisibility(binding.passwordConfirm)

        return binding.root
    }

}