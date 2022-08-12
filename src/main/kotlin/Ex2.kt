import java.util.Scanner

class Ex2 {
    fun ex2() {
        val scanner = Scanner(System.`in`)
        var numeroLido: Int
        var contador = 0
        var soma = 0
        var media = 0

        println("Execução do exercicio abaixo\n\n")
        println("Digite um número positivo ou o programa será encerrado: ")
        numeroLido = scanner.nextInt()

        if (numeroLido < 0)
            return

        while (numeroLido >= 0) {
            contador++
            soma += numeroLido
            println("Digite um número positivo ou o programa será encerrado: ")
            numeroLido = scanner.nextInt()
            media = soma / contador
        }
        println("O total de números lidos é $contador")
        println("A somatória dos números lidos é $soma")
        println("A média dos números lidos é $media")
    }
}