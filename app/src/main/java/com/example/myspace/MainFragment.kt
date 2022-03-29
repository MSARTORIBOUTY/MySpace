package com.example.myspace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myspace.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
        //return inflater.inflate(R.layout.fragment_main, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.params.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_paramFragment)
        }
//        binding.message.setOnClickListener { showAlertDialog() }
//        binding.cloche.setOnClickListener { Toast.makeText(
//            this.getActivity(),
//            "Pas de nouvelles notifications",
//            Toast.LENGTH_LONG
//        ).show() }
//        binding.plusBtn.setOnClickListener {
//            findNavController().navigate(R.id.mainFragment2)
//        }
    }


}