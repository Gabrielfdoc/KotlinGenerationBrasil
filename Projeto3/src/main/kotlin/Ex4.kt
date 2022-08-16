import kotlin.math.pow
import kotlin.math.sqrt

class Ex4 {
    fun ex4() {
        println("Execução do exercicio abaixo:\n\n")

        print("Digite um número: ")
        val numero = readln().toDouble()

        if (numero % 2 == 0.0) {
            println("O resultado do número elevado ao quadrado é: ${numero.pow(2)}")
        } else {
            println("O resultado da raiz quadrada do número é: ${sqrt(numero)}")
        }
    }
}