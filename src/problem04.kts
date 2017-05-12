var n = 0

for(i in 100..999) {
    for(j in 100..999) {
        if(i*j > n){
            val m = (i*j).toString()
            if(m == m.reversed()) n = i*j
        }
    }
}
println(n)