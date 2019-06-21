/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package solid

import solid.app.App
import solid.feed.Feed
import java.util.Scanner


fun main(args: Array<String>) {
    val running = true
    val feed = Feed()
    val app = App(feed)
    val scanner = Scanner(System.`in`)

    while(running){
        var input = scanner.nextLine()
        app.accept(input)
        app.print()
    }
}
