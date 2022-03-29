package com.example.myspace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myspace.databinding.FragmentParamBinding

class ParamFragment : Fragment() {
    private lateinit var binding: FragmentParamBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentParamBinding.inflate(layoutInflater)
        return binding.root
        //return inflater.inflate(R.layout.fragment_main, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.returnBtn.setOnClickListener {
            findNavController().navigate(R.id.action_paramFragment_to_mainFragment)
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