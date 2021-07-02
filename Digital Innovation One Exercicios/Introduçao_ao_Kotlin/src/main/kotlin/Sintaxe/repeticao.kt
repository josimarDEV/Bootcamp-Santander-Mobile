package Sintaxe

//Repetição
//While, do..while, for e forEach;
//estruturas similares às convencionais em outras linguagens;
//aceita os comandos in, range,until,downTo e step

//for(variavelIndexadora in/until/downTo faixa de valores/condicional step intervalo)
//in: conta do valor inicial até o valor final estabelecido
//until: conta do valor atual até o valor estabelecido menos 1
//downto: conta de maneira decrescente
//step: determina o intervalo a ser contado

fun main() {
    //for( i in 0..20){
    //print("$i ")
    //}
letters()
}
fun downTo(){
    for (i in 20 downTo 0){
        print("$i ")
    }
}

fun until(){
    for (i in 0 until 21 step 2)
        print("$i ")
}

fun step(num:Int){
    for (i in 0..20 step num){
        print("$i ")
    }
}

fun letters(){
    val sArray = "Olha essa string!"
    //tamanho do array
    //casa posição do array
    for (l in sArray){
        //l[index]
        print(l.toUpperCase())
    }
}