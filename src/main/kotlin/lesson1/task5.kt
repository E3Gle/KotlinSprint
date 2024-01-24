package lesson1

fun main() {
    val secondsInSpace: Short = 6480
    val hours = secondsInSpace / 3600
    val minutes = (secondsInSpace % 3600) / 60
    val seconds = (secondsInSpace % 3600) % 60
    println("${calcTime(hours)}:${calcTime(minutes)}:${calcTime(seconds)}")
}

fun calcTime(timeUnit: Int): String = if (timeUnit < 10) "0$timeUnit" else "$timeUnit"