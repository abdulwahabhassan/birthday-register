package com.example.week_4_task

object Utils {

    fun getListOfCelebrants(): ArrayList<Celebrant> {
        return arrayListOf(
            Celebrant("Miguel Sanchos", "19.06.1995", 3, R.color.purple, R.drawable.celebrant_four),
            Celebrant("Angel Gabriel", "24.12.2001", 11, R.color.pink, R.drawable.celebrant_three),
            Celebrant("Emmanuel Bryan Kobe", "5.01.1987", 19, R.color.cyan, R.drawable.celebrant_two),
            Celebrant("Peter Edokhumhe", "16.10.2010", 25, R.color.yellow, R.drawable.celebrant_one)
        )
    }

}