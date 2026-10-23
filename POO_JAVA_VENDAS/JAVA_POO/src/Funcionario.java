
import java.time.LocalDateTime;

public class Funcionario {
    private String nome;
    private String cpf;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDateTime getEntrada() {
        return entrada;  
    }
         
    
    public LocalDateTime getSaida() {
        return saida;  
    }

    public void registrarEntrada() {
        entrada = LocalDateTime.now();

    }


      public void registrarSaida() {
        saida = LocalDateTime.now();

    }

    public double calcularSalario() {
        return 0.0;
    }
}

