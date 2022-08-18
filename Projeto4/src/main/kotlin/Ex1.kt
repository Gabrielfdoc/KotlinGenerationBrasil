class Ex1 {
    fun ex1() {
        println("Execução do exercicio abaixo: \n")

        for (numero in 1000..1999) {
            if (numero % 11 == 5) {
                println(numero)
            }
        }
    }
}