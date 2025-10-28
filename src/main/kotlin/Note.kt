data class Note(
    val nameNote: String,
    val content: String
) {

    fun readNote() {
        println("Заметка: $nameNote\nСодержание: $content")
    }
}
