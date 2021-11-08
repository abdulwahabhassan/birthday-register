package com.example.week_4_task

class DataSource {

    companion object{
        fun randomNumber(){
            var rand = Math.random()*255
            var color = Integer.valueOf( "$rand,$rand,$rand")
        }

        fun createDataSet(): ArrayList<NextBirthday>{
            val list = ArrayList<NextBirthday>()
            list.add(
                NextBirthday(
                    "Hassan Albdu",
                    " 15.10.2022",
                     " 315 Days Left",
                    R.drawable.image_four

                )
            )

            list.add(
                NextBirthday(
                        "Yuwa Kenneth",
                         " 25.12.2021",
                        " 47 Days Left",
                        R.drawable.image_three
                )
            )

            list.add(
                NextBirthday(
                         "Winner Eyiwumi",
                         " 3.07.2022",
                         " 300 Days Left",
                        R.drawable.image_two
            )
            )
           return list
        }

    }
}