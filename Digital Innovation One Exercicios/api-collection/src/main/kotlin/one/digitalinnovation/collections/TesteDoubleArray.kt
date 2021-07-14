package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)//cria uma lista de numeros Double
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach {
        println(it)
    }

    println("=================")

    salarios.forEachIndexed { index, salario -> //muda os valores de salarios criado acima e adiciona 10%
        salarios[index] = salario * 1.1
    }

    salarios.forEach {
        println("%.2f".format(it)) //imprimir salarios com o aumento de 10%, formatado com 2 numeros depois da virgula
    }

    println("=======================")

    val salarios2 = doubleArrayOf(1000.0, 3000.0, 500.0)

    salarios2.forEach {
        println(it)
    }

    println("======================")

    salarios2.sort()
    salarios2.forEach {
        println(it)
    }
}

