import kotlin.math.pow

class Ex2 {
    fun ex2() {
        println("Execução do exercicio abaixo:\n\n")

        print("Digite o diâmetro do círculo: ")
        val diametro = readln().toDouble()

        val pi = 3.14

        println("A area do círculo é ${"%.2f".format(pi * (diametro.pow(2)) / 4)}")
        print("O perimetro do círculo é ${"%.2f".format(diametro * pi)}")
    }
}