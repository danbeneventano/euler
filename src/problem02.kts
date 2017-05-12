import kotlin.coroutines.experimental.buildSequence

val fibonacci = buildSequence {
    yield(1)
    var cur = 1
    var next = 1
    while (true) {
        yield(next)
        val tmp = cur + next
        cur = next
        next = tmp
    }
}

println(fibonacci.takeWhile { it <= 4E6 }.filter { it % 2 == 0 }.sum())