package lesson14

fun main() {

    val chat = Chat()

    chat.addMessage("hi", "Leon", 1)
    chat.addThreadMessage("Hello!", "Claire", 2, 1)
    chat.addThreadMessage("yello", "Ada", 3, 1)
    chat.addMessage("bye", "Leon", 4)
    chat.addThreadMessage("Bye!", "Claire", 5, 4)
    chat.addThreadMessage("see ya", "Ada", 6, 4)

    chat.printChat()

}

class Chat {

    private val listOfAllMessages = mutableListOf<Message>()
    fun addMessage(message: String, author: String, messageId: Long) {
        listOfAllMessages.add(Message(message, author, messageId))
    }

    fun addThreadMessage(message: String, author: String, messageId: Long, parentMessageId: Long) {
        listOfAllMessages.add(ChildMessage(message, author, messageId, parentMessageId))
    }

    fun printChat() {
        listOfAllMessages.groupBy { if (it is ChildMessage) it.parentMessageId else it.messageId }
            .forEach {
                it.value.forEach { message -> println(if (message is ChildMessage) "  ${message.message}" else message.message) }
            }
    }
}

open class Message(
    val message: String,
    val author: String,
    val messageId: Long
)

class ChildMessage(
    message: String,
    author: String,
    messageId: Long,
    val parentMessageId: Long
) : Message(message, author, messageId)