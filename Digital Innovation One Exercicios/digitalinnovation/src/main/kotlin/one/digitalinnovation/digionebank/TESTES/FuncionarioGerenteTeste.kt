package one.digitalinnovation.digionebank.TESTES

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val josimar = Gerente(nome = "Josimar", CPF = "123.123.123.11",salario = 5000.0, senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(josimar)

    AutenticacaoTeste().autentica(josimar)
}

