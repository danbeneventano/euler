val sequence = generateSequence(1L) { it + 1 }.map { it * (it + 1) / 2 }

fun primeFactors(n: Long): List<Long> {
    val prime = (2..Math.sqrt(n.toDouble()).toInt()).find { n % it == 0.toLong() }
    return if (prime == null) listOf(n) else listOf(prime.toLong()) + primeFactors(n / prime)
}

println(sequence.first { primeFactors(it).groupBy { it }.map { it.value.size + 1 }.fold(1){a, b -> a * b} > 500 })