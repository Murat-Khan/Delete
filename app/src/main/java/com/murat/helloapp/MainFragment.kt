package com.murat.helloapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper

import com.murat.helloapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
    var user = arrayListOf<UserData>()
    lateinit var adapter: UserAdapter
   lateinit var itemTouchHelper : ItemTouchHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = UserAdapter(user,this::onClick)
        binding.recycler.adapter = adapter

        itemTouchHelper = ItemTouchHelper(Swipe(adapter))
        itemTouchHelper.attachToRecyclerView(binding.recycler)

    }

    private fun loadData() {

        user.add(UserData("Дейенерис","https://gamer-mods.ru/_ld/114/11005609.jpg"))
        user.add(UserData("Джон Сноу","https://www.vladtime.ru/uploads/posts/2018-08/1533394201_maxresdefault.jpg"))
        user.add(UserData("Серсея","https://fb.ru/media/i/7/4/9/9/6/3/i/749963.jpg"))
        user.add(UserData("Сандор Клиган","https://damion.club/uploads/posts/2022-03/1647676017_1-damion-club-p-sandor-kligan-kartinki-1.jpg"))
        user.add(UserData("Санса Старк","https://cdn.igraprestol.ru/uploads/2020/01/sofi-terner-sansa-stark-igraprestol-ru.jpg"))
        user.add(UserData("Тирион Ланнистер","https://avatars.dzeninfra.ru/get-zen_doc/5298771/pub_616e33782eef0f79cfad455c_616e345a5ae8177c18821deb/scale_1200"))
    }





    private fun onClick(position:Int) {
       findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailFragment(user[position]))
    }










}




