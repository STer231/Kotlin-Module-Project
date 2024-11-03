class Start: MenuInt {
    private val archives = Archives()


    fun startProgramm() {

       while (true) {
           println(startMenu)
           val input = readlnOrNull()?.toIntOrNull()
          val result =  when(input) {
               0 ->  { println("Создаем архив...")
                   archives.createArchive()
               }
               1 -> { println("Переходим в ваши архивы...")
                   archives.showArchiveList()
               }
               2 -> { println("До свидания!")
                   break
               }
               else -> "Некорректная комманда"
           }
           println(result)
       }
    }
}