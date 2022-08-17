class Ex4 {
    fun ex4() {
        println("Execução do exercicio abaixo: \n")

        var pesquisas = 0
        var pessoasCalmas = 0
        var mulheresNervosas = 0
        var homensAgressivos = 0
        var outrosCalmos = 0
        var nervososAcimaDe40 = 0
        var calmosAbaixoDe18 = 0

        while (pesquisas <= 5) {
            println("Digite a sua idade: ")
            val idade = readln().toInt()

            var sexo: String = "s"
            println("Digite o seu sexo abaixo: \n")
            println("1 - Feminino")
            println("2 - Masculino")
            println("3 - Outros")

            when (readln()) {
                "1" -> sexo = "Feminino"
                "2" -> sexo = "Masculino"
                "3" -> sexo = "Outros"
                else -> {
                    println("O sexo escolhido não existe!")
                }
            }

            var humor: String = "s"
            println("Escolha a opção abaixo que mais se adequa a você: \n")
            println("1 - Se você se considera calmo")
            println("2 - Se você se considera nervoso")
            println("3 - Se você se considera agressivo")

            when (readln()) {
                "1" -> humor = "Calmo"
                "2" -> humor = "Nervoso"
                "3" -> humor = "Agressivo"
                else -> {
                    println("A opção escolhida não existe!")
                }
            }
            if (humor == "Calmo")
                pessoasCalmas += 1
            if (sexo == "Feminino" && humor == "Nervoso")
                mulheresNervosas += 1
            if (sexo == "Masculino" && humor == "Agressivo")
                homensAgressivos += 1
            if (sexo == "Outros" && humor == "Calmo")
                outrosCalmos += 1
            if (idade >= 40 && humor == "Nervoso")
                nervososAcimaDe40 += 1
            if (idade <= 18 && humor == "Calmo")
                calmosAbaixoDe18 += 1

            pesquisas++
        }
        println("O número de pessoas calmas é: $pessoasCalmas")
        println("O número de mulheres nervosas é: $mulheresNervosas")
        println("O número de homens agressivos é: $homensAgressivos")
        println("O número de pessoes de outros genêros calmes é: $outrosCalmos")
        println("O número de com mais de 40 anos e nervosas é: $nervososAcimaDe40")
        println("O número de pessoas calmas abaixo de 18 anos é: $calmosAbaixoDe18")
    }
}