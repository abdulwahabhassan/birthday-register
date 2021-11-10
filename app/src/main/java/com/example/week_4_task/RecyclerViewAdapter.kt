package com.example.week_4_task

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.week_4_task.databinding.ItemBirthdayBinding


class RecyclerViewAdapter(
    private val context: Context
) :
    RecyclerView.Adapter<RecyclerViewAdapter.CelebrantViewHolder>() {

    private var listOfCelebrants = arrayListOf<Celebrant>()

    inner class CelebrantViewHolder (private val itemBinding : ItemBirthdayBinding)
        : RecyclerView.ViewHolder(itemBinding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(celebrant: Celebrant, context: Context) =
            with(itemBinding) {
                celebrantName.text = celebrant.name
                celebrantDate.text = celebrant.date
                daysLeft.text = celebrant.daysLeft.toString() + "days left"
                verticalLine.setBackgroundResource(celebrant.favouriteColor)
                celebrantPhotoImageView.setImageResource(celebrant.image)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CelebrantViewHolder {
        val viewBinding = ItemBirthdayBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return CelebrantViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: CelebrantViewHolder, position: Int) {
        val member = listOfCelebrants[position]
        holder.bind(member, context)
    }

    override fun getItemCount(): Int {
        return listOfCelebrants.size
    }

    fun setList(celebrants: ArrayList<Celebrant>) {
        val itemCount = listOfCelebrants.size
        listOfCelebrants = celebrants
        notifyItemRangeChanged(0, itemCount)
    }

}