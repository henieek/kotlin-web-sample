import org.w3c.dom.HTMLDivElement
import kotlin.browser.document
import kotlin.dom.appendText

fun main() {
    val content = document.getElementById("content") as HTMLDivElement
    content.appendText("Hello from Kotlin!")
}