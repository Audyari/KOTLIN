const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    var nama: String = "Audyari"
    nama = "ASEP"

    println(nama)

    val nama2: String = "ASIK SO"
    val nama3 = 30

    println(nama)

    var dataKosong: String? = null

    println(dataKosong)
    println(dataKosong?.length)

    println("Welocome to  $APP dan Version $VERSION")

}