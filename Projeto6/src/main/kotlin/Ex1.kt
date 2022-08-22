val clientes = mutableListOf<Cliente>()

class Ex1 {
    fun ex1() {

        println("Execução do exercicio abaixo: \n\n")

        while (true) {

            println("1 - Cadastrar dados de um novo cliente")
            println("2 - Atualizar e-mail de um cliente existente")
            println("3 - Atualizar telefone de um cliente existente")
            println("4 - Exibir dados de um cliente existente")
            println("5 - Sair")

            when (readln()) {
                "1" -> subMenuCadastrarClientes()
                "2" -> subMenuAtualizarEmail()
                "3" -> subMenuAtualizarTelefone()
                "4" -> {
                    var contador = 0
                    for (cliente in clientes) {
                        contador++
                        println("Cliente $contador: ")
                        cliente.exibeDados()
                    }
                }
                "5" -> break
                else -> println("A opção escolhida não existe!")
            }
        }
    }

    private fun exibeClientesParaAtualizacao() {
        for (cliente in clientes) {
            println("Nome: ${cliente.nome}")
        }
    }

    private fun cadastrarCliente() {

        print("Digite o seu nome: ")
        val nome = readln()
        print("Digite o seu RG: ")
        val rg = readln()
        print("Digite o seu CPF: ")
        val cpf = readln()
        print("Digite o seu e-mail: ")
        val email = readln()
        print("Digite a sua idade: ")
        val idade = readln()
        print("Digite o seu telefone: ")
        val telefone = readln()
        print("Digite um e-mail adicional: ")
        val emailAdicional = readln()
        print("Digite um telefone fixo: ")
        val telefoneFixo = readln()

        val cliente = Cliente(
            nome,
            rg,
            cpf,
            email,
            idade,
            telefone,
            emailAdicional,
            telefoneFixo
        )

        if (cliente.nome.isNotBlank()) {
            clientes.add(cliente)
            println("Cliente adicionado com sucesso\n")
        } else {
            println("O nome para o cliente digitado é inválido!\n")
        }
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


    private fun subMenuAtualizarEmail() {

        atualizarEmail()
        while (true) {

            println("1 - Se deseja alterar o email de outro cliente")
            println("2 - Se deseja sair")

            when (readln()) {
                "1" -> atualizarEmail()
                "2" -> break
                else -> println("A opção escolhida não existe!\n")
            }
        }
    }

    private fun atualizarEmail() {
        exibeClientesParaAtualizacao()

        print("Insira o nome do cliente que deseja alterar o e-mail: ")
        val nomeClienteAtualizacao = readln()

        val clienteAtualizacao: Cliente? = clientes.firstOrNull { cliente -> cliente.nome == nomeClienteAtualizacao }

        if (clienteAtualizacao != null) {
            clienteAtualizacao.alterarEmail()
        } else {
            println("Cliente não existe!")
        }
    }

    private fun subMenuAtualizarTelefone() {

        atualizarTelefone()
        while (true) {

            println("1 - Se deseja alterar o telefone de outro cliente")
            println("2 - Se deseja sair")

            when (readln()) {
                "1" -> atualizarEmail()
                "2" -> break
                else -> println("A opção escolhida não existe!\n")
            }
        }
    }

    private fun atualizarTelefone() {
        exibeClientesParaAtualizacao()

        print("Insira o nome do cliente que deseja alterar o telefone: ")
        val nomeClienteAtualizacao = readln()

        val clienteAtualizacao: Cliente? = clientes.firstOrNull { cliente -> cliente.nome == nomeClienteAtualizacao }

        if (clienteAtualizacao != null) {
            clienteAtualizacao.alterarTelefone()
        } else {
            println("Cliente não existe!")
        }
    }
}