package solid.post

class ImagePost(title: String, val image: String): Post(title), Downloadable {

    override fun display() {
        println("ImagePost:")
        println("ID: " + id)
        println("Title: " + title)
        println("Image: " + image)
    }

    override fun download() {
        println("Downloading: "+image)
    }

}