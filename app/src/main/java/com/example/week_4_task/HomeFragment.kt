package com.example.week_4_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.week_4_task.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewPager: ViewPager2
    private lateinit var viewPagerAdapter: FragmentStateAdapter
    private lateinit var nextBirthdayAdapter:BirthdayViewHolder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //set up viewpager
        viewPager = binding.announcementViewPager
        viewPagerAdapter = object : FragmentStateAdapter(childFragmentManager, lifecycle) {
            private val fragments = arrayOf(
                AnnouncementFragment(),
                AnnouncementFragment(),
                AnnouncementFragment(),
            )

            override fun createFragment(position: Int) = fragments[position]

            override fun getItemCount(): Int = fragments.size
        }

        viewPager.adapter = viewPagerAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun addDataset(){
        val data = DataSource.createDataSet()
        nextBirthdayAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        notice_recycler_view.layoutManager.LinearLayoutManager(this@HomeFragment)
       nextBirthdayAdapter= BirthdayViewHolder()
        notice_recycler_view.adapter =nextBirthdayAdapter
    }
}