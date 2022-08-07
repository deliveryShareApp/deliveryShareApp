package com.example.examplecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examplecode.databinding.ActivitySelectCardBinding

class SelectCardActivity : AppCompatActivity() {

    private var mBinding: ActivitySelectCardBinding? = null
    private val binding get() = mBinding!!

    var bundle = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySelectCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}