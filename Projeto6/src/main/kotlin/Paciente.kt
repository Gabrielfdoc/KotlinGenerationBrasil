class Paciente(
    val nome: String,
    val rg: String,
    val cpf: String,
    var estadoDeSaude: String,
    val idade: String,
) {

    lateinit var email: String
    lateinit var telefone: String

    constructor(
        nome: String,
        rg: String,
        cpf: String,
        estadoDeSaude: String,
        idade: String,
        email: String,
        telefone: String
    ) : this(nome, rg, cpf, estadoDeSaude, idade) {
        this.email = email
        this.telefone = telefone
    }


    fun exibeDados() {
        println("Nome: $nome")
        println("RG: $rg")
        println("CPF: $cpf")
        println("Idade: $idade")
        println("Estado de saúde: $estadoDeSaude")
        println("E-mail: $email")
        println("Telefone: $telefone")
        println()

    }

    fun alterarEmail() {
        print("Digite o novo e-mail principal: ")
        this.email = readln()
        println("E-mail alterado com sucesso!")
    }

    fun alterarTelefone() {
        print("Digite o novo telefone principal: ")
        this.telefone = readln()
        println("Telefone alterado com sucesso!")
    }

    fun alterarEstadoDeSaude() {
        print("Digite o atual estado de saúde do paciente: ")
        this.estadoDeSaude = readln()
        println("Estado de saúde atualizado com sucesso!")
    }
}