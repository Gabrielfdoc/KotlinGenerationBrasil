import java.time.LocalDate

class Ex1 {
    fun ex1() {
        println("Execução do exercicio abaixo:\n\n")

        print("Digite a sua idade: ")
        val idade = readln().toInt()

        print("Você já fez aniversário este ano? (s/n): ")
        val fezAniversario = readln()

        val anoAtual = LocalDate.now().year

        if (fezAniversario == "s") {
            println("O ano de nascimento é ${anoAtual - idade}")
        } else if (fezAniversario == "n") {
            println("O ano de nascimento é ${anoAtual - idade - 1}")
        }
    }
}