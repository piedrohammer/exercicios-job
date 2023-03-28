package exercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int num;
        int fant, fatual, fprox;
        int contador;

        System.out.print("Digite um número para ver faz parte da sequência Fibonacci: ");
        num = new Scanner(System.in).nextInt();

        /* inicializacoes */
        fant = 0;
        fatual = 1;
        contador = 1;

        boolean estaNaSquencia = false;

        while (contador < num) {

            fprox = fatual + fant; /* proximo numero de Fibonacci */
            fant = fatual;
            fatual = fprox;
            if (num == fprox) {
                estaNaSquencia = true;
            }
            contador++;
        }

        if ((num == 1) || (num == 2) || (num == 3)) {
            estaNaSquencia = true;
        }

        if (estaNaSquencia) {
            System.out.println("O número " + num
                    + " faz parte da sequencia Fibonacci");
        } else {
            System.out.println("O número " + num
                    + " NÃO faz parte da sequencia Fibonacci");
        }

    }
}
