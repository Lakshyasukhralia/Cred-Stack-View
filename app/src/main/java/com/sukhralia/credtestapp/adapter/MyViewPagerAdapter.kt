package com.sukhralia.credtestapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyViewPagerAdapter(manager : FragmentManager) : FragmentPagerAdapter(manager){

    var list : ArrayList<Fragment> = ArrayList<Fragment>()

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return list[position]
    }

}