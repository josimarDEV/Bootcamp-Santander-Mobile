package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce { acc, valor -> acc + valor  }     //criando uma funcao que ira somar tudo que esta dentro de uma arrayof

fun Array<BigDecimal>.media() =   //vai tirar a media de tudo que estiver dentro de uma arrayof
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()

fun List<BigDecimal>.somatoria() = this.reduce { acc, valor -> acc + valor  } //criando uma funcao que ira somar tudo que esta dentro de uma listof

fun List<BigDecimal>.media() =   //vai tirar a media de tudo que estiver dentro de uma listof
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()