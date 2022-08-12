class Ex1 {
    fun ex1() {
        val excesso: Double
        val multa: Double
        val pesoLimite = 50.0

        println("Execução do exercicio abaixo\n\n")
        println("Insira o peso: ")
        val peso = readln()

        if (peso.toInt() > pesoLimite) {
            excesso = peso.toInt() - pesoLimite
            multa = excesso * 4
            println("A Multa foi de $multa reais")
        } else {
            println("Não há multa")
        }
    }
}