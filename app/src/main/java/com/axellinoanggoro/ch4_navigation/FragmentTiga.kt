package com.axellinoanggoro.ch4_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.axellinoanggoro.ch4_navigation.databinding.FragmentTigaBinding

class FragmentTiga : Fragment() {
    lateinit var binding: FragmentTigaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTigaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}