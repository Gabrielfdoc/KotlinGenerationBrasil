fun main() {

    println("1 - Exercicio 1")
    println("2 - Exercicio 2")
    print("Escolha o exercício: ")

    when (readln()) {
        "1" -> Ex1().ex1()
        "2" -> Ex2().ex2()
        else -> {
            println("O exercício escolhido não existe!")
        }
    }
}