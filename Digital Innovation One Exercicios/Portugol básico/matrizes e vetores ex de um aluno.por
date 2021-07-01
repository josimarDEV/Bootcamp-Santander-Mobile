programa
//olá
{

    funcao inicio()
    {
        cadeia cadastro[][] = {
            {
                "João",
                "São Paulo",
                "(11) 9999-5241"
            },
            {
                "Maria",
                "Ribeirão Petro",
                "(16) 9999-8596"
            },
            {
                "Ana",
                "Manaus",
                "(92) 9999-8574"
            }
        }

        inteiro linha = 0, coluna = 0

        para (linha = 0; linha <= 2; linha++)
		{
			para (coluna = 0; coluna <= 2; coluna++)
			{
				escreva(cadastro[linha][coluna], ", ") // Exibe o valor contido na posição da matriz
			}
			escreva ("\n")
		}

    }

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */