fun main(args: Array<String>) {
    println(primeSequence().takeWhile { it < 2E6 }.sum())
}