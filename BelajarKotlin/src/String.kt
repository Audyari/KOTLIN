fun main() {
    var firstName: String = "Audyari"
    var lastName: String = "Wiyono"
    var fullName: String = firstName + " " + lastName
    var fullName1: String = " $firstName $lastName "
    var desc: String = " Nama Panjang Saya $fullName Dan Panjang Karakter Nya ${fullName.length}"
    var address: String = """
        Jalan Pangkalan jati V
        Rt 011 Rw 05 No 66
        Jakarta Timur
    """

    println(firstName)
    println(lastName)
    println(fullName)
    println(fullName1)
    println(desc)
    println(address)

    var address1: String = """ 
        |Street Not Yet Done, 
        |Province Subang 
    """.trimMargin()

    var address2: String = """ 
        >Street Not Yet Done, 
        >Province Subang 
    """.trimMargin(">")

    println(address1)
    println()
    println(address2)

}