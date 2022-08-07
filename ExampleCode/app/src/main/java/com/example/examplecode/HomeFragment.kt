package com.example.examplecode

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examplecode.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    //뷰 바인딩 사용
    private var mBinding: FragmentHomeBinding? = null
    private val binding get() = mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.selectSushi.setOnClickListener {
            startCardActivity()
        }
        return binding.root
    }

    private fun startCardActivity() {
        val intent = Intent(activity, SelectCardActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding=null
    }
}