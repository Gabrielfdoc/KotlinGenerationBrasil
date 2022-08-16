class Ex3 {
    fun ex3() {
        println("Execução do exercicio abaixo:\n\n")

        print("Digite a idade: ")
        val idade = readln().toInt()

        if (idade >= 10 && idade <= 14) {
            println("Você está na categoria infantil!")
        } else if (idade >= 15 && idade <= 17) {
            println("Você está na categoria juvenil!")
        } else if (idade >= 18 && idade <= 25) {
            println("Você está na categoria adulto!")
        } else {
            println("A idade digitada é inválida!")
        }
    }
}