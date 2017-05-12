fun primeSequence() = generateSequence(2L) { previous ->
    var number = previous + if (previous % 2 == 0L) 1 else 2
    while (!(number > 1 && (2..Math.sqrt(number.toDouble()).toLong()).find { number % it == 0.toLong() } == null)) number += 2
    number
}