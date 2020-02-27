package suit

class Controller(private var callBack: CallBack) {

    private val suitJepang = mutableListOf("Gunting", "Batu", "Kertas")
    private val pembatas = "\n ----------------------"

    fun checkPemenang(player1: Int, player2: Int) {
        checkPemenang(suitJepang[player1], suitJepang[player2], false)
    }

    private fun checkPemenang(player1: String, player2: String, type: Boolean) {
        val typePlayer = if (type) {
            "Komputer"
        } else {
            "Player 2"
        }

        if (player1 == suitJepang[1] && player2 == suitJepang[0] ||
            player1 == suitJepang[0] && player2 == suitJepang[2]
        ) {
            callBack.cetakHasil("Player 1 Menang $pembatas")
        } else if (
            player1 == suitJepang[1] && player2 == suitJepang[2] ||
            player1 == suitJepang[0] && player2 == suitJepang[1]
        ) {
            callBack.cetakHasil("$typePlayer Menang $pembatas")
        } else {
            callBack.cetakHasil("Draw $pembatas")
        }
    }

    fun checkPemanangWithCOM(player1: Int) {
        checkPemenang(suitJepang[player1], suitJepang.random(), true)
    }
}