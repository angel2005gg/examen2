fun main() {
    val rectangulo = Rectangulo(5.0, 3.0)
    println("Área del rectángulo: ${rectangulo.calcularArea()}")
    val circulo = Circulo(4.0)
    println("Área del círculo: ${circulo.calcularArea()}")
}

abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
}


class Rectangulo(val ancho: Double, val alto: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return ancho * alto
    }
}


class Circulo(val radio: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}

