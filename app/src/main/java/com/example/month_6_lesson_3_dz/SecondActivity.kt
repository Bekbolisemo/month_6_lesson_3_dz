package com.example.month_6_lesson_3_dz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import androidx.recyclerview.widget.GridLayoutManager
import com.example.month_6_lesson_3_dz.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val adapter = SecondAdapter()
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()

    }

    private fun initRecycler() = with(binding) {
        recyclerView.layoutManager = GridLayoutManager(this@SecondActivity,3)
        recyclerView.adapter = adapter
        var image = intent.getParcelableArrayExtra(MainActivity.arrayImage)
        for (i in 0..20)
            adapter.addImage(image as Array<Image>)

        }
    }
