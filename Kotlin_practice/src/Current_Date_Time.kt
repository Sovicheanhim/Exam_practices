import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

fun main(args: Array<String>) {
    val current = LocalDateTime.now()
//    Get the current date and time with the following pattern
//    val format = current.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))
//    In this case, we use the localized style Medium to get the current date time in the given format
//    Other styles include FULL, LONG ,and SHORT
    val format = current.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))

    println("Current Date and Time is: $format")
}