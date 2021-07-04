package one.digitalinnovation.digionebank.TESTES

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)
}