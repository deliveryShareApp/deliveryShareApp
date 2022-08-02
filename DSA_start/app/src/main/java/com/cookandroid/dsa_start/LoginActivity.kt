package com.cookandroid.dsa_start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class LoginActivity : AppCompatActivity(), View.OnClickListener{
    val idEt : EditText by lazy {
        findViewById<EditText>(R.id.idEt)
    }

    val pwEt : EditText by lazy {
        findViewById<EditText>(R.id.pwEt)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val findIdText = findViewById<TextView>(R.id.findIdText)
        val findPwText = findViewById<TextView>(R.id.findPwText)
        val loginBtn = findViewById<Button>(R.id.loginBtn)

        val loginTb = findViewById<Toolbar>(R.id.loginTb)
        setSupportActionBar(loginTb)

        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findIdText.setOnClickListener(this)
        findPwText.setOnClickListener(this)
        loginBtn.setOnClickListener(this)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.findIdText -> {
                val findIdIntent = Intent(this, FindIdActivity::class.java)
                startActivity(findIdIntent)
            }
            R.id.findPwText -> {
                val findPwIntent = Intent(this,FindPasswordActivity::class.java)
                startActivity(findPwIntent)
            }
            R.id.loginBtn -> {
                var userId : String = idEt.text.toString()
                var userPw : String = pwEt.text.toString()
            }
        }
    }
}