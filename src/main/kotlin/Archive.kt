class Archive(val name: String) {

    private val noteList: MutableList<Note> = mutableListOf()



    fun createNote() {
        println("Название заметки:")
        val nameNote = readLine()?: "null"
        println("Содержимое заметки")
        val content = readLine()?: "null"

        noteList.add(Note(nameNote, content))
    }

    fun showNoteList() {
        if (noteList.isEmpty()) {
            println("Архив $name пуст")
        } else {
            println("Список ваших заметок:")
            println("0 - Вернуться назад")
            noteList.forEachIndexed { index, note ->
                println("${index + 1} - ${note.nameNote}")
            }

            while (true) {
                println("Введите номер заметки для прочтения содержимого")
                val number = readlnOrNull()?.toIntOrNull()
                if ((number != null && number <= noteList.size && number > 0)) {

                    println(
                        "Заметка - ${noteList[number - 1].nameNote}\n:" +
                                "${noteList[number - 1].content}"
                    )
                    return
                } else if (number == null) {
                    println("Ошибка. Введите число")
                } else if (number == 0) {
                    return
                } else {
                    println("Заметки под таким номером не существует")
                }
            }
        }
    }

}