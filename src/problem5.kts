val range = 1..20
var number = range.endInclusive
while (true) if (range.all { number % it == 0 }) break else number++
println(number)