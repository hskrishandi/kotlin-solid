package solid.app

import solid.feed.Feed
import solid.post.PostFactory

class App(val feed: Feed){

    fun accept(input: String){
        val inputArray = input.split(" ").toTypedArray()
        when(inputArray[0]){
            "new"-> addPost(inputArray)
            "delete"-> deletePost(inputArray)
            "print"-> print()
        }
    }

    fun addPost(inputArray: Array<String>){
        val factory = PostFactory()
        val post = factory.makePost(inputArray[1], inputArray[2], inputArray[3])
        feed.add(post)
    }

    fun deletePost(inputArray: Array<String>){
        feed.delete(inputArray[1])
    }

    fun print(){
        feed.printAll()
    }
}