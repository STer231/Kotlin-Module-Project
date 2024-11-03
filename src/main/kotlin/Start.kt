import java.util.Scanner

class Start {
    private val archives = Archives()
val menu = "Список архивов:\n" +
        "0. Создать архив\n" +
        "1. Это мой уже созданный архив\n" +
        "2. Выход "

    fun startProgramm() {

       while (true) {
           println(menu)
           val input = readlnOrNull()?.toIntOrNull()
          val result =  when(input) {
               0 ->  { println("Создаем архив...")
                   archives.createArchive()
               }
               1 -> { println("Переходим в ваши архивы...")
                   archives.showArchiveList()
               }
               2 -> {"До свидания!"
                   break
               }
               else -> "Некорректная комманда"
           }
           println(result)
       }
    }
}