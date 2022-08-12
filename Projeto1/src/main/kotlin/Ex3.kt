class Ex3 {
    fun ex3() {
        var notas = DoubleArray(5)
        val maiorNota: Double

        println("Execução do exercicio abaixo\n\n")

        for (index in notas.indices) {
            println("Digite uma nota: ")
            val notaLida = readln()
            notas[index] = notaLida.toDouble()
        }

        notas.forEach { nota ->
            println("Nota: $nota")
        }

        maiorNota = notas.maxOf { nota: Double -> nota }
        println("A maior nota foi $maiorNota")
    }
}