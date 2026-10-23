public class Vendedor extends Funcionario {
    private Double comissao;
    private int numVendas;

    public Vendedor(String nome, String cpf, Double comissao, int numVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numVendas = numVendas;
    }

    @Override 
    public double calcularSalario() {
        double salarioMinimo = 1621.00;
        return salarioMinimo + (comissao * numVendas);
    }
}
