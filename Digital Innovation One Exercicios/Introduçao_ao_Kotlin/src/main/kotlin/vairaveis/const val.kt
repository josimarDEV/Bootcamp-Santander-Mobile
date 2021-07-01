//constante cujo valor é atribuido durante compilação  //valor imutável
const val MAX_AGE = 90  // não tem como colocar o const val dentro da "fun main" se não dará erro
fun main() {
    var MAX_AGE = 30 //não da pra mudar o valor da variavel do const val, porque é umutável
    println(MAX_AGE)
}

//valor definido durante a compilação
//ex: const val MIN_AGE = 16
//    const val MAX_AGE = 68