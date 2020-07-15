package com.jjmin.focus.ui.base

import android.content.Context

interface BaseContract{
    interface View{
        fun toastMessage(text : String)
        var context : Context
    }

    interface Presenter{
        val view : View
    }
}