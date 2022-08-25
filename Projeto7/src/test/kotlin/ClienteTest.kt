import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import java.io.BufferedInputStream
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

        assertEquals(3, cliente.listaDeCompras.size)
        assertTrue(cliente.listaDeCompras.contains("Nescau"))

    }

    @Test
    fun removerProdutoTest() {

        System.setIn(ByteArrayInputStream("Nescau".byteInputStream().readBytes()))

        val listaEsperada = mutableListOf("Ração Extra Premium", "Banco Imobiliário")

        cliente.removerProduto()

        assertArrayEquals(listaEsperada.toTypedArray(), cliente.listaDeCompras.toTypedArray())
    }

    @Test
    fun removerProdutoErroTest() {

        System.setIn(ByteArrayInputStream("Toddy".byteInputStream().readBytes()))
        val output = ByteArrayOutputStream()
        System.setOut(PrintStream(output))

        cliente.removerProduto()

        assertTrue(output.toString().contains("O produto Toddy não está no estoque!\n"))
    }
}