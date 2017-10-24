package org.insanityedge.client

import org.w3c.dom.WebSocket

/**
 * @author Danil Kornishev (danil.kornishev@mastercard.com)
 */

fun main(vararg  args: String) {
    console.log("hello world")
    val sc:WebSocket = WebSocket("ws://localhost:4567/rpc")
}

