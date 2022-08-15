import java.time.LocalDate

class Ex1 {
    fun ex1() {
        println("Execução do exercicio abaixo:\n\n")
        val anoAtual = LocalDate.now().year

        print("Digite a sua idade: ")
        val idade = readln().toInt()

        print("Você já fez aniversário este ano? (s/n): ")
        val fezAniversario = readln().uppercase()

        if (converteSOuNParaBoolean(fezAniversario)) {
            println("O ano de nascimento é ${anoAtual - idade}")
        } else {
            println("O ano de nascimento é ${anoAtual - idade - 1}")
        }
    }

    private fun converteSOuNParaBoolean(sOuN: String): Boolean {
        val valorRetornado: Boolean

        if (sOuN == "S")
            valorRetornado = true
        else if (sOuN == "N")
            valorRetornado = false
        else
            throw IllegalArgumentException()

        return valorRetornado
    }
}