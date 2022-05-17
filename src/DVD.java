import java.util.Scanner;

public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
        super();
    }

    public DVD(int c, double p, String n, int f) {
        super(c, p, n);
        this.nFaixas = f;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nFaixas: " + this.nFaixas;
    }

    public void setFaixas(int f) {
        this.nFaixas = f;
    }

    @Override
    public void inserirDados() {
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira o número de faixas: ");
        this.nFaixas = tec.nextInt();
        super.inserirDados();
        tec.close();
    }

    @Override
    public void printDados() {
        super.printDados();
    }
  
}
