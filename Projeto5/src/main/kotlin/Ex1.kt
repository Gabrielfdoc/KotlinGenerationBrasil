val produtos = mutableListOf<String>()

class Ex1 {
    fun ex1() {
        println("Execução do exercicio abaixo:\n")

        while (true) {

            println("1- Adicionar produto")
            println("2 - Remover produto")
            println("3 - Atualizar produto")
            println("4 - Ver produtos")
            println("5 - Sair")

            when (readln()) {
                "1" -> subMenuAdicionar()
                "2" -> subMenuRemover()
                "3" -> subMenuAtualizaDados()
                "4" -> mostraDados()
                "5" -> break
                else -> println("A opção escolhida não existe!\n")
            }
        }
    }
}

private fun subMenuAdicionar() {

    armazenaProdutos()
    while (true) {

        println("1- Se deseja adicionar um novo produto")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> armazenaProdutos()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun armazenaProdutos() {

    println("Digite um produto: ")
    val produto = readln()

    if (produto.isNotEmpty()) {
        produtos.add(produto)
        println("Produto adicionado com sucesso\n")
    } else {
        println("O produto digitado é inválido!\n")
    }
}

private fun subMenuRemover() {

    removeProdutos()
    while (true) {

        println("1- Se deseja remover um produto")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> removeProdutos()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun removeProdutos() {

        println("Veja os produtos disponiveis e em seguida digite um produto para ser removido: ")
        println(produtos)
        val produtoDeletado = readln()

        if (produtos.contains(produtoDeletado)) {
            produtos.remove(produtoDeletado)
            println("$produtoDeletado excluído com sucesso!\n")
        } else {
            println("O produto $produtoDeletado não está no estoque!\n")
        }
}

private fun subMenuAtualizaDados() {

    atualizaDados()
    while (true) {

        println("1- Se deseja atualizar um produto")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> atualizaDados()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun atualizaDados() {

    println("Verifique a lista de produtos e em seguida insira um produto que deseja atualizar: ")
    println(produtos)
    val produtoAtualizado = readln()

    if (produtos.contains(produtoAtualizado)) {
        val index = produtos.indexOf(produtoAtualizado)
        println("Digite o novo nome do produto: ")
        produtos[index] = readln()
        println("Produto atualizado com sucesso!")
    } else {
        println("O produto $produtoAtualizado não existe na lista!\n")
    }
}

private fun mostraDados() {
    println("\nOs produtos disponíveis são: $produtos\n")
}