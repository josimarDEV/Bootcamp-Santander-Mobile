package one.digitalinnovation.digionebank.TESTES

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val josimar = Analista(nome = "Josimar", CPF = "123.123.123.11",salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(josimar)
}

