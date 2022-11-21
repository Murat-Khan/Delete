package com.murat.helloapp

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.murat.helloapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
   lateinit var binding : FragmentDetailBinding

   lateinit var navArgs: DetailFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            navArgs = DetailFragmentArgs.fromBundle(it)
            binding.detailName.text = navArgs.murat.userName
            Glide.with(binding.chatImage).load(navArgs.murat.avatar).into(binding.chatImage)

        }

        binding.btnBack.setOnClickListener {
            findNavController().navigate(DetailFragmentDirections.actionDetailFragmentToMainFragment())
        }

        binding.frMenu.setOnClickListener {
            findNavController().navigate(DetailFragmentDirections.actionDetailFragmentToMenuFragment())
        }


    }



}