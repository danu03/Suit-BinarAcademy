package oop

open class Mobil {
    var nama: String? = null
    var merk: String? = null
    var kecepatanMax: String? = null
    var jumlahPenumpang: String? = null

    constructor(nama: String = "", merk: String = "", kecepatanMax: String = "", jumlahPenumpang: String = "") {
        this.nama = nama
        this.merk = merk
        this.kecepatanMax = kecepatanMax
        this.jumlahPenumpang = jumlahPenumpang
    }

    open fun tambahKecepatan() {
        println("tambahKecepatan punya super mobil class")
    }

    fun kurangiKecepatan() {

    }

    fun gantiTransmisi() {

    }

    fun belokKiri() {

    }

    fun belokKanan() {

    }
}