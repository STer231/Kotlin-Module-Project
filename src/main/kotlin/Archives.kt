import java.util.Scanner

class Archives {
   private val archiveList: MutableSet<Archive> = mutableSetOf()

    fun showArchiveList() {
       archiveList.forEachIndexed {index, element ->
        println("${index + 1} - ${element.name}")}
    }

    fun createArchive() {
        val name: String = readLine()!!
        archiveList.add(Archive(name))
    }
}
