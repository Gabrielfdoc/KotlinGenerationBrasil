class Ex1 {
    fun ex1(){
        println("Execução do exercicio abaixo: \n")

        for (numeros in 1000..1999) {
            if (numeros % 11 == 5) {
                println(numeros)
            }
        }
    }
}