val sum = 1000
val range = Math.sqrt(sum.toDouble()).toInt()..sum
for (a in range) for (b in range) for (c in range) if (a * a + b * b == c * c && a < b && b < c && a + b + c == sum) println(a * b * c)