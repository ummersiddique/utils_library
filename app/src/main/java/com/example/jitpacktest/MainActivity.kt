package com.example.jitpacktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.utils_library.TestUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestUtils.testUtilsMethod()
    }
}