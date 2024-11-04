class Archives {
   private val archiveList: MutableList<Archive> = mutableListOf()


    fun showArchiveList() {
        if (archiveList.isEmpty()) {
            println("Список архивов пуст")
        } else {
            println("Список архивов:")
            println("0 - Вернуться назад")
            archiveList.forEachIndexed { index, archive ->
                println("${index + 1} - ${archive.name}")
            }

            while (true) {
                println("Выберите номер архива")
                val number = readlnOrNull()?.toIntOrNull()
                if ((number != null && number <= archiveList.size && number > 0)) {
                    openArchiveMenu(archiveList[number - 1])
                    return
                } else if (number == null) {
                    println("Ошибка. Введите число")
                } else if (number == 0) {
                    return
                } else {
                    println("Архива под таким номером не существует")
                }
            }
        }

    }

    fun createArchive() {
        while (true) {
        val name: String? = readlnOrNull()
        if (name != null) {
            if (name.isEmpty()) {
                println("Поле не может быть пустым\n" +
                        "Задайте имя для архива")
            } else {
                archiveList.add(Archive(name))
                println("Архив $name успешно создан")
                return
            }
            }
        }
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
