import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    
    public Midia() {
    }

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Nome: " + this.nome + "\nPreço: " + this.preco + "\nCódigo: " + this.codigo;
    }

    public void printDados() {
        System.out.println(this.getTipo());
        System.out.println(this.getDetalhes());
    }

    public void inserirDados() {
        Scanner tec = new Scanner(System.in);

        System.out.print("Insira o nome: ");
        this.nome = tec.nextLine();
        System.out.print("Insira o preço: ");
        this.preco = Double.parseDouble(tec.nextLine());
        System.out.print("Insira o Código: ");
        this.codigo = tec.nextInt();
        tec.close();

    }

    
}
