import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Nome:");
        String nome = ler.next();
                System.out.println("Digite a Marca:");
        String marca = ler.next();
                System.out.println("Digite a Descricao:");
        String descricao = ler.next();
                System.out.println("Digite o Preco:");
        double preco = ler.nextDouble();

        Electrodoméstico electrodoméstico = new Electrodoméstico(nome, marca, descricao, preco);
        System.out.println(electrodoméstico.toString());
        
    }
}
