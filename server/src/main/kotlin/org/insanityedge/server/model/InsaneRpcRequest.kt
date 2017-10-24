package org.insanityedge.server.model

/**
 * @author Danil Kornishev (danil.kornishev@mastercard.com)
 */
data class InsaneRpcRequest(val receiver: Class<*>, val function: String, val args: List<*>)