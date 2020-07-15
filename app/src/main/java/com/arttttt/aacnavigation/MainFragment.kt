package com.arttttt.aacnavigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navFragment = childFragmentManager.findFragmentById(R.id.bottom_nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(bottomNavigation, navFragment.navController)
    }
}