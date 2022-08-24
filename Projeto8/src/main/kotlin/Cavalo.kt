class Cavalo(
    nome: String,
    idade: String,
    emiteSom: Boolean
) : Animal(nome, idade, emiteSom) {

    override fun emitindoSom() {
        println()
        println("$nome está relinchando")
        println()
    }

    override fun locomovendo() {
        println()
        println("$nome está trotando")
        println()
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}