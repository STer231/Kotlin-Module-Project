class Archives {
   private val archiveList: MutableList<Archive> = mutableListOf()


    fun showArchiveList() {
       archiveList.forEachIndexed {index, archive ->
           println("${index + 1} - ${archive.name}")}

        while (true) {
            println("Выберите номер архива")
            val number = readlnOrNull()?.toIntOrNull()
            if ((number != null && number <= archiveList.size   && number > 0)) {
                openArchiveMenu(archiveList[number - 1])
                return
            } else if (number == null) {
                println("Ошибка. Введите число")
            } else {
                println("Архива под таким номером не существует")
            }
        }

    }

    fun createArchive() {
        val name: String = readLine()!!
        archiveList.add(Archive(name))
    }
}

fun openArchiveMenu(archive: Archive) {
    while (true) {
        println("Архив ${archive.name}:\n" +
                "0. Создать заметку\n" +
                "1. Открыть список заметок\n" +
                "2. Вернуться назад ")
        val input = readlnOrNull()?.toIntOrNull()
        when(input) {
            0 -> archive.createNote()
            1 -> archive.showNoteList()
            2 -> return
            else -> println("Некорректная комманда")
        }
    }
}
