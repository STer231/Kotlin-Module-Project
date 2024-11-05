import java.util.Scanner

object IsEmptyInputCheck {

    fun checkEmptyInput(errorMessage: String): String {
        while (true) {
            val input = Scanner(System.`in`).nextLine()
            if (input.isNotBlank()) return input
            println(errorMessage)
        }
    }
}