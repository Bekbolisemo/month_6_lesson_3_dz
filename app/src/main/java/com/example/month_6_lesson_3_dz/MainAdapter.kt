package com.example.month_6_lesson_3_dz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.month_6_lesson_3_dz.databinding.ItemRecyclerBinding

class MainAdapter:RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private val imageList = ArrayList<Image>()
    private var pushImage = ArrayList<Image>()

   inner class ViewHolder(item: View): RecyclerView.ViewHolder(item) {
        private val binding = ItemRecyclerBinding.bind(item)
        fun bind(image: Image)= with(binding){
            ramImage.setImageResource(image.imageId)
            itemView.setOnClickListener{
                if (ramImageBlack.isInvisible){
                    ramImageBlack.visibility = View.VISIBLE
                    pushImage.add(imageList[adapterPosition])


                }else if(ramImageBlack.isVisible){
                    ramImageBlack.visibility = View.INVISIBLE

                }
            }
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

    fun pushImage():ArrayList<Image>{
        return pushImage
    }

    fun addImage(image:Image){
        imageList.add(image)
        notifyDataSetChanged()
    }
}