package com.albertoapps.androidcourse.presentation.utils

import android.util.Log
import com.albertoapps.androidcourse.presentation.utils.Constants.TAG_GLOBAL

fun String.printValuesInConsole(variableName: String? = null) {
    Log.i(TAG_GLOBAL, "La variable $variableName es $this")
}