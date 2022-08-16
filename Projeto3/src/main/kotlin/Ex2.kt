class Ex2 {
    fun ex2() {
        println("Execução do exercicio abaixo:\n\n")

        print("Insira o primeiro valor: ")
        var numero1 = readln().toInt()
        print("Insira o segundo valor: ")
        var numero2 = readln().toInt()
        print("Insira o terceiro valor: ")
        var numero3 = readln().toInt()
        var aux: Int

        if (numero3 > numero2) {

            aux = numero3
            numero3 = numero2
            numero2 = aux

        }

        if (numero2 > numero1) {

            aux = numero2
            numero2 = numero1
            numero1 = aux

        }

        if (numero3 > numero2) {

            aux = numero3
            numero3 = numero2
            numero2 = aux

        }
        println("A ordem crescente dos números é $numero3, $numero2, $numero1")
    }
}