package Sintaxe
//se valor está presente em uma lista ou uma faixa(range) de valores;
//Range cria um intervalo de valores que inicia no primeiro parâmetro e acaba no segundo.
//contém in
//não contem !in
//range/faixa de valores int..int

//fun main() {
  //  val numbers = listOf(3, 9, 0, 1, 2)
    //println(12 in numbers) // 12 na lista //false

    //println(12 in 0..20 ) //estou verificando si entre 0 a 20 tem o numero 12;
//}

fun main(){
    val bingo = listOf(8,6,34,14,2,12)
    var number = (1..34).random()

    println(number)
    println(number in bingo)
    if (number in bingo)
    println("parabens você ganhou!!") // exemplo da professora só com auteração si a pessoa ganhou ou não!
    else
        println("infelizmente voçê não ganhou!!")
}