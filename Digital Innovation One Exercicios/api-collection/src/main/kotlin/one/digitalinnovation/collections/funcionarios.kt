package one.digitalinnovation.collections

data class funcionario(
    val nome: String,
    val salario: Double,
    val tipodecontratacao: String
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}