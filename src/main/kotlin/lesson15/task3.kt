package lesson15

fun main() {
    val simpleUser = SimpleForumUser("Leon", 1)
    val adminUser = AdminForumUser("Claire", 2)

    simpleUser.sendMessage()
    simpleUser.readMessage()

    adminUser.readMessage()
    adminUser.sendMessage()
    adminUser.deleteMessage()
    adminUser.deleteUser()

}

class AdminForumUser(username: String, userId: Int) : ForumUser(username, userId) {
    override fun readMessage() {
        println("Админ юзер прочитал сообщение")
    }

    override fun sendMessage() {
        println("Админ юзер отправил сообщение")
    }

    fun deleteMessage() {
        println("Админ юзер удалил сообщение")
    }

    fun deleteUser() {
        println("Админ юзер удалил пользователя с форума")
    }
}

class SimpleForumUser(username: String, userId: Int) : ForumUser(username, userId) {
    override fun readMessage() {
        println("Обычный юзер прочитал сообщение")
    }

    override fun sendMessage() {
        println("Обычный юзер отправил сообщение")
    }
}

abstract class ForumUser(val username: String, val userId: Int) {
    abstract fun readMessage()
    abstract fun sendMessage()

}