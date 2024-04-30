import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do salário base:  ");
        int salarioBase = scanner.nextInt();
        System.out.println("Informe o valor do salário pretendido pelo candidato:  ");
        int salarioPretendidoPeloCandidato = scanner.nextInt();

        System.err.println(salarioBase);
        System.out.println(salarioPretendidoPeloCandidato);

        scanner.close();
    }
}
