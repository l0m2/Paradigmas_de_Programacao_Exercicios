public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
int[] numeros = new int[5];
double[] valores = new double[10];
String[] nomes = new String[3];
MinhaClasse[] objetos = new MinhaClasse[7];
numeros[0] = 10;    
valores[3] = 3.14;    
nomes[2] = "Alice";   
int primeiroNumero = numeros[0];  

 char letra = 'A';

        if (Character.isUpperCase(letra)) {
            System.out.println(letra + " é uma letra maiúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println(letra + " é uma letra minúscula.");
        } else {
            System.out.println(letra + " não é uma letra.");
        }
//para palavras
     for (char caractere : palavra.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                contemMaiusculas = true;
            } else if (Character.isLowerCase(caractere)) {
                contemMinusculas = true;
            }

            if (contemMaiusculas && contemMinusculas) {
                break;
            }
        }
    }
}
