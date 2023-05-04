package com.example.myapplication2

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class Explore : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_explore, container, false)

        val people = explore_people()
        val work = explore_work()
        val community = explore_community()

        val navigation : BottomNavigationView = view.findViewById(R.id.exploreTopNav)

        val ft : FragmentTransaction = childFragmentManager.beginTransaction()
        ft.replace(R.id.exploreMainContainer, people).commit()

        navigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when(item.itemId){
                R.id.people -> {
                    val ft1 : FragmentTransaction = childFragmentManager.beginTransaction()
                    ft1.replace(R.id.exploreMainContainer, people).commit()
                    DrawableCompat.setTint(R.id.people.toDrawable(), ContextCompat.getColor(requireContext(), R.color.theme_logo_grey) )
                    return@OnItemSelectedListener true
                }
                R.id.work -> {
                    val ft2 : FragmentTransaction = childFragmentManager.beginTransaction()
                    ft2.replace(R.id.exploreMainContainer, work).commit()
                    return@OnItemSelectedListener true
                }
                R.id.community -> {
                    val ft3 : FragmentTransaction = childFragmentManager.beginTransaction()
                    ft3.replace(R.id.exploreMainContainer, community).commit()
                    return@OnItemSelectedListener true
                }
            }
            false
        })

        return view
    }

}