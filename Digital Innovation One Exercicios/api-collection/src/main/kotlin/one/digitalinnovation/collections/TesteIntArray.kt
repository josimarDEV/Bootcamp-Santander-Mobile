package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5) //aqui vou ter uma lista de valores de tipo Inteiro
    values[0] = 1
    values[1] = 5
    values[2] = 3
    values[3] = 8
    values[4] = 2

    for (valor in values) //vai pegar cada valor que tem nos values de [0] a [4]
        println(valor)
    println("=========================")

    values.forEach {it ->         //para cada valor em values vai mostrar-los
        println(it)
    }
    println("=========================")

    for (index in values.indices) // vai mostrar cada indices dentro de values
        println(values[index])
    println("=========================")

    values.sort()  // aqui vai ordenar os valores em cada values, do menor para o maior
    for (valor in values) //vai mostrar os valores ordenados
        println(valor)
}