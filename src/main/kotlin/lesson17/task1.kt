package lesson17

class Quiz(question: String, answer: String) {
    val question = question
        get() = field

    var answer = answer
        set(value) {
            field = value
        }
        get() = field
}