class Cliente(
    val nome: String,
    val endereco: String,
    val telefone: String,

    ) {

    private val _listaDeCompras = mutableListOf<String>()
    val listaDeCompras: List<String> = _listaDeCompras

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
        _listaDeCompras.forEach {
            println(it)
        }
    }

    fun adicionarProduto(produto: String) {

        if (produto.isNotBlank()) {
            _listaDeCompras.add(produto)
            println("Produto adicionado com sucesso!\n")
        } else {
            println("O produto digitado é inválido!\n")
        }
    }

    fun removerProduto() {

        println("Veja os produtos disponiveis e em seguida digite um produto para ser removido: ")
        println(_listaDeCompras)
        val produtoDeletado = readln()

        if (_listaDeCompras.contains(produtoDeletado)) {
            _listaDeCompras.remove(produtoDeletado)
            println("$produtoDeletado excluído com sucesso!\n")
        } else {
            println("O produto $produtoDeletado não está no estoque!\n")
        }
    }

    private fun checarNome() {
        if (nome.isNotBlank()) {
            println("\nCliente cadastrado com sucesso!\n")
        } else {
            throw Exception("O nome não pode estar em branco!")
        }
    }
}