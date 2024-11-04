enum class Operations {
    MAIN_MENU,
    ARCHIVES_MENU,
    NOTES_MENU,
    NOTE_MENU;

    fun getTypeMenu(): Unit =
        when (this) {
            MAIN_MENU -> println("\nГлавне меню:")
            ARCHIVES_MENU -> println("\nМеню - спсиок архивов:")
            NOTES_MENU -> println("\nМеню - заметки:")
            NOTE_MENU -> println("\nМеню - список заметок:")
        }
}