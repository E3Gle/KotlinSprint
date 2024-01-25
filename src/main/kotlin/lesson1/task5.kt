package lesson1

fun main() {
    val secondsInSpace: Short = 6480
    val hours = secondsInSpace / SECONDS_IN_HOUR
    val minutes = (secondsInSpace % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds = (secondsInSpace % SECONDS_IN_HOUR) % SECONDS_IN_MINUTE
    println("${calcTime(hours)}:${calcTime(minutes)}:${calcTime(seconds)}")
}

fun calcTime(timeUnit: Int): String = if (timeUnit < 10) "0$timeUnit" else "$timeUnit"
const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600