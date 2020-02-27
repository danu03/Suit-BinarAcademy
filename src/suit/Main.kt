package suit

class Main {
    companion object : CallBack {
        @JvmStatic
        fun main(args: Array<String>) {
            val controller = Controller(this)
            do {
                showMenu()
                val inputMenu = readLine()
                val mode = inputMenu?.toInt()
                when (mode) {
                    1 -> {
                        showMenuModeVsPlayer()
                        val pilPlayer1 = inputPlayer(1)?.minus(1)
                        val pilPlayer2 = inputPlayer(2)?.minus(1)
                        controller.checkPemenang(pilPlayer1!!, pilPlayer2!!)
                    }
                    2 -> {
                        showMenuModeCOM()
                        val pilPlayer1 = inputPlayer(1)?.minus(1)
                        controller.checkPemanangWithCOM(pilPlayer1!!)
                    }
                    3 -> {
                        println("Exit Game")
                    }
                }
            } while (mode != 3)
        }

        override fun cetakHasil(hasil: String) {
            println(hasil)
        }
    }
}