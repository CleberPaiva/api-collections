package dio.cleberpaiva.collections

fun main() {
    val values = intArrayOf(2, 3, 5, 10, 12, 9)

    values.forEach {
        println(it)
    }

    println("--------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}