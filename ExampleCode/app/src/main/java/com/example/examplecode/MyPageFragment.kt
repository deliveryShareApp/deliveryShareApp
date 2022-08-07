package com.example.examplecode

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examplecode.databinding.FragmentHomeBinding
import com.example.examplecode.databinding.FragmentMyPageBinding

class MyPageFragment : Fragment() {
    //뷰 바인딩 사용
    private var mBinding: FragmentMyPageBinding? = null
    private val binding get() = mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMyPageBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        mBinding=null
    }
}