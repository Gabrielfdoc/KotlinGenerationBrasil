import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class ClienteTest {

    private val cliente = Cliente(
        "Jorge",
        "São Paulo",
        "4002-8922"
    )

    @BeforeEach
    fun inicializacao() {
        cliente.adicionarProduto("Nescau")
        cliente.adicionarProduto("Ração Extra Premium")
        cliente.adicionarProduto("Banco Imobiliário")
    }

    @Test
    fun adicionarProdutoTest() {

        val listaEsperada = mutableListOf("Jogos", "Nescau", "Ração Extra Premium", "Banco Imobiliário")

        cliente.adicionarProduto("Jogos")

        // Não funciona se for levar em consideração a ordem ->
        // assertArrayEquals(listaEsperada.toTypedArray(), cliente.listaDeCompras.toTypedArray())
        assertTrue(listaEsperada.containsAll(cliente.getListaDeCompras()))
    }

    @Test
    fun adicionarErroProdutoTest() {

        //Sempre que quiser pegar um println() do método
        val output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))

        cliente.adicionarProduto("")

        assertTrue(output.toString().contains("O produto digitado é inválido!\n"))
    }

    @Test
    fun removerProdutoTest() {

        System.setIn(ByteArrayInputStream("Nescau".byteInputStream().readBytes()))

        val listaEsperada = mutableListOf("Ração Extra Premium", "Banco Imobiliário")

        cliente.removerProduto()

        assertArrayEquals(listaEsperada.toTypedArray(), cliente.getListaDeCompras().toTypedArray())
    }

    @Test
    fun removerProdutoErroTest() {

        //Sempre que quiser simular um readln() do método
        System.setIn(ByteArrayInputStream("Toddy".byteInputStream().readBytes()))
        val output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))

        cliente.removerProduto()

        assertTrue(output.toString().contains("O produto Toddy não está na sua lista de compras!\n"))
    }

    @Test
    fun validaChecarDados() {

        val output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))

        Cliente(
            "Cleber",
            "f",
            "f"
        )

        assertTrue(output.toString().contains("\nCliente cadastrado com sucesso!\n"))
    }

    @Test
    fun validaErroChecarDados() {

        val output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))

        val mensagemEsperada = "O nome não pode estar em branco!"

        val exception = org.junit.jupiter.api.assertThrows<IllegalArgumentException> {
            Cliente(
                "",
                "",
                ""
            )
        }
        assertEquals(mensagemEsperada, exception.message)
    }

    @Test
    fun testaGet() {
        assertEquals("Jorge", cliente.nome)
        assertEquals("São Paulo", cliente.endereco)
        assertEquals("4002-8922", cliente.telefone)
    }
}