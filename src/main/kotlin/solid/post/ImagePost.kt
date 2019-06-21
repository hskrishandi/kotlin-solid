package solid.post

class ImagePost(title: String, val image: String): Post(title, "image"), Downloadable {

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