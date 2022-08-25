class Cliente(
    val nome: String,
    val endereco: String,
    val telefone: String
    ) {

    private val listaDeCompras = mutableListOf<String>()

    init {
        checarNome()
    }

    fun exibeDados() {
        println("Nome: $nome")
        println("Endereço: $endereco")
        println("Telefone: $telefone")
        println()

    }

    fun exibirListaDeCompras() {
        println("***Lista de Compras***\n")
        listaDeCompras.forEach { produto ->
            println(produto)
        }
    }

    fun adicionarProduto(produto: String) {

        if (produto.isNotBlank()) {
            listaDeCompras.add(produto)
            println("$produto adicionado com sucesso!\n")
        } else {
            println("O produto digitado é inválido!\n")
        }
    }

    fun removerProduto() {

        println("Veja os produtos disponiveis e em seguida digite um produto para ser removido: ")
        println(listaDeCompras)
        val produtoDeletado = readln()

        if (listaDeCompras.contains(produtoDeletado)) {
            listaDeCompras.remove(produtoDeletado)
            println("$produtoDeletado excluído com sucesso!\n")
        } else {
            println("O produto $produtoDeletado não está na sua lista de compras!\n")
        }
    }
    fun getListaDeCompras(): MutableList<String> {
        return this.listaDeCompras
    }

    private fun checarNome() {
        if (nome.isNotBlank()) {
            println("\nCliente cadastrado com sucesso!\n")
        } else {
            throw IllegalArgumentException("O nome não pode estar em branco!")
        }
    }
}