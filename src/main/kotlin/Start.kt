class Start: MenuInt {
    private val archives = Archives()


    fun startProgramm() {
        println("Добро пожаловать!")
       while (true) {
           println(startMenu)
           val input = readlnOrNull()?.toIntOrNull()
           when(input) {
               0 ->  { println("Задайте имя для архива")
                   archives.createArchive()
               }
               1 -> { println("Переходим в ваши архивы...")
                   archives.showArchiveList()
               }
               2 -> { println("До свидания!")
                   break
               }
               else -> println("Некорректная комманда")
           }
       }
    }
}