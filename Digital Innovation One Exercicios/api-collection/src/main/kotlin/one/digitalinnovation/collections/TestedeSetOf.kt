package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val homem = setOf(joao, pedro)  //está colocando os funcionários  em uma lista
    val mulher = setOf(maria)   //está colocando as funcionárias em uma lista

    val resultUnion = homem.union(mulher)  //esta unindo todos os funcionarios em uma lista
    resultUnion.forEach { println(it) }

    println("===========================")

    val todosfuncionarios = setOf(joao, pedro, maria)

    val resultsubtract = todosfuncionarios.subtract(mulher)   //esta tirando as funcionarias de todos os funcionarios
    resultsubtract.forEach { println(it) }

    println("===========================")

    val resultintersect = todosfuncionarios.intersect(mulher) //esta pegando de todos os funcionarios e só mostrando as mulheres
    resultintersect.forEach { println(it) }
}
