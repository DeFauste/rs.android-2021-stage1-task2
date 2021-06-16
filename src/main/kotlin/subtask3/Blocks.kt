package subtask3

import java.lang.StringBuilder
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var sumVal = 0;
        val sumString = StringBuilder()
        var date: LocalDate = LocalDate.parse("0001-01-01")
        for (i in blockA){
            when(i){
                is String -> sumString.append(i)
                is Int -> sumVal += i
                is LocalDate -> if(date < i) date = i
            }
        }
        return when(blockB){
                String::class -> sumString.toString()
                Int::class -> sumVal
                LocalDate::class -> DateTimeFormatter.ofPattern("d.MM.yyyy").format(date)
                else -> "unknown"
         }
//        throw NotImplementedError("Not implemented")
    }
}
