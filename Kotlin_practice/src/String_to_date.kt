import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(args: Array<String>) {
    val string = "August 10, 2019"
//    val date  = LocalDate.parse(string, DateTimeFormatter.ISO_DATE)
//    Convert data to Date by using pattern
    val date = LocalDate.parse(string, DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH))
    println(date)
}