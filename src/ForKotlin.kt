class ForKotlin {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var namaList = listOf(1, "a", 2)

            println("ini for ke pertama")
            // ini for pertama
            for (i in namaList) {
                println(i)
            }

            println("ini for ke kedua")
            // ini for kedua
            for (i in 0..2) {
                println(namaList[i])
            }

            println("ini for gagal")
            //ini for experiment yang dua
            for (i in 2..0) {
                println(namaList[i])
            } // failed

            println("ini for ke tiga")
            //ini for ke tiga
            for (i in 2 downTo 0) {
                println(namaList[i])
            }

            println("ini for ke empat")
            for (i in 0..2 step 2) {
                println(namaList[i])
            }

            println("ini for ke lima")
            for ((i, v) in namaList.withIndex()) {
                println("Index $i")
                println("Value $v")
            }

            println("ini for ke enam")
            namaList.forEachIndexed(action = { index, value ->
                println("Index $index")
                println("Value $value")
            })

            println("ini for ke tujuh")
            namaList.forEachIndexed { index, value ->
                println("Index $index")
                println("Value $value")
            }
        }
    }
}