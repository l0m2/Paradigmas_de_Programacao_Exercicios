import java.util.Scanner;
public class App {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
     
       System.out.println("Digite a comprimento:");
       double comprimento = ler.nextDouble();
        System.out.println("Digite a largura:");
       double largura = ler.nextDouble();
       System.out.println();
       System.out.println("Metodo com paramentro e Retorno" + metedoComParamentroRetorno(comprimento, largura));
       metedoComParamentroSemRetorno(comprimento, largura);
       metedoSemParamentrosSemRetorno();
 /*       double mspsr = metedoSemParamentrosComRetorno();
       System.out.println("Metedo sem paramentro com Retorno " + mspsr );*/
        ler.close();

        System.out.println("********2.Metodos vindo de outra classe********");
        OutraClasse classe = new OutraClasse();
        System.out.println("Metodo com paramentro e Retorno" + classe.metedoComParamentroRetorno(comprimento, largura));
        classe.metedoComParamentroSemRetorno(comprimento,largura);
        classe.metedoSemParamentrosSemRetorno();


        System.out.println("Seleccione uma Opcao");
           System.out.println("1.Metodo com Paramentro e com Retorno");
           System.out.println("2.Metodo com paramentro sem retorno");
           System.out.println("3.Seleccione uma Opcao");
           System.out.println("4.Seleccione uma Opcao");
           int op = ler.nextInt();
           switch(op){
            case 1:
            OutraClasse.metedoComParamentroRetorno(comprimento, largura);
            break;
            case 2:
            OutraClasse.metedoComParamentroSemRetorno(comprimento, largura);
            break;
            case 3:
            break;
            case 4:
            break;
           }

    }

    static double metedoComParamentroRetorno(double c, double l){
        return (c * l);
    }

    static void metedoComParamentroSemRetorno(double c, double l){
        System.out.println("Metedo Com Paramentros Sem retorno: " +(c*l));
    }

    static void metedoSemParamentrosSemRetorno(){
 
       System.out.println("Digite a comprimento:");
       double comprimento = ler.nextDouble();
        System.out.println("Digite a largura:");
       double largura = ler.nextDouble();
       System.out.println("Metedo Sem paramentros Com retorno: " +(comprimento*largura));
           ler.close();
    }

      static double metedoSemParamentrosComRetorno(){
    
       System.out.println("Digite a comprimento:");
       double comprimento = ler.nextDouble();
        System.out.println("Digite a largura:");
       double largura = ler.nextDouble();
       ler.close();
       return (comprimento*largura);     
    }
}
