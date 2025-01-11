/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

 import java.util.Scanner;
 
public class Funcao1Grau {
     public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
                
        Scanner ler = new Scanner(System.in);
                
        System.out.printf("x = ");
        n1 =ler.nextInt();
                
        System.out.printf("a = ");
        n2 =ler.nextInt();
                
        System.out.printf("b = ");
        n3 =ler.nextInt();
                
        int resultado_funcao = (n2*n1) + n3;
                
        System.out.printf("f(%d) = %d * (%d) + %d\n", n1,n2,n3);
        System.out.printf("f(%d) = %3d", n1, resultado_funcao);
     }            
}
