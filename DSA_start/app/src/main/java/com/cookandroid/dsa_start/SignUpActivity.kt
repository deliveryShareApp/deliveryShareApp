package com.cookandroid.dsa_start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.widget.Toolbar

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    val idEt : EditText by lazy {
        findViewById(R.id.idEt)
    }

    val pwEt : EditText by lazy {
        findViewById(R.id.pwEt)
    }

    val nameEt : EditText by lazy {
        findViewById(R.id.nameEt)
    }

    val nNameEt : EditText by lazy {
        findViewById(R.id.nNameEt)
    }

    val phoneEt : EditText by lazy {
        findViewById(R.id.nNameEt)
    }

    val emailEt : EditText by lazy {
        findViewById(R.id.emailEt)
    }

    val wRb : RadioButton by lazy {
        findViewById(R.id.wRb)
    }

    val mRb : RadioButton by lazy {
        findViewById(R.id.mRb)
    }

    lateinit var userId : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val idChkBtn = findViewById<Button>(R.id.idChkBtn)
        val nNameChkBtn = findViewById<Button>(R.id.nNameChkBtn)
        val finishBtn = findViewById<Button>(R.id.finishBtn)

        val signUpTb = findViewById<Toolbar>(R.id.signUpTb)
        setSupportActionBar(signUpTb)

        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        idChkBtn.setOnClickListener(this)
        nNameChkBtn.setOnClickListener(this)
        finishBtn.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idChkBtn -> {
                var userId = idEt.text.toString()
            }
            R.id.nNameChkBtn -> {
                var userNName = nNameEt.text.toString()
            }
            R.id.finishBtn -> {
                var userPw = pwEt.text.toString()
                var userName = nameEt.text.toString()
                var userPhone = phoneEt.text.toString()
                var userEmail = emailEt.text.toString()

                val finishIntent = Intent(this, SetAddress::class.java)
                startActivity(finishIntent)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> {
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item)
    }
}