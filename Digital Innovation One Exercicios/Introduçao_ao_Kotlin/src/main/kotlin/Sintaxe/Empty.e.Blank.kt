package Sintaxe

//métodos de comparação;
//string está vazia, em branco ou é nula?

//se o tamanho da string(s.length) for 0 está empty e blank
//se o tamanho for >0 mas todos os espaços em brancos está blank mais não empty

fun main() {
    val s =""
    println(s.isEmpty()) //esta verificando se a variavel s está vazia! retornou "True"
    println(s.isBlank()) //esta verficando se a variavel s está em branco" retornou "True"
    println(s.length)

    val r = "   "
    println(r.isEmpty()) //retornou false, porquue não esta vazio
    println(r.isBlank()) //retournou True, porque está em branco
    println(r.length)
}