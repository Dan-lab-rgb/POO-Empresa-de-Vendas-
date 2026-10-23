
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Vendedor("João", "11111111111", 50.0, 20));
        funcionarios.add(new Consultor("Maria", "22222222222", 40.0, 160));
        funcionarios.add(new Gerente("Carlos", "33333333333", 2000.0));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        for (Funcionario funcionario : funcionarios) {

            funcionario.registrarEntrada();
            funcionario.registrarSaida();

            System.out.println("Nome: " + funcionario.getNome());

            if (funcionario instanceof Vendedor) {
                System.out.println("Tipo: vendedor");
            } else if (funcionario instanceof Consultor) {
            } else if (funcionario instanceof Gerente) {
                System.out.println("Tipo: Gerente");
            }

            System.out.println("Entrada: " + funcionario.getEntrada().format(formato));

            System.out.println("Saida: " + funcionario.getSaida().format(formato));

            System.out.printf("Salario: R$ %.2f%n", funcionario.calcularSalario());

            System.out.println("Tipo: " + funcionario.getClass().getSimpleName());

            System.out.printf(
                    "Salário: R$ %.2f%n",
                    funcionario.calcularSalario()
            );

            System.out.println("--------------------------");
        }
    }

}
