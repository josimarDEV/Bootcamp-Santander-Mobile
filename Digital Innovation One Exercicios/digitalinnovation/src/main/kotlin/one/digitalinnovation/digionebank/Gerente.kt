package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    CPF: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, CPF = CPF, salario = salario),Logavel  {
    override fun calculoAuxilio() = salario * 0.4

    override fun login(): Boolean = "senha123" == senha
}