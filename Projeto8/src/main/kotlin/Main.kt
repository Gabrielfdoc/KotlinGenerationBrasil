val cavalos = mutableListOf<Cavalo>()
val cachorros = mutableListOf<Cachorro>()
val preguicas = mutableListOf<Preguica>()

fun main() {

    try {

        while (true) {

            println()
            println("1 - Cadastrar dados de um novo cavalo")
            println("2 - Cadastrar dados de um novo cachorro")
            println("3 - Cadastrar dados de uma nova preguiça")
            println("4 - Fazer com que determinado animal se movimente")
            println("5 - Fazer com que determinado animal emita um som")
            println("6 - Exibir dados de todos os animais de um tipo cadastrado")
            println("7 - Sair")

            when (readln()) {
                "1" -> subMenuCadastrarCavalo()
                "2" -> subMenuCadastrarCachorro()
                "3" -> subMenuCadastrarPreguica()
                "4" -> subMenuescolheAnimalParaMovimentar()
                "5" -> subMenuescolheAnimalParaEmitirSom()
                "6" -> subMenuescolheAnimalParaExibir()
                "7" -> break
                else -> println("A opção escolhida não existe!")
            }
        }
    } catch (e: Exception) {
        println(e.message)
    }
}

private fun exibeCavalos() {
    for (cavalo in cavalos) {
        println("Nome: ${cavalo.nome}")
    }
}

private fun exibeCachorros() {
    for (cachorro in cachorros) {
        println("Nome: ${cachorro.nome}")
    }
}

private fun exibePreguicas() {
    for (preguica in preguicas) {
        println("Nome: ${preguica.nome}")
    }
}

private fun cadastrarCavalo() {

    println()
    print("Digite o nome do cavalo: ")
    val nome = readln()
    print("Digite a idade do cavalo: ")
    val idade = readln()

    val cavalo = Cavalo(
        nome,
        idade,
        true
    )
    cavalos.add(cavalo)
}

