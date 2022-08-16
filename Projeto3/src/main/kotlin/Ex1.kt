class Ex1 {
    fun ex1() {
        println("Execução do exercicio abaixo:\n\n")

        print("Insira o primeiro valor: ")
        val numero1 = readln().toInt()
        print("Insira o segundo valor: ")
        val numero2 = readln().toInt()
        print("Insira o terceiro valor: ")
        val numero3 = readln().toInt()

        var maior = numero1

        if (maior < numero2) {
            maior = numero2
        } else if (maior < numero3) {
            maior = numero3
        }
        print("O maior valor é $maior")
    }
}