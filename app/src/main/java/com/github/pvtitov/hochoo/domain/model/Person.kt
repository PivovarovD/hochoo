package com.github.pvtitov.hochoo.domain.model

import android.graphics.Bitmap
import java.util.*
import kotlin.collections.HashSet

data class Person(
    val id: String,
    val name: String = "",
    val photo: Bitmap? = null,
    val wishes: TreeSet<Wish> = TreeSet(),
    val friends: Set<Person> = HashSet(),
    val isExposed: Boolean = false
)