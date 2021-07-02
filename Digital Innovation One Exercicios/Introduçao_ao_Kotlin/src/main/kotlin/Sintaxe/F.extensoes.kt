package Sintaxe

//prefixo fun tipo.nomeDaFunao();
//cria uma função que só pode ser referenciado dentro da função através da palavra this;

fun String.randomCapitalizesLetter() =
    this[(0..this.length-1).random()].toUpperCase()