package com.example.notesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.notesapp.databinding.FragmentStarteBinding


class StarteFragment : Fragment() {

    lateinit var binding: FragmentStarteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentStarteBinding.inflate(inflater,container,false)

        binding.btn.setOnClickListener {

            findNavController().navigate(R.id.action_starteFragment_to_writenotesFragment)

        }


        return binding.root
    }


}