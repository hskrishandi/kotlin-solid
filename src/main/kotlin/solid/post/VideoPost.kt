package solid.post

class VideoPost(title: String, val video: String): Post(title, "video"), Downloadable {

    override fun display() {
        println("ImagePost:")
        println("ID: " + id)
        println("Title: " + title)
        println("Video: " + video)
    }

    override fun download() {
        println("Downloading: "+video)
    }

}