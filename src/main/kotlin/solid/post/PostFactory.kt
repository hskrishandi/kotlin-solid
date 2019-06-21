package solid.post

class PostFactory {

    fun makePost(type: String, title: String, content: String): Post? {
        when (type) {
            "image" -> return ImagePost(title, content)
            "text" -> return TextPost(title, content)
            "video" -> return VideoPost(title, content)
        }
        return null
    }
}