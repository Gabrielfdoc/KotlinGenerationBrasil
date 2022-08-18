fun main() {

    println("1 - Exercicio 1")
    println("2 - Exercicio 2")
    println("3 - Exercicio 3")
    print("Escolha o exercício: ")

    when (readln()) {
        "1" -> Ex1().ex1()
        "2" -> Ex2().ex2()
        "3" -> Ex3().ex3()
        else -> {
            println("O exercício escolhido não existe!")
        }
    }
}