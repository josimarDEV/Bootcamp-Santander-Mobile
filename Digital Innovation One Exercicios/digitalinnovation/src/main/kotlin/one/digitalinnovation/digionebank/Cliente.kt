package one.digitalinnovation.digionebank

class Cliente(
    nome:String,
    CPF: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, CPF), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String ="""
        Nome: $nome
        CPF:  $CPF
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}