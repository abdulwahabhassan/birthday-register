package com.example.week_4_task

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.week_4_task.databinding.FragmentAnnouncementBinding
import com.example.week_4_task.databinding.FragmentGiftsBinding
import com.example.week_4_task.databinding.FragmentHomeBinding


class AnnouncementFragment(
    private val celebrantName: String,
    private val celebrantPhoto: Int
) : Fragment() {

    private var _binding: FragmentAnnouncementBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAnnouncementBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.announcementTextView.text = "It's $celebrantName's birthday"
        binding.shapeableImageView.setImageResource(celebrantPhoto)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}