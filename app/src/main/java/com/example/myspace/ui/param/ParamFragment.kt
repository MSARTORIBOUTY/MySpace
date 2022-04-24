package com.example.myspace.ui.param

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myspace.R
import com.example.myspace.databinding.FragmentParamBinding

class ParamFragment : Fragment() {
    private lateinit var binding: FragmentParamBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentParamBinding.inflate(layoutInflater)
        (activity as AppCompatActivity).supportActionBar?.title = "Paramètres"
        return binding.root
    }

    // What we do once the fragment is created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // When the button is clicked, the user is returned to home
        binding.returnBtn.setOnClickListener {
            findNavController().navigate(R.id.action_nav_setting_to_nav_home)
        }
    }
}