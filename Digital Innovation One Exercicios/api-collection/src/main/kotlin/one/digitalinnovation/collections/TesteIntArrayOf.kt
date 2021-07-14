package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf( 1, 5, 3, 10, 7) //faz uma lista infinita de valores dentro, basta colocar valores, sem precisar de adicionar um tamanho.

    values.forEach { it->
        println(it)
    }
    println("=================")

    values.sort()
    values.forEach {it->
        println(it)
    }
}