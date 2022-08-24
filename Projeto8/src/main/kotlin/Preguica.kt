class Preguica(
    nome: String,
    idade: String,
    emiteSom: Boolean
) : Animal(nome, idade, emiteSom) {

    override fun emitindoSom() {
        println()
        when((1..2).random()) {
            1 -> println("$nome está emitindo um som desconhecido!")
            2 -> println("$nome está em completo silêncio(Momento instrospectivo?!).")
        }
        println()
    }

    override fun locomovendo() {
        println()
        when((1..3).random()){
            1 -> println("$nome está subindo em uma árvore!")
            2 -> println("$nome está parado curtindo uma preguicinha.")
            3 -> println("$nome está caminhando lentamente(Até mesmo para os padrões de uma preguiça)!")
        }
        println()
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}