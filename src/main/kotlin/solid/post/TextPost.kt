package solid.post

class TextPost(title: String, val text: String): Post(title, "text") {

    override fun display() {
        println("TextPost")
        println("ID: " + id)
        println("Title: " + title)
        println("Text: " + text)
    }
}