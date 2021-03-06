package com.jjmin.focus.model

import android.net.Uri

data class MainRecommentModel(
    val musicName : String,
    val musicArtist : String,
    val thumbnail : String,
    val musicUrl : String
) : ModelImpl {
    override fun getType(): ItemType {
        return ItemType.MR
    }
}