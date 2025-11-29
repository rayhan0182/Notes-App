package com.example.notesapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.example.notesapp.databinding.FragmentWritenotesBinding
import com.example.notesapp.rm.AppDatabase
import com.example.notesapp.rm.Dao
import com.example.notesapp.rm.User


class WritenotesFragment : Fragment() {

    lateinit var binding: FragmentWritenotesBinding
    lateinit var db: AppDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentWritenotesBinding.inflate(inflater,container,false)

        db = Room.databaseBuilder(

            requireContext(), AppDatabase::class.java,"database"

        ).allowMainThreadQueries().build()

       createdbydatabase()

        return binding.root
    }

    private fun createdbydatabase() {

        with(binding){

            btnSave.setOnClickListener {

             val userdata = binding.wNotes.text.toString()

             val data = User(0,userdata)

              val base = db.database()

               base.insert(data)


                findNavController().navigate(R.id.action_writenotesFragment_to_starteFragment)

            }



        }

    }


}