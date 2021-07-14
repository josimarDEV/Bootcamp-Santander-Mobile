package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String> (3) {""} // criando uma lista de tipo string colocando o tamanho e o tipo
    nomes[0] = "Maria"
    nomes[1] = "Zezé"
    nomes[2] = "Antoniel"

    for (nome in nomes)
        println(nome)
    println("=======================")

    nomes.sort()
    nomes.forEach {it->
        println(it)
    }
    println("==========================")

    val nomes2 = arrayOf("Maria", "Zezé", "Antoniel")// criando uma lista de tipo string

    for (nome1 in nomes2)
        println(nome1)
    println("============================")

    nomes2.sort()
    for (nome2 in nomes2)
    println(nome2)
}