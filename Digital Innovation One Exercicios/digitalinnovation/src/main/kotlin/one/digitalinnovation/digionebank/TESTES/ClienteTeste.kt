package one.digitalinnovation.digionebank.TESTES

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val josimar = Cliente(
        nome = "Josimar",
        CPF = "123.123.123.11",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(josimar)

    AutenticacaoTeste().autentica(josimar)
}