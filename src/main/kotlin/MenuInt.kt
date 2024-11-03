interface MenuInt {
    val startMenu: String
        get() = "Список архивов:\n" +
                "0. Создать архив\n" +
                "1. Это мой уже созданный архив\n" +
                "2. Выход "

    val archiveMenu: String
        get() = "Архив $:\n" +
                "0. Создать архив\n" +
                "1. Это мой уже созданный архив\n" +
                "2. Выход "

}