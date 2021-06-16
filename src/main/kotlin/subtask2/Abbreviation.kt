package subtask2

import java.util.regex.Pattern

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var string = ""
        for(i in b.toLowerCase()) string += "${i}+.*"
        val matcher = Pattern.compile(string).matcher(a.toLowerCase())
        return if(matcher.find()) "YES" else "NO"
        //throw NotImplementedError("Not implemented")
    }
}
