package suit

fun showMenu() {
    println("1. Vs Player2")
    println("2. Vs COM")
    println("3. Exit")
    print("Masukan Mode : ")
}

fun showMenuModeCOM() {
    println("---------------------")
    println("Anda di Mode Vs COM")
    println("1. Gunting")
    println("2. Batu")
    println("3. Kertas")
}

fun showMenuModeVsPlayer() {
    println("---------------------")
    println("Anda di Mode Vs Player2")
    println("1. Gunting")
    println("2. Batu")
    println("3. Kertas")
}

fun inputPlayer(player: Int): Int? {
    print("Masukan Pilihan Player $player : ")
    val index = readLine()?.toInt()
    return index?.checkInputan(player)
}

private fun Int.checkInputan(player: Int): Int {
    val index = this
    if (index >= 4 || index <= 0) {
        println("Pilihan Tidak Tersedia")
        return inputPlayer(player)!!
    }
    return index
}