package com.example.greenguest.view.util

import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageView
import com.example.greenguest.R

fun ImageView.attachPasswordVisibility(passwordEditText: EditText) {
    setOnClickListener {
        if (passwordEditText.transformationMethod != null) {
            passwordEditText.transformationMethod = null
            setImageResource(R.drawable.ic_eye_open)
        } else {
            passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
            setImageResource(R.drawable.ic_eye_closed)
        }
        passwordEditText.setSelection(passwordEditText.text.length)
    }
}