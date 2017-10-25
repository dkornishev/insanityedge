package org.insanityedge.borderland.spark

import kotlinx.coroutines.experimental.async
import spark.Spark.*

/**
 * @author Danil Kornishev (danil.kornishev@mastercard.com)
 */
fun main(args: Array<String>) {
    val wsHandler = InsanityServer()
    webSocket("/rpc", wsHandler)
    init()

    println("Server started on http://localhost:${port()}")
}

suspend fun runthings() {
}

fun someAsync() = async {
    println("Hello")
}