class Preguica(
    nome: String,
    idade: String,
    emiteSom: Boolean
) : Animal(nome, idade, emiteSom) {

    override fun emitindoSom() {
        println()
        println("$nome está emitindo som desconhecido")
        println()
    }

    override fun locomovendo() {
        println()
        println("$nome está subindo em uma árvore")
        println()
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}