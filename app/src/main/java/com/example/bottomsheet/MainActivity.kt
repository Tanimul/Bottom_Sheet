package com.example.bottomsheet

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.bottomsheet.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bottomsheet = findViewById<ConstraintLayout>(R.id.bottomSheet)
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheet)

        val click1 = findViewById<Button>(R.id.btn)
        val click2 = findViewById<Button>(R.id.btn2)
        val click3 = findViewById<Button>(R.id.btn3)
        click1.setOnClickListener {
            Toast.makeText(this,"Clicked 1",Toast.LENGTH_SHORT).show()
        }
        click2.setOnClickListener {
            Toast.makeText(this,"Clicked 2",Toast.LENGTH_SHORT).show()
        }
        click3.setOnClickListener {
            Toast.makeText(this,"Clicked 3",Toast.LENGTH_SHORT).show()
        }
    }
}