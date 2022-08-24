class Cachorro(
    nome: String,
    idade: String,
    emiteSom: Boolean
) : Animal(nome, idade, emiteSom) {

    override fun emitindoSom() {
        println()
        when((1..3).random()){
            1 -> println("$nome está latindo!")
            2 -> println("$nome está rosnando(Apenas sorria e acene).")
            3 -> println("$nome está absorto em silêncio contemplando mais uma de suas crises existenciais.")
        }
        println()
    }

    override fun locomovendo() {
        println()
        when((1..3).random()){
            1 -> println("$nome está correndo!")
            2 -> println("$nome está parado(E te olhando com um olhar de quem parece te julgar eu diria).")
            3 -> println("$nome está caminhando tranquilamente(Com uma passada bem estilosa)!")
        }
        println()
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}