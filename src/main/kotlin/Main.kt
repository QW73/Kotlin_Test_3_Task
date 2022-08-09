import kotlin.math.pow

data class OutputData(val l: Long, val r: Long)

fun main() {
    var maxRange: Long
    var minRange: Long
    var count = 0
    while (true) {
        val (l, r) = consoleRead()
        if ((l >= 1) && (r <= ((10.0.pow(9)).toInt()))) {
            minRange = l
            maxRange = r
            break
        }
    }
    for (i in minRange..maxRange) {

        if (i == palindromeCheck(i)) {
            count += 1
        }
    }
    print(count)

}

fun consoleRead(): OutputData {
    val (l, r) = readLine()!!.split(' ').map(String::toLong)
    return OutputData(l, r)
}

fun palindromeCheck(a: Long): Long {
    var num: Long = a
    var remainder: Long
    val originalInteger: Long = num
    var reversedInteger: Long = 0
    while (0.toLong() != num) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }
    return if (originalInteger == reversedInteger) {
        a
    } else {
        0
    }
}

