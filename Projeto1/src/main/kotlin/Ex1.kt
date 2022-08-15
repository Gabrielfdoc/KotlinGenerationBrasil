class Ex1 {
    fun ex1() {
        val pesoLimite = 50.0

        println("Execução do exercicio abaixo\n\n")
        println("Insira o peso: ")
        val peso = readln()

        if (peso.toInt() > pesoLimite) {
            val excesso: Double = peso.toInt() - pesoLimite
            val multa: Double = excesso * 4
            println("A Multa foi de $multa reais")
        } else {
            println("Não há multa")
        }
    }
}