package Sintaxe

//String possuem diversos métodos associados;
//indexação, concatenação, comparação, formatação;
//pode ser concatenada com puls/+;


//também é tratada como um array de char;
//Indexação: String como array; // first(), last(), strung.length, string[index]

//fun main() {
//    val s = "josimar"
//    println(s.first()) //chamo a primeira letra que no caso é o (j)
//    println(s[0]) //retornar a primeira letra lembrando que começa sempre pelo "0" que é o (j)

 //   println(s.last()) //retorna a ultima letra (r)
 //   println(s[s.length-1]) // retorna a ultima letra (r) chamando string.length-1
//}

//concatenação
//para oncatenar duas strings o plus/+ pode ser utilizado;
//para concatenar uma variável a uma string, os símbolos ${} devem ser inseridos;

//fun main() {
//    val name = "josimar"
//    val s = "Bom Dia!"

//    println(s + name) //usando + só irá juntas as palavras sem dar espaço
//    println(s + " "+ name) //agora juntará com spaço

//    println("$s, Seja Bem vindo!  $name") //agora juntará com spaço simplificado
//    println("${s}, ${name}.") //outra forma de concatenar
//}

//Formatação
//capitalização de strings  // altera a formatação entre minúsculas e maiúsculas  //capitaliza(), toUpperCase(), toLowerCase(), and decapitalize()

//fun main(){
//    val nome = "josimar"
//    println(nome.toUpperCase())//colooca tudo em maiúscula
//    println(nome.capitalize()) //coloca a primeira letra em maiúscula
//    println(nome.decapitalize()) //coloca a primeira letra em minúscula
//    println(nome.toLowerCase()) //coloca tudo em minúscula
//}

//Remoção de espaços //remove espaços vazios e caracteres indadequados para impressão //trimEnd(), trimStart(), trim()

fun main(){
    val name = "    feliz natal    "
    println("${name.trimEnd()} ${"oi"}") // retira os espaços do final
    println(name.count())//contar as strings dentro de name
    println("${name.trimStart()} ${"oi"}") //retirar os espaços do inicio
    println("${name.trim()} ${"oi"}") //retira os espaços do inicio e do final
}