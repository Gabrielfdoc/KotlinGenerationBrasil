class Postagens {

    companion object {
        val postagens = mutableListOf<String>()

        fun listarPostagens(): String {
            var posts = ""
            for ((id, postagem) in postagens.withIndex()) {
                posts += "ID: $id - $postagem\n"
            }
            return posts
        }
    }
}