class Cliente(
    val nome: String,
    val rg: String,
    val cpf: String,
    var email: String,
    val idade: String,
    var telefone: String
) {

    lateinit var emailAdicional: String
    lateinit var telefoneFixo: String

    constructor(
        nome: String,
        rg: String,
        cpf: String,
        email: String,
        idade: String,
        telefone: String,
        emailAdicional: String,
        telefoneFixo: String
    ) : this(nome, rg, cpf, email, idade, telefone) {
        this.emailAdicional = emailAdicional
        this.telefoneFixo = telefoneFixo
    }

    fun exibeDados() {
        println("Nome: $nome")
        println("RG: $rg")
        println("CPF: $cpf")
        println("E-mail: $email")
        println("Idade: $idade")
        println("Telefone: $telefone")
        println("E-mail adicional: $emailAdicional")
        println("Telefone fixo: $telefoneFixo")
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
}