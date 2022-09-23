fun QuestionsMarks(str: String): String {
    var Count = 0
    var lastDigit = -1
    var result = "false"

    for (char in str) {
        if (char.isDigit()) {
            val digit = Integer.valueOf(char.toString())
            val sum = digit + lastDigit
            lastDigit = digit

            if (sum != 10) {
                Count = 0
                continue
            }

            result = if (Count == 3)
                "true"
            else
                "false"
            Count = 0
        } else if (char == '?') Count++
    }

    return result;
}

fun main() {
    println(QuestionsMarks(readln()))
}