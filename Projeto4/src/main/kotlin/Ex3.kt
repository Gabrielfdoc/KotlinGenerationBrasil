class Ex3 {
    fun ex3() {
        println("Execução do exercicio abaixo: \n")

        var idadeAte21 = 0
        var idadeAcima50 = 0

        print("Digite a idade (Para encerrar digite -99): ");
        var idade = readln().toInt()

        while (idade != -99) {
            print("Digite a idade (Para encerrar digite -99): ");
            idade = readln().toInt()

            if(idade < 21)
                idadeAte21++
            if(idade > 50)
                idadeAcima50++
        }
        println("O total de pessoas com menos de 21 anos é: $idadeAte21")
        println("O total de pessoas com mais de 50 anos é: $idadeAcima50")
    }
}