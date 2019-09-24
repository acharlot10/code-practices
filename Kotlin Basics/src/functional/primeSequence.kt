package functional

fun main(args: Array<String>) {

    val possiblePrimesAfter2 = generateSequence(3) { it + 2 }

    val primes = generateSequence(2 to possiblePrimesAfter2) {

        // Next Prime Number
        val p = it.second.first() // p = 3

        // Filter out all integers that are divisible p
        val possiblePrimesAfterP = it.second.filter { it % p != 0 }

        // Return the next element in the sequence
        p to possiblePrimesAfterP

    }.map { it.first }

    println(primes.take(10).toList())
}