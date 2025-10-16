package aula3.exercicio1;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o modelo do carro:");
    String modeloCarro = teclado.nextLine();

    System.out.println("Digite o ano do carro:");
    int anoCarro = teclado.nextInt();

    System.out.println("Qual é a quantidade de portas do carro? (Digite aqui):");
    int portas = teclado.nextInt();
    teclado.nextLine();

    Carro c1 = new Carro(modeloCarro, anoCarro, portas);
    c1.imprimirDetalhes();

    System.out.println("\nDigite o modelo da moto:");
    String modeloMoto = teclado.nextLine();

    System.out.println("Digite o ano da moto:");
    int anoMoto = teclado.nextInt();

    System.out.println("Digite a cilindrada da moto:");
    int cilindradas = teclado.nextInt();

    Moto m1 = new Moto(modeloMoto, anoMoto, cilindradas);
    m1.imprimirDetalhes();

    teclado.close();
  }
}