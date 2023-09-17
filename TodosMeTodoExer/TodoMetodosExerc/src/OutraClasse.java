import java.util.Scanner;

public class OutraClasse {
    static double metedoComParamentroRetorno(double c, double l){
        return (c * l);
    }

    static void metedoComParamentroSemRetorno(double c, double l){
        System.out.println("Metedo Com Paramentros Sem retorno: " +(c*l));
    }

    static void metedoSemParamentrosSemRetorno(){
          Scanner ler = new Scanner(System.in);
       System.out.println("Digite a comprimento:");
       double comprimento = ler.nextDouble();
        System.out.println("Digite a largura:");
       double largura = ler.nextDouble();
       System.out.println("Metedo Sem paramentros Com retorno: " +(comprimento*largura));
           ler.close();
    }

      static double metedoSemParamentrosComRetorno(){
        Scanner ler = new Scanner(System.in);
       System.out.println("Digite a comprimento:");
       double comprimento = ler.nextDouble();
        System.out.println("Digite a largura:");
       double largura = ler.nextDouble();
       ler.close();
       return (comprimento*largura);
          
    }
}
