import BancoDeInformacoes.Companion.cpfsCadastrados
import Postagens.Companion.postagens

class CadastroUsuario(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    private val cpf: String
) : Cadastro(nome, login, senha, telefone) {

    init {
        if (cpfsCadastrados.contains(cpf))
            throw IllegalArgumentException("\nCPF já cadastrado!\n")

        println("\nCPF cadastrado com sucesso!\n")
        cpfsCadastrados.add(cpf)
    }

    override fun toString(): String {
        return "Usuário: $nome, CPF: $cpf"
    }

    fun adicionarComentario(id: Int, comentario: String): String {
        try {
            for (post in 0..postagens.size) {
                if (post == id - 1) {

                    var postmodificado = postagens[post]
                    postagens.removeAt(post)

                    postmodificado += "\nComentário: $comentario - Autor: $nome"
                    postagens.add(postmodificado)
                    return "\nComentário de $nome adicionado com sucesso!\n"
                }
            }
            return ""
        } catch (e: Exception) {
            throw Exception("Id do post não encontrado nas postagens")
        }
    }
}