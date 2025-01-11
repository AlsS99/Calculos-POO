/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.util.Scanner;


public class Media {
    public static void main(String [] args)  {
        double n1;
        double n2;
        
        System.out.println("Algoritmo para calcular a media entre dois numeros");
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Digite o primeiro numero:");
        n1 = ler.nextDouble();
        
        System.out.printf("Digite o segundo numero:");
        n2 = ler.nextDouble();
        
        double media = (n1 + n2)/2;
        
        System.out.printf("O valor da media é %.2f, mediaS");
    }    
        
}
