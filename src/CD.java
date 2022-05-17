import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    
    public CD() {
        super();        
    }
    
    public CD(int c, double p, String n, int m) {
        super(c, p, n);
        this.nMusicas = m;
    }
    
    @Override
    public String getTipo() {
        return "CD";
    }
    
    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nMusicas: " + this.nMusicas;
    }
    
    public void setMusicas(int m) {
        this.nMusicas = m;
    }

    @Override
    public void printDados() {
        super.printDados();
    }

    @Override
    public void inserirDados() {
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira quantidade de Músicas: ");        
        this.nMusicas = tec.nextInt();
        super.inserirDados();
        tec.close();
    }
       
    
}
