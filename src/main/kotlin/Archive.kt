class Archive(val name: String) {

    private val noteList: MutableSet<Note> = mutableSetOf()



    fun createNote() {
        val nameNote = readLine()?: "null"
        val content = readLine()?: "null"

        noteList.add(Note(nameNote, content))
    }

    fun showNoteList() {
        if (noteList.isEmpty()) {
            println("Архив $name пуст")
        }
        noteList.forEachIndexed {index, note ->
            println("${index + 1} - ${note.nameNote}")
        }

    }
}