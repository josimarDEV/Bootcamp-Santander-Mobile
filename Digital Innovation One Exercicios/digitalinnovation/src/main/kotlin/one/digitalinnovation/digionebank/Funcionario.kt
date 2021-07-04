package one.digitalinnovation.digionebank


abstract class Funcionario(
     nome:String,
     CPF:String,
    val salario: Double
) : Pessoa(nome, CPF) {
    abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome $nome
        CPF  $CPF
        Salário $salario
        Auxílio ${calculoAuxilio()}
    """.trimIndent()
}

