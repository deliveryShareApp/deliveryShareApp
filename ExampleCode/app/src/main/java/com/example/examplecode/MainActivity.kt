package com.example.examplecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.examplecode.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    var bundle = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //bottom navigation
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(this)
        //set default screen
        binding.bottomNavigationView.selectedItemId = R.id.page_home

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.page_home->{
                var homeViewFragment = HomeFragment()
                homeViewFragment.arguments = bundle
                supportFragmentManager.beginTransaction().replace(R.id.main_container, homeViewFragment).commit()
                return true
            }
            R.id.page_chat->{
                var chatViewFragment = ChatFragment()
                chatViewFragment.arguments = bundle
                supportFragmentManager.beginTransaction().replace(R.id.main_container, chatViewFragment).commit()
                return true
            }
            R.id.page_mypage->{
                var mypageViewFragment = MyPageFragment()
                mypageViewFragment.arguments = bundle
                supportFragmentManager.beginTransaction().replace(R.id.main_container, mypageViewFragment).commit()
            }
        }
        return false
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}