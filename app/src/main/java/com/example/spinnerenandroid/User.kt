package com.example.spinnerenandroid

import android.os.Parcel
import android.os.Parcelable

data class User(
    val name: String,
    val age: Int,
    val dia: DiaSemana
): java.io.Serializable