import kotlinx.coroutines.*
import java.lang.Thread.sleep

fun main(args: Array<String>) {
    println("start")

    runBlocking {
        (1..100).map {
            async(Dispatchers.Default) {
                println("Hello World!")
                sleep(1000)
            }
        }.map {
            it.await()
        }
    }
}