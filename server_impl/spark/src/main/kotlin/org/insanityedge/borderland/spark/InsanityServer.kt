package org.insanityedge.borderland.spark

import com.fasterxml.jackson.databind.ObjectMapper
import org.eclipse.jetty.websocket.api.Session
import org.eclipse.jetty.websocket.api.WebSocketListener
import org.insanityedge.server.model.InsaneRpcRequest

/**
 * @author Danil Kornishev (danil.kornishev@mastercard.com)
 */
class InsanityServer : WebSocketListener {

    private val objectMapper = ObjectMapper()

    override fun onWebSocketError(cause: Throwable?) {
        TODO("not implemented")
    }

    override fun onWebSocketClose(statusCode: Int, reason: String?) {
        TODO("not implemented")
    }

    override fun onWebSocketConnect(session: Session?) {
        println("Connection established")
        println(session?.remoteAddress?.address?.hostAddress)
    }

    override fun onWebSocketText(message: String?) {
        println(message)
        val messageWrapper = objectMapper.readValue(message, InsaneRpcRequest::class.java)
    }

    override fun onWebSocketBinary(payload: ByteArray?, offset: Int, len: Int) {
        TODO("not implemented")
    }
}

