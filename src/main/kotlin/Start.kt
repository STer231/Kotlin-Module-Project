class Start : NavigationMenu() {
    private val archives = Archives()

    fun startProgramm() {
        val menuItems = listOf("Создать архив", "Это мой уже созданный архив")
        showMenu(Operations.MAIN_MENU,menuItems, "Выход") { input ->
            when (input) {
                0 -> { println("Задайте имя для архива")
                    archives.createArchive() }
                1 -> { println("Переходим в ваши архивы...")
                    archives.showArchiveList() }
            }
        }
    }
}