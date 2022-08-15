import kotlin.math.pow

class Ex2 {
    fun ex2() {
        println("Execução do exercicio abaixo:\n\n")

        print("Digite o diâmetro do círculo: ")
        val diametro = readln()
        val diametroDouble = diametro.replace(",", ".").toDouble()

        println("A area do círculo é ${"%.2f".format(area(diametroDouble))}")
        print("O perimetro do círculo é ${"%.2f".format(perimetro(diametroDouble))}")
    }

    private fun area(diametroDouble: Double): Double {
        val pi = 3.14

        return (pi * (diametroDouble.pow(2)) / 4)
    }

    private fun perimetro(diametroDouble: Double): Double {
        val pi = 3.14

        return diametroDouble * pi
    }
}