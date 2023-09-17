public class Electrodoméstico {
    private String nome;
    private String marca;
    private String descricao;
    private double preco;

    public Electrodoméstico(String Nome, String Marca, String Descricao, double Preco){
        this.nome = Nome;
        this.marca = Marca;
        this.descricao = Descricao;
        this.preco = Preco;
    }

       
    public String toString() {
        return "Nome:_" + nome + ", Marca:_"+ marca + ", Descricao:_" + descricao + ", Preco:_" + preco + "MT ";
    }
}
