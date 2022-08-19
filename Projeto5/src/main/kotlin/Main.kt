fun main() {

    println("1 - Exercicio 1")
    print("Escolha o exercício: ")

    when (readln()) {
        "1" -> Ex1().ex1()
        else -> {
            println("O exercício escolhido não existe!")
        }
    }
}