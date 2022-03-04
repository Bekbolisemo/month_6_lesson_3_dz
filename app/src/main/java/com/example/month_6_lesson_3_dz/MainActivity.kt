package com.example.month_6_lesson_3_dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.month_6_lesson_3_dz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = MainAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()
        onClick()
    }

    companion object {
        const val arrayImage = "image"
    }

    private fun onClick() {
        binding.btnSend.setOnClickListener {
            var intent = Intent()
            intent.putExtra(arrayImage, arrayOf(adapter.pushImage()))
            startActivity(intent)
        }
    }

    private fun initRecycler() = with(binding) {
        recyclerView.layoutManager = GridLayoutManager(this@MainActivity, 3)
        recyclerView.adapter = adapter
        for (i in 0..20) {
            adapter.addImage(Image(R.drawable.ram_1))
            adapter.addImage(Image(R.drawable.ram_2))
        }
    }


}