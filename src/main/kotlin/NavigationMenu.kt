import java.util.*

open class NavigationMenu {
    private val scanner = Scanner(System.`in`)

    fun showMenu(menuName: Operations, menuItems: List<String>, exitMenu: String, numberMenu: (Int) -> Unit
    ) {
        while (true) {
            menuName.getTypeMenu()
            menuItems.forEachIndexed { index, value ->
                println("${index + 1} - $value")
            }
            println("0 - $exitMenu")

            val input = scanner.nextLine()
            if (input == "0") {
                return
            } else if (input.toIntOrNull() != null && input.toInt() <= menuItems.size && input.toInt() > 0) {
                numberMenu(input.toInt() - 1)
            } else {
                println("Некорректный ввод. Выберите пункт из списка.")
            }
        }
    }
}