import kotlin.math.pow

class Ex2 {
    fun ex2() {
        println("Execução do exercicio abaixo:\n\n")

        print("Digite o diâmetro do círculo: ")
        val diametro = readln()
        val diametroDouble = diametro.replace(",", ".").toDouble()

        println("A area do círculo é ${"%.2f".format(calculoArea(diametroDouble))}")
        print("O perimetro do círculo é ${"%.2f".format(calculoPerimetro(diametroDouble))}")
    }

    private fun calculoArea(diametroDouble: Double): Double {
        val pi = 3.14

        return (pi * (diametroDouble.pow(2)) / 4)
    }

    private fun calculoPerimetro(diametroDouble: Double): Double {
        val pi = 3.14

        return diametroDouble * pi
    }
}