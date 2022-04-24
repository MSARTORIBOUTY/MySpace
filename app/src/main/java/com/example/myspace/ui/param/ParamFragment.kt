package com.example.myspace.ui.param

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myspace.R
import com.example.myspace.databinding.FragmentGalleryBinding
import com.example.myspace.databinding.FragmentParamBinding
import com.example.myspace.ui.gallery.GalleryViewModel

class ParamFragment : Fragment() {
    private var _binding: FragmentParamBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val paramViewModel =
            ViewModelProvider(this).get(ParamViewModel::class.java)

        _binding = FragmentParamBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.paramTitle

        paramViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}