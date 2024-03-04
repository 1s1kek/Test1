fun main() {
    println("Введите числа через пробел:")
    val input = readLine()
    val numbers = input?.split(" ")?.map { it.toInt() } ?: emptyList()
    val sortedNumbers = sortListUsingSortedBy(numbers)
    println("Отсортированный массив: $sortedNumbers")
}
fun sortListUsingSortedBy(numbers: List<Int>): List<Int> {
    return numbers.sortedBy { it }
}
