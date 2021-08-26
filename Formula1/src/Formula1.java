/* Uma equipe da Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no tanque de um de seus carros para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento.
Escreva um programa (EM QUALQUER LINGUAGEM) que leia o comprimento da pista (em metros), o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L).
Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. Considere que o número de voltas entre os reabastecimentos é o mesmo.
*/

import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pista, voltas, reabastecimentosD;
        double consumo;

        System.out.println("Olá equipe, qual é o tamanho da pista, em metros? ");
        pista = in.nextInt();

        System.out.println("E qual é o número de voltas para o grande prêmio? ");
        voltas = in.nextInt();

        System.out.println("Legal demais, qual o consumo do carro, em Km/L? ");
        consumo = in.nextFloat();

        System.out.println("Quantos reabastecimentos vocês estão planejando nesta etapa? ");
        reabastecimentosD = in.nextInt();

        double carro = consumo * 1000;
        double distanciaPercorrida = pista * voltas;
        double litrosTotal = distanciaPercorrida / carro;
        double numLitros = litrosTotal / reabastecimentosD;

        System.out.println("O número mínimo de litros que você precisa até o primeiro reabastecimento é: \n" + numLitros + " Litros");


    }

}

//Aqui está o teste do commit

