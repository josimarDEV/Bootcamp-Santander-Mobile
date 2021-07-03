package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "josimar"
    var cpf:String = "123.123.123.11"
    private set

}

fun main() {
    val josimar = Pessoa()

    println(josimar.nome)
    println(josimar.cpf)
}