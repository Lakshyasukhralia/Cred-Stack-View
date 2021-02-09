package com.sukhralia.credtestapp

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.sukhralia.credtestapp.adapter.MyViewPagerAdapter
import com.sukhralia.credtestapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )

        val list = ArrayList<Fragment>()
        list.add(Fragment1.newInstance("1","#FF0000"))
        list.add(Fragment1.newInstance("2","#00FF00"))
        list.add(Fragment1.newInstance("3","#0000FF"))
        list.add(Fragment1.newInstance("4","#000000"))
        var adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.list = list
        binding.myViewPager.adapter = adapter

    }

    fun dpToPx(dp: Int): Int {
        val displayMetrics: DisplayMetrics = this.getResources().getDisplayMetrics()
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
    }
}