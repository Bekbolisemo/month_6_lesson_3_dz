package com.example.month_6_lesson_3_dz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.month_6_lesson_3_dz.databinding.ItemRecyclerBinding
import java.io.Serializable

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.ViewHolder>() {
    private var imageList = ArrayList<Image>()
    class ViewHolder(item:View) :RecyclerView.ViewHolder(item) {
        private val binding = ItemRecyclerBinding.bind(item)
        fun bind(image:Image) = with(binding){
            ramImage.setImageResource(image.imageId)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(imageList[position])
    }

    override fun getItemCount() = imageList.size

    fun addImage(image: Array<Image>){
        imageList.addAll(image)

    }
}