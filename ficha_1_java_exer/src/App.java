import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Seleccione um Exercicio");
        System.out.println("Exercicio.1");
        System.out.println("Exercicio.2");
        System.out.println("Exercicio.3");
        System.out.println("Exercicio.4");
        System.out.println("Exercicio.5");
        System.out.println("Exercicio.6");
        int op = ler.nextInt();

        switch (op){
            case 1:
            exercicio1();
            break;
            case 2:
            exercicio2();
            break;
            case 3:
            exercicio3();
            break;
            case 4:
            exercicio4();
            break;
            case 5:
            exercicio5();
            break;
            case 6:
            exercicio6();
            break;
            case 7:
            exercicio7();
            break;
            case 8:
            exercicio8();
            break;
            case 9:
            exercicio9();
            break;
            case 10:
            exercicio10();
            break;

        }
          ler.close();
    }

    static void exercicio1(){
System.out.println("1.Escreva um programa que receba o valor do salario de um funcionario e o valor do salario minimo. Calcule e escreva quantos salarios minimos ganha esse funcionario.");
        System.out.println("");
              Scanner ler = new Scanner(System.in);
               System.out.println("Digite o salario do Funcionario");
               double salarioF = ler.nextDouble();
               System.out.println("Digite o salario Minimo");
               double salarioM = ler.nextDouble();
                 ler.close();
               System.out.println("O funcionário ganha aproximadamente " + salarioF/salarioM + " salários mínimos.");
    }

    static void exercicio2(){
        Scanner ler = new Scanner(System.in);
        System.out.println("2.Faça um programa que receba o nome e o salário de um funcionário, calcule e imprima o nome do funcionário e o valor do imposto de renda a ser pago, sabendo que o imposto equivale a 5% do salário");
        System.out.println("");
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = ler.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salarioF = ler.nextDouble();

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Imposto de Renda a ser pago: " + salarioF*0.05);
        ler.close();
    }

    static void exercicio3(){
 System.out.println("3.Faca um programa que receba a idade de uma pessoa em anos, calcule e imprima essa idade");
 System.out.println(""); 
    Scanner ler = new Scanner(System.in); 
       System.out.println("Digite a sua idade");
        int idade = ler.nextInt();

    System.out.println("a).Meses " + idade * 12); 
    System.out.println("b).Dias " + idade * 365); 
    System.out.println("c).Horas " + idade * 365 * 24); 
    System.out.println("d).Minutos " + idade * 365 * 24 * 60); 
    System.out.println("e).Segundos " + idade * 365 * 24 * 60 * 60); 
        ler.close();
}
   
   static void exercicio4(){
 System.out.println("4.Escreva um programa que receba dois numeros inteiros, calcule e escreva");
 System.out.println(""); 
    Scanner ler = new Scanner(System.in); 
    System.out.println("Digite o primeiro numero");
    int n1 = ler.nextInt();
    System.out.println("Digite o segundo numero");
    int n2 = ler.nextInt();

    System.out.println("a).Soma dos dois números " + (n1+n2) ); 
    System.out.println("b).Subtracção do primeiro pel)o segundo " + (n1 - n2)); 
    System.out.println("c).Subtracção do segundo pelo primeiro " + (n2 - n1)); 
    System.out.println("d).Multiplicação dos dois números " + n1*n2); 
    System.out.println("e).Divisão do primeiro pelo segundo " + n1/n2); 
    System.out.println("f).Divisão do segundo pelo primeiro " + n2/n1); 
    System.out.println("g).O primeiro elevado ao quadrado " + Math.pow(n1,2)); 
   
        ler.close();
}

   static void exercicio5(){
    System.out.println("5.Sabe-se que o quilowatt de energia custa um quinto do salario minimo. Escreva um programa que receba o valor do salario minimo e a quantidade de quilowatts gasto por uma residencia.  Calcule e imprima:");
    System.out.println(""); 
    Scanner ler = new Scanner(System.in); 
    System.out.print("Digite o valor do salário mínimo: ");
    double salarioMinimo = ler.nextDouble();

    System.out.print("Digite a quantidade de quilowatts gastos: ");
    double quilowattsGastos = ler.nextDouble();

    double valorQuilowatt = salarioMinimo / 5.0;
    double valorTotal = valorQuilowatt * quilowattsGastos;

    System.out.println("a).O valor em meticais de cada quilowatt é: " + valorQuilowatt + " meticais");
    System.out.println("b).O valor total a pagar é: " + valorTotal + " meticais");
    System.out.println("O novo valor com desconto de 15% é: " + (valorTotal - (valorTotal * 0.15)) + " meticais");
    ler.close();
   }
 
   static void exercicio6(){
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite o ano de nascimento: ");
    int anoNascimento = ler.nextInt();
    System.out.print("Digite o ano atual: ");
    int anoAtual = ler.nextInt();

    System.out.println("a).Idade em anos: " + (anoAtual - anoNascimento));
    LocalDate dataNascimento = LocalDate.of(anoNascimento, 1, 1);
    LocalDate dataAtual = LocalDate.of(anoAtual, 1, 1);      
    System.out.println("b).Idade em meses: " + ChronoUnit.DAYS.between(dataNascimento, dataAtual));
    /*System.out.println("c).Idade em dias: " + idadeDias);
    System.out.println("d).Idade em horas: " + idadeHoras);
    System.out.println("e).Idade em minutos: " + idadeMinutos);
    System.out.println("f).Idade em segundos: " + idadeSegundos);
*/    
    ler.close();
    }

   static void exercicio7(){
    Scanner ler = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = ler.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = ler.nextDouble();
        System.out.println("A área do retângulo é: " + largura * altura);
        ler.close();
  }
   
   static void exercicio8(){
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite o valor de A: ");
    double a = ler.nextDouble();
    System.out.print("Digite o valor de B: ");
    double b = ler.nextDouble();
    double c = (a + b) * b;
    System.out.println("Valor de A: " + a);
    System.out.println("Valor de B: " + b);
    System.out.println("Valor de C: " + c);
    ler.close();
   }

   static void exercicio9(){
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite o valor do cateto A: ");
    double catetoA = ler.nextDouble();
    System.out.print("Digite o valor do cateto B: ");
    double catetoB = ler.nextDouble();
    System.out.println("A hipotenusa do triângulo retângulo é: " + Math.sqrt((catetoA * catetoA) + (catetoB * catetoB)));
    ler.close();
   }
   
    static void exercicio10(){
        Scanner  ler = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto:");
        System.out.print("x1: ");
        double x1 =  ler.nextDouble();
        System.out.print("y1: ");
        double y1 =  ler.nextDouble();
        System.out.print("z1: ");
        double z1 =  ler.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto:");
        System.out.print("x2: ");
        double x2 =  ler.nextDouble();
        System.out.print("y2: ");
        double y2 =  ler.nextDouble();
        System.out.print("z2: ");
        double z2 =  ler.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double dz = z2 - z1;

        System.out.println("A distância entre os pontos é: " + Math.sqrt(dx * dx + dy * dy + dz * dz));

        ler.close();
    }
}
