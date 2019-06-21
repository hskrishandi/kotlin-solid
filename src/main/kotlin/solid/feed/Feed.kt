package solid.feed

import solid.post.Post

class Feed {

    val postList = mutableListOf<Post>()

    fun getPost(id: String): Post?{
        for(post in postList){
            if(post.id == id)
                return post
        }
        return null
    }

    fun add(post: Post?){
        if(post!=null)
            postList.add(post)
    }

    fun delete(id: String): Boolean{

        val post = getPost(id)

        if(post!=null) {
            return postList.remove(post)
        }
        return false
    }

    fun printAll(){
        for(post in postList){
            post.display()
            println("----------------------------")
        }
    }

}