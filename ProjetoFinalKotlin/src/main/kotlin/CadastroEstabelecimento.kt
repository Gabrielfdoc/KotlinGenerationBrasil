import BancoDeInformacoes.Companion.cnpjsCadastrados

class CadastroEstabelcimento(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    private val cnpj: String
) : Cadastro(nome, login, senha, telefone) {

    init {
        if (cnpjsCadastrados.contains(cnpj))
            throw IllegalArgumentException("\nCNPJ já cadastrado!\n")

        println("\nEstabelecimento cadastrado com sucesso!\n")
        cnpjsCadastrados.add(cnpj)
    }

    fun criarPostagem(post: String) {

        if (post.isBlank()) {
            println("\nO post não pode estar em branco!\n")
        } else {
            val postagem = "Estabelecimento $nome postou:\n$post"
            Postagens.postagens.add(postagem)
        }
    }

    fun deletarPostagem(postDeletado: Int) {
        Postagens.postagens.removeAt(postDeletado)
    }

    /*
    fun editarPostagem(id: Int){
        for (postagem in CadastroMedico.postagens){
            if(CadastroMedico.postagens.indexOf(postagem) == id){
                print("Digite o novo post: ")
                val novaPostagem = readln()
                CadastroMedico.postagens.add(novaPostagem)
                CadastroMedico.postagens.remove(postagem)
                break
            }
        }
    }
    */

    override fun toString(): String {
        return "Estabelecimento: $nome, CNPJ: $cnpj "
    }
}