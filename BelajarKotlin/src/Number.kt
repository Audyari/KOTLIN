fun main() {
    var age: Byte = 10
    var height: Int = 170
    var distance: Short = 2000
    var valance: Long = 100000000L

    println(age)
    println(height)
    println(distance)
    println(valance)

    var valve: Float = 98.98F
    var radius: Double = 2342342343.54535

    println(valve)
    println(radius)

    // literals
    var decimalliteral: Int = 100
    var hexadecinalliteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println(decimalliteral)
    println(hexadecinalliteral)
    println(binaryLiteral)

    // underscore in number |
    var age1: Byte = 3_0
    var height1: Int = 1_7_0
    var distance1: Short = 2_860
    var balance: Long = 180_680_086L

    println(age1)
    println(height1)
    println(distance1)
    println(balance)


    var number: Int = 100
    // conversion |
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println("test conversi ke double : " + double)
}