package lesson17

fun main() {

    val folder = Folder("Тестовая папка", 12, true)

    println(folder.name)
}

class Folder(name: String, val filesAmount: Int, val isSecret: Boolean) {

    val name = name
        get() {
            return if (isSecret) {
                "секретная папка, $filesAmount файлов"
            } else {
                "$field, $filesAmount файлов"
            }
        }
}