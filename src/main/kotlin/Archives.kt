class Archives : NavigationMenu() {
    private val archiveList: MutableList<Archive> = mutableListOf()

    fun createArchive() {
        val nameArchive = IsEmptyInputCheck.checkEmptyInput("Название архива не может быть пустым")
        archiveList.add(Archive(nameArchive))
        println("Архив $nameArchive успешно добавлен")
    }

    fun showArchiveList() {
        if (archiveList.isEmpty()) {
            println("Список архивов пуст")
        } else {
            val menuItems = archiveList.map { it.name }
            showMenu(Operations.ARCHIVES_MENU, menuItems, "Вернуться к главному меню") { index ->
                openArchiveMenu(archiveList[index])
            }
        }
    }

    fun openArchiveMenu(archive: Archive) {
        val menuItems = listOf("Добавить заметку", "Просмотреть заметки")
        showMenu(Operations.NOTES_MENU, menuItems, "Вернуться к списку архивов") { input ->
            when (input) {
                0 -> archive.createNote()
                1 -> {
                    println("Переходим в заметки архива ${archive.name}...")
                    archive.showNoteList()
                }
            }
        }
    }
}