package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João", 2000.0, "CLT")             //esta chamando a class funcionario
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<funcionario>()          //chamando a class Repositoro e mudando a chamada do T, para funcionario

    repositorio.create(joao.nome, joao)   //esta adicionando elementos em nosso repositorio
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))  //esta imprimindo elementos adicionado antes no repositorio por chamada

    println("================================")
    repositorio.findAll().forEach{ println(it) }  //esta encontrando todos os elementos do mapa criado

    println("================================")
    repositorio.remove(maria.nome)   // removendo elementos do mapa
    repositorio.findAll().forEach { println(it) }
}