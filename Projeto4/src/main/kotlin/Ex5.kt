class Ex5 {
    fun ex5() {
        println("Execução do exercicio abaixo: \n")

        var soma = 0

        do {
            print("Digite um número diferente de 0, ao digitar 0 o programa será encerrado e a soma total exibida: ")
            val num = readln().toInt()
            soma += num

        } while (num != 0)

        println("A soma dos números digitados é: $soma")
    }
}