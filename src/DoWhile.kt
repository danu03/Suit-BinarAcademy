fun main(arg: Array<String>) {

    val nama = mutableListOf("nama", 10, false)

    // kalo while dia ngecheck terlebih dahulu
    var currentIndex = 2
    while (currentIndex >= 0) {
        // ini adalah body
        println(nama[currentIndex])
        currentIndex--
    }

    // kalo do while bodynya dulu dijalankan sekali baru ngecheck
    do { // ini adalah body
        currentIndex++
        println(nama[currentIndex])
    } while (currentIndex < 2)
}