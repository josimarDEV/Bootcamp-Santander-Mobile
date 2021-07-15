package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João", 2000.0, "CLT")             //esta chamando a clss funcionario
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)     //está listando as pessoas de funcionario, para mostrar seus elementos contido dentro da class funcionario
     funcionarios.forEach { println(it) }

    println("================")

    println(funcionarios.find { it.nome == "João" }) //está encontando um nome dentro da class funcionario

    println("=============================")

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) } //está ordenando pelo salario do menor para o maior

    println("=============================")

    funcionarios
        .groupBy { it.tipodecontratacao } //esta colocando em lista agrupada por CLT e uma por PJ
        .forEach { println(it) }
}


