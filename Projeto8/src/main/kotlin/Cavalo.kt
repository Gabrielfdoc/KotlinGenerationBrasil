class Cavalo(
    nome: String,
    idade: String,
    emiteSom: Boolean
) : Animal(nome, idade, emiteSom) {

    override fun emitindoSom() {
        println()
        when((1..3).random()){
            1 -> println("$nome está relinchando!")
            2 -> println("$nome está bufando(Melhor sair de perto)!")
            3 -> println("$nome está em silêncio(Ele teve um dia difícil no trabalho e quer ficar sozinho)!")
        }
        println()
    }

    override fun locomovendo() {
        println()
        when((1..3).random()){
            1 -> println("$nome está trotando!")
            2 -> println("$nome está correndo!")
            3 -> println("$nome está parado(Porque ninguém é de ferro né?)!")
        }
        println()
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}