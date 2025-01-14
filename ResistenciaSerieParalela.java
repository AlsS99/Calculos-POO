package calculo;

import java.util.Scanner;

public class ResistenciaSerieParalela {
    public static void main(String [] args)  {
    double r1,r2,r3;
        String sair="S";
        Scanner ler = new Scanner(System.in);

        while(sair.equals("S")){ //True; pode usar doWhile; 
        
            System.out.println("Resistencia em Serie Paralelo");
        
            System.out.println("digite um valor");
            r1 = ler.nextDouble();
        
            System.out.println("digite digite um valor ");
            r2 = ler.nextDouble();
        
            System.out.println("digite digite um valor ");
            r3 = ler.nextDouble();
        
            System.out.println("Escolha a opção:");
            System.out.println(" 1 ou 2 ");
        
            String opcao = ler.next();
            double resistencia;
       
            switch (opcao) {
            case "1": {
                resistencia = r1 + r2 + r3;
                break;
            }
            case "2": {
                resistencia =(1/r1)+(1/r2)+(1/r3);
                break;//forçar sair do switch
            }
            default:{
                System.out.println("Opção invalida");
                resistencia = 0;
            }}
        }
        
        /*System.out.println("digite ");
        if(opcao == 1 ) { //circuto esta em serie
            resistencia = r1 +r2 +r3;
        }else {
            resistencia = (1/r1)+(1/r2)+(1/r3);
        }*/

    
        System.out.println("Resistencia total é igual a "+resistencia);

        System.out.println("Deseja continuar? S = sim e n = não");
        sair = ler.next();

        if(sair.equals("n")) {// sair == "N"
            break;
        }
     
    }                
}
