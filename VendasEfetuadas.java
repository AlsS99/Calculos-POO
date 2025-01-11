
package calculo;

import java.util.Scanner;

public class VendasEfetuadas {
    
    public static void main(String [] args) {
        
        double salario_fixo, total_venda_mes, comissao,pagamento;
        String nome;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.next();

        System.out.println("digite seu salario fixo :  ");
        salario_fixo = ler.nextDouble();
        
        System.out.println("digite  o total de vendas no mes: ");
        total_venda_mes = ler.nextDouble();
        
        comissao=total_venda_mes*0.15;
        pagamento=salario_fixo+comissao;

        System.out.printf("Total  do pagamento = %.2f",pagamento);

  
     
    }                
}
