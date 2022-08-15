class Ex2 {
    fun ex2() {
        println("Execução do exercicio abaixo:\n\n")

        print("Digite o diâmetro do círculo: ")
        val diametro = readln().toDouble()

        val pi = 3.14

        println("A area do círculo é ${pi * (diametro * diametro) / 4}")
        print("O perimetro do círculo é ${diametro * pi}")
    }
}