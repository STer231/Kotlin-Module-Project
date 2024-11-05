class Archive(val name: String) : NavigationMenu() {
    private val noteList: MutableList<Note> = mutableListOf()

    fun createNote() {
        println("Название заметки:")
        val nameNote = IsEmptyInputCheck.checkEmptyInput("Название заметки не может быть пустым")
        println("Содержимое заметки")
        val content = IsEmptyInputCheck.checkEmptyInput("Содержимое заметки не может быть пустым")
        noteList.add(Note(nameNote, content))
        println("Заметка $nameNote успешно создана")
    }

    fun showNoteList() {
        if (noteList.isEmpty()) {
            println("Архив $name пуст")
        } else {
            val menuItems = noteList.map { it.nameNote }
            showMenu(Operations.NOTE_MENU, menuItems, "Вернуться к архивам") { index ->
                noteList[index].readNote()
            }
        }
    }
}