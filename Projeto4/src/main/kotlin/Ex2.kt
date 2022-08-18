class Ex2 {
    fun ex2() {
        println("Execução do exercicio abaixo: \n")

        var par = 0

        for (i in 1..10) {

            print("Digite um número: ")
            val numero = readln().toInt()

            if (numero % 2 == 0)
                par += 1
        }
        println("Existe um total de $par números pares.")
        println("Existe um total de ${10 - par} números impares")
    }
}