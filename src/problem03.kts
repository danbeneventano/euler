var n = 600851475143
var factor = 2
while (factor < n) {
    if(n % factor == 0L) {
        n /= factor
        factor--
    }
    factor++
}

println(factor)