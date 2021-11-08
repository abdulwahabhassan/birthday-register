package com.example.week_4_task

import android.hardware.biometrics.BiometricManager

data class NextBirthday (
      var names: String,
      var birthday: String,
      var days_left: String,
      var image: Int
         ){
    override fun toString(): String{
        return "NextBirthday(names='$names', image='$image', countdown='$days_left', birthday='$birthday')"
    }
}