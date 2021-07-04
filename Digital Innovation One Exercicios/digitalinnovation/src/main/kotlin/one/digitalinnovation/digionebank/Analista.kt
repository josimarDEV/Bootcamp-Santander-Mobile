package one.digitalinnovation.digionebank


class Analista(
    nome: String,
    CPF: String,
    salario: Double
) : Funcionario(nome, CPF, salario){
    override fun calculoAuxilio() = salario * 0.1
}