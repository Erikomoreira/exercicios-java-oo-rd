package exercicio01;

import java.util.Set;
import java.util.TreeSet;

public class Fibonacci {

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     *
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     *
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return int[]
     */
    public int[] getSequenciaFibonacciDe(int tamanho) {

        int a = 1;
        int b = 1;

        int vetor[] = new int [tamanho];

        for ( int i = 0; i < tamanho; i++ ) {
            b = b + a;
            a = b - a;
            vetor[i]= a;
        }

        return vetor;

    }

}
