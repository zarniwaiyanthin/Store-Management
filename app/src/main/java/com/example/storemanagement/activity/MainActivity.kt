package com.example.storemanagement.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.storemanagement.R

class MainActivity : BaseActivity() {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,MainActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}