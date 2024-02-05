package lesson11

fun main() {

    val forum = Forum()

    val user1 = ForumMember.createNewUser("Claire")
    val user2 = ForumMember.createNewUser("Leon")

    val msg1 = ForumMessage.createNewMessage(user1.userId, "first message")
    val msg2 = ForumMessage.createNewMessage(user1.userId, "second message")
    val msg3 = ForumMessage.createNewMessage(user2.userId, "third message")
    val msg4 = ForumMessage.createNewMessage(user2.userId, "fourth message")

    forum.printThread()
}

class Forum {
    private val forumMembers = ForumMember.membersList
    private val forumMessages = ForumMessage.messagesList

    fun printThread() {
        for (message in forumMessages) {
            for (member in forumMembers) {
                if (member.userId == message.authorId) println("${member.userName}: ${message.message}")
            }
        }
    }
}

class ForumMember private constructor(val userId: Int, val userName: String) {

    companion object {
        private var idCounter = 0
        val membersList = mutableListOf<ForumMember>()
        fun createNewUser(name: String): ForumMember {
            val newMember = ForumMember(idCounter++, name)
            membersList.add(newMember)
            return newMember
        }
    }
}

class ForumMessage private constructor(val authorId: Int, val message: String) {
    companion object {
        val messagesList = mutableListOf<ForumMessage>()
        fun createNewMessage(id: Int, message: String) {
            if (ForumMember.membersList.find { it.userId == id } != null) messagesList.add(ForumMessage(id, message))
        }
    }
}