package solid.post

import java.util.*

abstract class Post (val title: String, val type: String) {

    val id: String = UUID.randomUUID().toString()

    abstract fun display()

}

interface Downloadable {

    fun download()

}