val clientes = mutableListOf<Cliente>()

class Ex1 {
    fun ex1() {

        println("Execução do exercicio abaixo: \n\n")

        try {

            while (true) {

                println()
                println("1 - Cadastrar dados de um novo cliente")
                println("2 - Adicionar item a lista de compras de um cliente existente")
                println("3 - Remover itens da lista de compras de um cliente existente")
                println("4 - Exibir dados de todos os clientes existentes")
                println("5 - Exibir lista de compras de um cliente existente")
                println("6 - Sair")

                when (readln()) {
                    "1" -> subMenuCadastrarClientes()
                    "2" -> subMenuAdicionarProduto()
                    "3" -> subMenuRemoverProduto()
                    "4" -> {
                        var contador = 0
                        for (cliente in clientes) {
                            contador++
                            println("Cliente $contador: ")
                            cliente.exibeDados()
                        }
                    }
                    "5" -> subMenuExibirListaDeCompras()
                    "6" -> break
                    else -> println("A opção escolhida não existe!")
                }
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }
}

private fun exibeClientesParaAtualizacao() {
    clientes.forEach { cliente ->
        println("Nome: ${cliente.nome}")
    }
}

private fun cadastrarCliente() {

    println()
    print("Digite o seu nome: ")
    val nome = readln()
    print("Digite o seu RG: ")
    val endereco = readln()
    print("Digite o seu telefone: ")
    val telefone = readln()


    val cliente = Cliente(
        nome,
        endereco,
        telefone
    )
    clientes.add(cliente)
}

private fun subMenuCadastrarClientes() {

    cadastrarCliente()
    while (true) {

        println("1 - Se deseja adicionar um novo cliente")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> cadastrarCliente()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}


private fun subMenuAdicionarProduto() {

    adicionarProduto()
    while (true) {

        println("1 - Se deseja adicionar um produto a lista de compras de outro cliente")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> adicionarProduto()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun adicionarProduto() {

    exibeClientesParaAtualizacao()

    print("Insira o nome do cliente que deseja adicionar um produto a lista de compras: ")
    val nomeClienteAtualizacao = readln()

    val clienteAtualizacao: Cliente? = clientes.firstOrNull { cliente -> cliente.nome == nomeClienteAtualizacao }

    if (clienteAtualizacao != null) {
        print("Digite um produto: ")
        val produto = readln()
        clienteAtualizacao.adicionarProduto(produto)
    } else {
        println("Cliente não existe!")
    }
}

private fun subMenuRemoverProduto() {

    removerProduto()
    while (true) {

        println("1 - Se deseja remover o produto da lista de compras de outro cliente")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> removerProduto()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

fun removerProduto() {
    exibeClientesParaAtualizacao()

    print("Insira o nome do cliente que deseja remover um produto da lista de compras: ")
    val nomeClienteAtualizacao = readln()

    val clienteAtualizacao: Cliente? = clientes.firstOrNull { cliente -> cliente.nome == nomeClienteAtualizacao }

    if (clienteAtualizacao != null) {
        clienteAtualizacao.removerProduto()
    } else {
        println("Cliente não existe!")
    }
}

private fun subMenuExibirListaDeCompras() {

    exibeListaDeCompras()
    while (true) {

        println()
        println("1 - Se deseja ver a lista de compras de outro cliente")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> exibeListaDeCompras()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun exibeListaDeCompras() {
    exibeClientesParaAtualizacao()

    print("Insira o nome do cliente que deseja ver a lista de compras: ")
    val nomeClienteAtualizacao = readln()

    val clienteAtualizacao: Cliente? = clientes.firstOrNull { cliente -> cliente.nome == nomeClienteAtualizacao }

    if (clienteAtualizacao != null) {
        clienteAtualizacao.exibirListaDeCompras()
    } else {
        println("Cliente não existe!")
    }
}


