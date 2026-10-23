public class Consultor extends Funcionario {
    private Double valorHora;
    private int horasTrabalhadas;

 public Consultor(String nome, String cpf, Double valorHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override 
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

}
  