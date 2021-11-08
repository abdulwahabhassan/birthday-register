package com.example.week_4_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


 class BirthdayViewHolder: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
     private var items: List<NextBirthday> = ArrayList()

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
         return BirthdayViewHolder(
             LayoutInflater.from(parent.context)
                 .inflate(R.layout.birthday_item_layout, parent, false)
         )
     }

     override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
         when (holder) {

             is BirthdayViewHolder -> {
                 holder.bind(items.get(position))
             }

         }
     }

     override fun getItemCount(): Int {
         return items.size
     }

     fun submitList(birthdayList: List<NextBirthday>) {
         items = birthdayList
     }

     class BirthdayViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val birthday = itemView.findViewById<TextView>(R.id.birthday)
         val image = itemView.findViewById<ImageView>(R.id.image)
         val days_left = itemView.findViewById<TextView>(R.id.days_left)
         val names = itemView.findViewById<TextView>(R.id.names)

         fun bind(nextBirthday: NextBirthday) {
             val requestOptions = RequestOptions()
                 .placeholder(R.drawable.ic_home_colored)
                 .error(R.drawable.ic_home)

             Glide.with(itemView.context)
                 .applyDefaultRequestOptions(requestOptions)
                 .load(nextBirthday.image)
                 .into(image)
             names.setText(nextBirthday.names)
             birthday.setText(nextBirthday.birthday)
             days_left.setText(nextBirthday.days_left)
         }
     }
 }