private fun subMenuCadastrarCavalo() {

    cadastrarCavalo()
    while (true) {

        println("1 - Se deseja adicionar um novo cavalo")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> cadastrarCavalo()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun cadastrarCachorro() {

    println()
    print("Digite o nome do cachorro: ")
    val nome = readln()
    print("Digite a idade do cachorro: ")
    val idade = readln()

    val cachorro = Cachorro(
        nome,
        idade,
        true
    )
    cachorros.add(cachorro)
}

private fun subMenuCadastrarCachorro() {

    cadastrarCachorro()
    while (true) {

        println("1 - Se deseja adicionar um novo cachorro")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> cadastrarCachorro()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun cadastrarPreguica() {

    println()
    print("Digite o nome da preguiça: ")
    val nome = readln()
    print("Digite a idade da preguiça: ")
    val idade = readln()

    val preguica = Preguica(
        nome,
        idade,
        true
    )
    preguicas.add(preguica)
}

private fun subMenuCadastrarPreguica() {

    cadastrarPreguica()
    while (true) {

        println("1 - Se deseja adicionar uma nova preguiça")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> cadastrarPreguica()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun subMenuescolheAnimalParaExibir() {
    escolheAnimalParaExibir()

    while (true) {

        println("1 - Se deseja escolher novos animais para exibir")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> escolheAnimalParaExibir()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun escolheAnimalParaExibir() {

        println("1 - Se deseja exibir os dados de todos os cavalos cadastrados")
        println("2 - Se deseja exibir os dados de todos os cachorros cadastrados")
        println("3 - Se deseja exibir os dados de todas as preguiças cadastradas")

        when (readln()) {
            "1" -> {
                var contador = 0
                for (cavalo in cavalos) {
                    contador++
                    println("Cavalo $contador ")
                    println(cavalo)
                }
            }
            "2" -> {
                var contador = 0
                for (cachorro in cachorros) {
                    contador++
                    println("Cachorro $contador ")
                    println(cachorro)
                }
            }
            "3" -> {
                var contador = 0
                for (preguica in preguicas) {
                    contador++
                    println("Preguiça $contador ")
                    println(preguica)
                }
            }
            else -> println("A opção escolhida não existe!\n")
        }
}

private fun subMenuescolheAnimalParaMovimentar() {
    escolheAnimalParaMovimentar()

    while (true) {

        println("1 - Se deseja escolher um novo animal para movimentar")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> escolheAnimalParaMovimentar()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun escolheAnimalParaMovimentar() {

        println("1 - Se deseja movimentar um cavalo")
        println("2 - Se deseja movimentar um cachorro")
        println("3 - Se deseja movimentar uma preguiça")

        when (readln()) {
            "1" -> {
                exibeCavalos()

                print("Insira o nome do cavalo que deseja locomover: ")
                val nomeCavaloLocomocao = readln()

                val cavaloLocomocao: Cavalo? = cavalos.firstOrNull {
                        cavalo -> cavalo.nome == nomeCavaloLocomocao }

                if (cavaloLocomocao != null) {
                    cavaloLocomocao.locomovendo()
                } else {
                    println("Este cavalo não existe!")
                }
            }
            "2" -> {
                exibeCachorros()

                print("Insira o nome do cachorro que deseja locomover: ")
                val nomeCachorroLocomocao = readln()

                val cachorroLocomocao: Cachorro? = cachorros.firstOrNull {
                        cachorro -> cachorro.nome == nomeCachorroLocomocao }

                if (cachorroLocomocao != null) {
                    cachorroLocomocao.locomovendo()
                } else {
                    println("Este cachorro não existe!")
                }
            }
            "3" -> {
                exibePreguicas()

                print("Insira o nome da preguiça que deseja locomover: ")
                val nomePreguicaLocomocao = readln()

                val preguicaLocomocao: Preguica? = preguicas.firstOrNull {
                        preguica -> preguica.nome == nomePreguicaLocomocao }

                if (preguicaLocomocao != null) {
                    preguicaLocomocao.locomovendo()
                } else {
                    println("Esta preguiça não existe!")
                }
            }
            else -> println("A opção escolhida não existe!\n")
        }
}

private fun subMenuescolheAnimalParaEmitirSom() {
    escolheAnimalParaEmitirSom()

    while (true) {

        println("1 - Se deseja escolher um novo animal para emitir som")
        println("2 - Se deseja sair")

        when (readln()) {
            "1" -> escolheAnimalParaEmitirSom()
            "2" -> break
            else -> println("A opção escolhida não existe!\n")
        }
    }
}

private fun escolheAnimalParaEmitirSom() {

        println("1 - Se deseja emitir o som de um cavalo")
        println("2 - Se deseja emitir o som de um cachorro")
        println("3 - Se deseja emitir o som de uma preguiça")

        when (readln()) {
            "1" -> {
                exibeCavalos()

                print("Insira o nome do cavalo que deseja que emita som: ")
                val nomeCavaloEmiteSom = readln()

                val cavaloEmiteSom: Cavalo? = cavalos.firstOrNull {
                        cavalo -> cavalo.nome == nomeCavaloEmiteSom }

                if (cavaloEmiteSom != null) {
                    cavaloEmiteSom.emitindoSom()
                } else {
                    println("Este cavalo não existe!")
                }
            }
            "2" -> {
                exibeCachorros()

                print("Insira o nome do cachorro que deseja que emita som: ")
                val nomeCachorroEmiteSom = readln()

                val cachorroEmiteSom: Cachorro? = cachorros.firstOrNull {
                        cachorro -> cachorro.nome == nomeCachorroEmiteSom }

                if (cachorroEmiteSom != null) {
                    cachorroEmiteSom.emitindoSom()
                } else {
                    println("Este cachorro não existe!")
                }
            }
            "3" -> {
                exibePreguicas()

                print("Insira o nome da preguiça que deseja que emita som: ")
                val nomePreguicaEmiteSom = readln()

                val preguicaEmiteSom: Preguica? = preguicas.firstOrNull {
                        preguica -> preguica.nome == nomePreguicaEmiteSom }

                if (preguicaEmiteSom != null) {
                    preguicaEmiteSom.emitindoSom()
                } else {
                    println("Esta preguiça não existe!")
                }
            }
            else -> println("A opção escolhida não existe!\n")
        }
}