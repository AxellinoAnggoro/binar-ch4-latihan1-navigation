package com.axellinoanggoro.ch4_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.axellinoanggoro.ch4_navigation.databinding.FragmentDuaBinding
import com.axellinoanggoro.ch4_navigation.databinding.FragmentSatuBinding

class FragmentDua : Fragment() {

    lateinit var binding: FragmentDuaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDuaBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnDua.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentDua_to_fragmentTiga)
        }
    }

}