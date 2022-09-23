fun CodelandUsernameValidation(str: String): Boolean {
   
    var valid = str.length in 4..25
    valid = valid && (str[0] in 'a'..'z' || str[0] in 'A'..'Z')

    str.forEach {
        valid = valid && (it in 'a'..'z' || it in 'A'..'Z' || it in '0'..'9' || it == '_')

    }
    valid=str.last()!='_'
    return valid


}

fun main() {
    println(readLine()?.let { CodelandUsernameValidation(it) })
}