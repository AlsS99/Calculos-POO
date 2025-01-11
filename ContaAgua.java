/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.util.Scanner;
public class ContaAgua {
    public static void main(String [] args) {

        System.out.println("Faixa de Consumo (por m2)");
        System.out.println(" ate 10\n 11 a 30\n 31 a 100\n 101 em diante\n");
            
        System.out.println("Preço (por m2)");
        System.out.println(" incluido na franquia\n R$1,00\n R$2,00\n R$5,00\n");

        
        System.out.println("Digite quanto voce gastou de agua");
        Scanner ler = new Scanner(System.in);

        double gasto = ler.nextDouble();
        double pagar = 0;
           
        if(gasto <10) {// se gasto for menor que 10
            pagar +=7;//pagar 7 reias da franquia
        }else
        
        if(gasto<30) {
            pagar +=7;
            pagar +=(gasto-10)*1;
        }else

        if(gasto<100) {
            pagar +=7;
            pagar +=20;
            pagar +=(gasto-30)*2;
        }else

        if(gasto<100) {
            pagar +=7;
            pagar +=20;
            pagar +=140;
            pagar +=(gasto-100)*5;
        }
        System.out.printf("O valor total a pagar é R$%.2f", +pagar);


      
       
            




    }
}
