package Sintaxe

//Atribuição
//o valor atribuido tem que estar na ultima linha do bloco;
//a condicional pode não usarchaves se só fizer a atribuição.

//fun main() {
//    val a = 5
//    val b = 8
//    if (a>b) else if (a<b)  {
//        val MaxValue = if (a > b) a else if (a < b) b else b //verfica quem é o maior valor
//        println("$MaxValue é o maior valor")
//    }
//    else{
//        val minValue = if (a > b) println("$b é o menor valor") else if (a < b) println("$a é o menor valor") else println("Os valores são iguais")
//    }
//}

//when
//equivalente ao switch de outras linguagens;
//aceita tanto valores quanto condicionais;
//aceita range como case

fun main() {
    val valor = (0..10).random()
    println(valor.getStudentStatus())

}
fun Int.getStudentStatus():String{
    println("nota $this")

    return when(this){
        in 0..4 -> "Reprovado"
        in 5..7 -> "Mediano"
        in 8..9 -> "Bom"
        10 -> "Excelente"
       else -> "Indefinido"

    }
}

//elvis operator
//o mais proximo que a linguagem possui de um operador ternário;
//verifica se um valor é nulo e apresenta uma opçao caso seja;
//pode ser encadeado;
//val a:Int? = null
//val c:Int? = 9
//var number =a?: b?: 0

//fun main() {
//    val t:Int
//    val x:Int? = 30
//    val w:Int? = null
 //   t = x?:w?:-2
 //   println(t)
//}

