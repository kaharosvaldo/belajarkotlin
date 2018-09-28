    for (i in 1..100)
        when (i % 2){
        1 -> println(i)
        0 -> if (i % 10 == 0)
         println("$i angka kelipatan 10")
        else
         println("$i angka genap")
        }