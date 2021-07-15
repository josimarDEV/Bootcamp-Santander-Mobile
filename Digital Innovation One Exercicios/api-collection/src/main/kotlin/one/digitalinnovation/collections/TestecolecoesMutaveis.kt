package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    println("================List============")

    val funcionarios = mutableListOf(joao, pedro)    //formando uma lista mutavel atráves dos elementos acima
    funcionarios.forEach { println(it) }

    println("================================")

    funcionarios.add(maria)          //adicionando mais elemntos em nossa lista, só funciona si for uma lista mutavel
    funcionarios.forEach { println(it) }

    println("================================")

    funcionarios.remove(joao)        //removendo elementos de nossa lista, só funciona si for uma lista mutavel
    funcionarios.forEach { println(it) }

    println("===============Set=================")

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("================================")

    funcionarioSet.add(maria)
    funcionarioSet.add(pedro)

    funcionarioSet.forEach { println(it) }

    println("================================")

    funcionarioSet.remove(joao)
    funcionarioSet.forEach { println(it) }
}