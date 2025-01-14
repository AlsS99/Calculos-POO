package PescaEs;

public class Local {
     //Atributos
     String endereco;
     String cidade;
     String cep;
     String latitude;
     String longitude;
 
     //Construtor cria objeto
     Local(String endereco, String cidade, String cep,
      String latitude, String longitude){

        //this variavel local da classe, inicializando os atributos
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;

     }//iniciar atributo para criar metodo

     Local( ){///Declarando objeto de teste
        this.endereco = "Rua 1";
        this.cidade = "Oriximia";
        this.cep = "74935";
        this.latitude = "-647364";
        this.longitude = "79878";
 
    }
 
     //Metodos
     public void imprimir()  {
        System.out.println("Endereço = "+this.endereco);
        System.out.println("Cidade = "+this.cidade);
        System.out.println("Cep = "+this.cep);
        System.out.println("Latitude = "+this.latitude +" Longitude ="+ this.longitude);
         
    }

     public void checarCEP()  {
         
     }
}
