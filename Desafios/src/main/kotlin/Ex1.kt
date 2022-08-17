import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Ex1 {
    fun ex1() {

        val dataAtual = LocalDate.now()

        print("Informe os anos: ")
        val guardaAnos = readln().toLong()

        print("Informe os meses: ")
        val guardaMeses = readln().toLong()

        print("Informe os dias: ")
        val guardaDias = readln().toLong()

        val dataDeNascimento = dataAtual.minusYears(guardaAnos).minusMonths(guardaMeses).minusDays(guardaDias)

        val diasDeVida = dataDeNascimento.until(dataAtual, ChronoUnit.DAYS)

        println("Você tem $diasDeVida dias de vida.")
    }
}