

fun main() {

    println(aplicarOperacion(5, ::cuadrado))


    val doble = { num: Int -> num * 2 }
    println(aplicarOperacion(5, doble))


    println(aplicarOperacion(10) { it + 3 })
}
fun aplicarOperacion(numero: Int, operacion: (Int) -> Int): Int {
    return operacion(numero)
}

fun cuadrado(numero: Int): Int {
    return numero * numero
}


