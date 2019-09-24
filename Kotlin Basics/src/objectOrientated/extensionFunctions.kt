package objectOrientated

fun Int.isEven() = (this % 2 == 0)

fun main(args: Array<String>) {
    println(5.isEven())

    val naturals = listOf(2, 5)
}