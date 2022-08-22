val pacientes = mutableListOf<Paciente>()

class Ex2 {
    fun ex2() {

        println("Execução do exercicio abaixo: \n\n")

        while (true) {

            println("1 - Cadastrar dados de um novo paciente")
            println("2 - Atualizar e-mail de um paciente existente")
            println("3 - Atualizar telefone de um paciente existente")
            println("4 - Atualizar estado de saúde de um paciente existente")
            println("5 - Exibir dados de um paciente existente")
            println("6 - Sair")

            when (readln()) {
                "1" -> subMenuCadastrarPacientes()
                "2" -> subMenuAtualizarEmail()
                "3" -> subMenuAtualizarTelefone()
                "4" -> subMenuAtualizarEstadoDeSaude()
                "5" -> {
                    var contador = 0
                    for (paciente in pacientes) {
                        contador++
                        println("Paciente $contador: ")
                        paciente.exibeDados()
                    }
                }
                "6" -> break
                else -> println("A opção escolhida não existe!")
            }
        }
    }

    private fun exibePacientesParaAtualizacao() {
        for (paciente in pacientes) {
            println("Nome: ${paciente.nome}")
        }
    }

    private fun cadastrarPacientes() {

        print("Digite o nome do paciente: ")
        val nome = readln()
        print("Digite o RG: ")
        val rg = readln()
        print("Digite o CPF: ")
        val cpf = readln()
        print("Digite o estado de saúde do paciente: ")
        val estadoDeSaude = readln()
        print("Digite a idade: ")
        val idade = readln()
        print("Digite o e-mail: ")
        val email = readln()
        print("Digite o seu telefone: ")
        val telefone = readln()

        val paciente = Paciente(
            nome,
            rg,
            cpf,
            estadoDeSaude,
            idade,
            email,
            telefone,
        )

        if (paciente.nome.isNotBlank()) {
            pacientes.add(paciente)
            println("Paciente adicionado com sucesso\n")
        } else {
            println("O nome para o paciente digitado é inválido!\n")
        }
    }

    private fun subMenuCadastrarPacientes() {

        cadastrarPacientes()
        while (true) {

            println("1 - Se deseja adicionar um novo paciente")
            println("2 - Se deseja sair")

            when (readln()) {
                "1" -> cadastrarPacientes()
                "2" -> break
                else -> println("A opção escolhida não existe!\n")
            }
        }
    }


    private fun subMenuAtualizarEmail() {

        atualizarEmail()
        while (true) {

            println("1 - Se deseja alterar o email de outro paciente")
            println("2 - Se deseja sair")

            when (readln()) {
                "1" -> atualizarEmail()
                "2" -> break
                else -> println("A opção escolhida não existe!\n")
            }
        }
    }

    private fun atualizarEmail() {
        exibePacientesParaAtualizacao()

        print("Insira o nome do paciente que deseja alterar o e-mail: ")
        val nomePacienteAtualizacao = readln()

        val pacienteAtualizacao: Paciente? = pacientes.firstOrNull { paciente ->
            paciente.nome == nomePacienteAtualizacao
        }

        if (pacienteAtualizacao != null) {
            pacienteAtualizacao.alterarEmail()
        } else {
            println("Paciente não existe!")
        }
    }

    private fun subMenuAtualizarTelefone() {

        atualizarTelefone()
        while (true) {

            println("1 - Se deseja alterar o telefone de outro paciente")
            println("2 - Se deseja sair")

            when (readln()) {
                "1" -> atualizarEmail()
                "2" -> break
                else -> println("A opção escolhida não existe!\n")
            }
        }
    }

    private fun atualizarTelefone() {
        exibePacientesParaAtualizacao()

        print("Insira o nome do paciente que deseja alterar o telefone: ")
        val nomePacienteAtualizacao = readln()

        val pacienteAtualizacao: Paciente? = pacientes.firstOrNull { paciente ->
            paciente.nome == nomePacienteAtualizacao
        }

        if (pacienteAtualizacao != null) {
            pacienteAtualizacao.alterarTelefone()
        } else {
            println("Paciente não existe!")
        }
    }

    private fun subMenuAtualizarEstadoDeSaude() {

        atualizarEstadoDeSaude()
        while (true) {

            println("1 - Se deseja alterar o estado de saúde de outro paciente")
            println("2 - Se deseja sair")

            when (readln()) {
                "1" -> atualizarEstadoDeSaude()
                "2" -> break
                else -> println("A opção escolhida não existe!\n")
            }
        }
    }

    private fun atualizarEstadoDeSaude() {
        exibePacientesParaAtualizacao()

        print("Insira o nome do paciente que deseja alterar o estado de saúde: ")
        val nomePacienteAtualizacao = readln()

        val pacienteAtualizacao: Paciente? = pacientes.firstOrNull { paciente ->
            paciente.nome == nomePacienteAtualizacao
        }

        if (pacienteAtualizacao != null) {
            pacienteAtualizacao.alterarEstadoDeSaude()
        } else {
            println("Paciente não existe!")
        }
    }
}