package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.LoginAndRegister

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.Constants.isEmailValid
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.HomeActivity
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentLoginScreenBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


class LoginScreen : Fragment() {

    private lateinit var binding: FragmentLoginScreenBinding

    private lateinit var auth: FirebaseAuth
    private var firebaseUser: FirebaseUser? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginScreenBinding.inflate(layoutInflater, container, false)

        // Initializing Auth variable
        auth = FirebaseAuth.getInstance()
        firebaseUser = FirebaseAuth.getInstance().currentUser

        // check if the user is Login or not
        if (firebaseUser != null) {
            startActivity(Intent(context?.applicationContext, HomeActivity::class.java))
        }

        // navigate user to Registration Screen
        binding.tvSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_loginScreen_to_registerScreen)
        }

        // Sign in user

        binding.btnSignIn.setOnClickListener {

            if (validateCredentials()) {
                val email = binding.etEmail.text.toString()
                val password = binding.etPass.text.toString()
                signInUser(email, password)
            } else {
                Toast.makeText(
                    context?.applicationContext,
                    "Invalid Credentials",
                    Toast.LENGTH_LONG
                ).show()
            }
        }


        return binding.root
    }

    // function to Sign in your account
    private fun signInUser(email: String, password: String) {

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {

                if (it.isSuccessful) {
                    binding.etEmail.setText("")
                    binding.etPass.setText("")
                    startActivity(Intent(context?.applicationContext, HomeActivity::class.java))
                } else {
                    Toast.makeText(
                        context?.applicationContext,
                        "Some thing went wrong ",
                        Toast.LENGTH_LONG
                    ).show()
                }

            }
    }

    // function to check valid Credentials
    private fun validateCredentials(): Boolean {

        if (binding.etEmail.text?.isEmpty() == true) {
            binding.etEmail.error = "Please Enter Your mail"
            return false
        }
        if (binding.etPass.text?.isEmpty() == true) {
            binding.etPass.error = "Please Enter Your Password "
            return false
        }
        if (!isEmailValid(binding.etEmail.text.toString())) {
            binding.etEmail.error = "Please Enter a Valid Mail !"
            return false
        }
        return true
    }


}