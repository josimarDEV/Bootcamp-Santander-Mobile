package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    val salarios1 = listOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println(salarios.somatoria())

    println("=======================")
    println(salarios.media())

    println("=======================")
    println(salarios1.somatoria())

    println("=======================")
    println(salarios1.media())
}