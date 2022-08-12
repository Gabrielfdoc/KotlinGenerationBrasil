fun main() {

    println("Exercicios disponiveis para escolha: ")
    println("1 - Exercicio 1 de laços condicionais")
    println("2 - Exercicio 1 do enquanto, de laços de repetição")
    println("3 - Exercicio 1 de vetores")
    println("4 - Exercicio 3 de vetores")
    print("Escolha o exercício: ")

    when (readln()) {
        "1" -> Ex1().ex1()
        "2" -> Ex2().ex2()
        "3" -> Ex3().ex3()
        "4" -> Ex4().ex4()
        else -> {
            println("O exercício escolhido não existe!")
        }
    }
}