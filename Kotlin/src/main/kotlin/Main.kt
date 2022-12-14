import java.io.File
import days.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val dayCode = args.first().toInt()
    val input = readFile("../input/day${dayCode}.txt")
    val day = when(dayCode) {
        1 -> DayOne(input)
        2 -> DayTwo(input)
        3 -> DayThree(input)
        4 -> DayFour(input)
        5 -> DayFive(input)
        6 -> DaySix(input)
        7 -> DaySeven(input)
        8 -> DayEight(input)
        9 -> DayNine(input)
        10 -> DayTen(input)
        else -> throw Error()
    }
    day.solve()
}

fun readFile(fileName: String): List<String> {
    return File(fileName).useLines { it.toList() }
}