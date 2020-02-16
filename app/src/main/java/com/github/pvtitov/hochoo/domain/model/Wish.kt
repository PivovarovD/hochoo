package com.github.pvtitov.hochoo.domain.model

import android.graphics.Bitmap

data class Wish(
    val id: String,
    val title: String,
    val description: String = "",
    val image: Bitmap? = null,
    val url: String? = null,
    val price: Long? = null,
    val isExposed: Boolean = false,
    val promisedBy: Person? = null
)