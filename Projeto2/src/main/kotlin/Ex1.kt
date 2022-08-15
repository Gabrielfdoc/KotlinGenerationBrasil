class Ex1 {
    fun ex1() {
        println("Execução do exercicio abaixo:\n\n")

        print("Digite a sua idade: ")
        val idade = readln().toInt()

        print("Você já fez aniversário este ano? Utilize apenas SIM ou NÃO: ")
        val aniversario = readln()

        if (aniversario == "SIM") {
            println("O ano de nascimento é ${2022 - idade}")
        } else if (aniversario == "NÃO") {
            println("O ano de nascimento é ${2022 - idade - 1}")
        }
    }
}