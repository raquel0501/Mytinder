package com.example.mytinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
    }
    fun passear(view: View) {
        // Do something in response to button
    }

    fun date(view: View) {
        // Do something in response to button
    }
    fun search(view: View) {
        // Do something in response to button
    }

}