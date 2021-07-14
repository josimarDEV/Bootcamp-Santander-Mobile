package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0, 2500.0)

    salarios.forEach {salario->
        println(salario)
    }

    println("=============================")

    println("Maior Salário: ${"%.2f".format(salarios.maxOrNull())}")     //pega o maior valor em salario
    println("Menor Salário: ${"%.2f".format(salarios.minOrNull())}")     //pega o menor valor em salario
    println("Média Salárial: ${"%.2f".format(salarios.average())}")      //pega a media na lista salarios

    println("=============================")

    val salariomaiorque2500 = salarios.filter {it > 2500.0 }       //filtra os valores que são maior que 2500
    salariomaiorque2500.forEach{
        println(it)
    }
}