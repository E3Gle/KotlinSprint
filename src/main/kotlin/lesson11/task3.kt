package lesson11

fun main() {

    val room = Room(
        Image(12, "sdcard/1.png"),
        "Test Room",
        mutableListOf(User(1, UserIcon(1, "sdcard.2.png"), "Bob", "Muted"))
    )

}

class Room(var cover: Image, var title: String, val listOfUsers: MutableList<User>) {
    fun addUser(user: User) {
        listOfUsers.add(user)
    }

    fun updateUserStatus(nickname: String, newStatus: String) {
        listOfUsers.find { it.nickname == nickname }?.userStatus = newStatus
    }

    fun getUserInfoByLongTap(user: User) {
        println("User's nickname is ${user.nickname}")
    }
}

class User(val id: Int, val userIcon: UserIcon, var nickname: String, var userStatus: String)

class Image(val id: Int, val src: String)

class UserIcon(val id: Int, val src: String)

