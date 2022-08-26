import BancoDeInformacoes.Companion.cpfsCadastrados
import BancoDeInformacoes.Companion.crmMedicosCadastrados
import Postagens.Companion.postagens

class CadastroMedico(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    private val cpf: String,
    private val crm: String
) : Cadastro(nome, login, senha, telefone) {

    init {
        if (cpfsCadastrados.contains(cpf)) {
            throw IllegalArgumentException("\nCPF já cadastrado!\n")
        } else if (crmMedicosCadastrados.contains(crm)) {
            throw IllegalArgumentException("\nCRM já cadastrado!\n")
        }
        println("\nMédico cadastrado com sucesso!\n")
        cpfsCadastrados.add(cpf)
        crmMedicosCadastrados.add(crm)
    }

    fun criarPostagem(post: String) {

        if (post.isBlank()) {
            println("\nO post não pode estar em branco!\n")
        } else {
            val postagem = "Médico $nome postou:\n$post"
            postagens.add(postagem)
        }
    }

    fun deletarPostagem(postDeletado: Int) {
        postagens.removeAt(postDeletado)
    }

    /*
    fun editarPostagem(id: Int){
        for (postagem in postagens){
            if(postagens.indexOf(postagem) == id){
                print("Digite o novo post: ")
                var novaPostagem = readln()
                novaPostagem += "(editado)"
                //postagens.add(novaPostagem)
                postagens.remove(postagem)
                this.criarPostagem(novaPostagem)
                break
            }
        }
    }
    */

    override fun toString(): String {
        return "Médico: $nome, CRM: $crm "
    }
}