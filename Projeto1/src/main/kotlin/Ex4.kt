class Ex4 {
    fun ex4() {
        val matrizA = Array(4) { IntArray(6) }
        val matrizB = Array(4) { IntArray(6) }
        val matrizSoma = Array(4) { IntArray(6) }
        val matrizDiferenca = Array(4) { IntArray(6) }

        println("----------Matriz A------------------")

        for (linha in matrizA.indices) {
            for (coluna in matrizA[linha].indices) {
                matrizA[linha][coluna] = (11..20).random()
                print("${matrizA[linha][coluna]}  ")
            }
            println()
        }

        println("----------Matriz B------------------")
        for (linha in matrizB.indices) {
            for (coluna in matrizB[linha].indices) {
                matrizB[linha][coluna] = (0..10).random()
                if (matrizB[linha][coluna] < 10)
                    print(0)
                print("${matrizB[linha][coluna]}  ")
            }
            println()
        }

        println("----------Matriz Soma------------------")
        for (linha in matrizSoma.indices) {
            for (coluna in matrizSoma[linha].indices) {
                matrizSoma[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna]
                if (matrizSoma[linha][coluna] < 10)
                    print(0)
                print("${matrizSoma[linha][coluna]}  ")
            }
            println()
        }

        println("----------Matriz Diferença------------------")
        for (linha in matrizDiferenca.indices) {
            for (coluna in matrizDiferenca[linha].indices) {
                matrizDiferenca[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna]
                if (matrizDiferenca[linha][coluna] < 10)
                    print(0)
                print("${matrizDiferenca[linha][coluna]}  ")
            }
            println()
        }
    }
}