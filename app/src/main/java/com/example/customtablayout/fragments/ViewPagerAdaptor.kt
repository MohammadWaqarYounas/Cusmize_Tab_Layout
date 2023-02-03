package com.example.customtablayout.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdaptor(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(
    supportFragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()

    override fun getCount() = fragmentList.size

    override fun getItem(position: Int) = fragmentList[position]

    override fun getPageTitle(position: Int) = fragmentTitleList[position]

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)

    }
}