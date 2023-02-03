package com.example.customtablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.customtablayout.fragments.Education_fragment
import com.example.customtablayout.fragments.ViewPagerAdaptor
import com.example.customtablayout.fragments.zodaic_fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adaptor = ViewPagerAdaptor(supportFragmentManager)
        adaptor.addFragment(zodaic_fragment(), "Zodaic")
        adaptor.addFragment(Education_fragment(), "Education")
        adaptor.addFragment(zodaic_fragment(), "Zodaic")
        adaptor.addFragment(Education_fragment(), "Education")
        adaptor.addFragment(zodaic_fragment(), "Zodaic")
        adaptor.addFragment(Education_fragment(), "Education")
        val viewpager = findViewById<ViewPager>(R.id.viewpager)
        val tabs = findViewById<TabLayout>(R.id.tablayout)
        viewpager.adapter = adaptor
        tabs.setupWithViewPager(viewpager)
        tabs.getTabAt(0)?.setIcon(R.drawable.ic_zodiac)
        tabs.getTabAt(1)?.setIcon(R.drawable.ic_education)
    }
}