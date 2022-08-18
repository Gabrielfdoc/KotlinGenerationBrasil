class Ex2 {
    fun ex2() {
        val resultado: Int

        println("Digite dois números: ")
        val n1 = readln().toInt()
        val n2 = readln().toInt()

        println("Escolha a operação a ser realizada: ")
        println("1 - Soma")
        println("2 - Subtração")
        println("3 - Divisão")
        println("4 - Multiplicação")

        when (readln()) {
            "1" -> {
                    resultado = soma(n1, n2)
                    println("\nO resultado da soma é $resultado")
            }
            "2" -> {
                    resultado = subtracao(n1, n2)
                    println("\nO resultado da subtração é $resultado")
            }
            "3" -> {
                    resultado = divisao(n1, n2)
                    println("\nO resultado da divisão é $resultado")
            }
            "4" -> {
                    resultado = multiplicacao(n1, n2)
                    println("\nO resultado da multiplicação é $resultado")
            }
            else -> {
                println("\nA operação escolhida não existe!")
            }
        }
    }
}

private fun soma(n1: Int, n2: Int): Int {
    return n1 + n2
}

private fun subtracao(n1: Int, n2: Int): Int {
    return n1 - n2
}

private fun multiplicacao(n1: Int, n2: Int): Int {
    return n1 * n2
}

private fun divisao(n1: Int, n2: Int): Int {
    return n1 / n2
}