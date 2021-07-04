package one.digitalinnovation.digionebank.TESTES

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - $it")
    }

   val pf = ClienteTipo.PF
    println(">> $pf ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> $pj ${pj.descricao}")
}