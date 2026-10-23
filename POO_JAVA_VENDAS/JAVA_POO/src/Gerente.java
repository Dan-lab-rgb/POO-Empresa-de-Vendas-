public class Gerente extends Funcionario {
    private Double bonificacao;

    public Gerente(String nome, String cpf, Double bonificacao) {
        super(nome, cpf);
        this.bonificacao = bonificacao;
    }

    @Override 
    public double calcularSalario() {
        double salarioMinimo = 1621.00;
        return (6 * salarioMinimo) + bonificacao;
    }
}
