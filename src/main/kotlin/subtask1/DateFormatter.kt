package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        try {
        val date = LocalDate.of(year.toInt(), month.toInt(),day.toInt())
        val dateFormatter = DateTimeFormatter.ofPattern("d MMMM, EEEE")
        println(dateFormatter.format(date))
        return dateFormatter.format(date)
        }catch (e: DateTimeException){
            return "Такого дня не существует"
        }

    }
}
