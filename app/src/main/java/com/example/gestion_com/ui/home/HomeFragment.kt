package com.example.gestion_com.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.gestion_com.R
import com.example.gestion_com.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }
    override fun onResume() {
        super.onResume()
        setUpViews()
    }

      fun setUpViews() {
        binding.lifecycleOwner = viewLifecycleOwner
//        binding.viewModel = HomeViewModel
        binding.catalogueCard.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_nav_home_to_nav_catalogue, null
            )
        )
        binding.commandesCard.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_nav_home_to_nav_commande,
                null
            )
        )
        binding.clientCard.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_nav_home_to_nav_client,
                null
            )
        )
        binding.organismeCard.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_nav_home_to_nav_organisme,
                null
            )
        )

    }


}